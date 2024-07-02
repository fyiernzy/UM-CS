import express from "express";
import dotenv from "dotenv";
import jwt from "jsonwebtoken";
import { StatusCodes } from "http-status-codes";
import {
  handleServerError,
  handleBadRequest,
} from "../helpers/errorHandler.js";
import {
  findUserByUsername,
  createUser,
  hashPassword,
  comparePassword,
} from "../helpers/authHelper.js";

dotenv.config();
const router = express.Router();

router.post("/register", async (req, res) => {
  const { username, password } = req.body;
  try {
    const existingUser = await findUserByUsername(username);
    if (existingUser) {
      return handleBadRequest(res, "User already exists");
    }
    const newUser = await createUser(username, await hashPassword(password));
    res.status(StatusCodes.CREATED).json(newUser);
  } catch (err) {
    handleServerError(err);
  }
});

router.post("/login", async (req, res) => {
  const { username, password } = req.body;
  try {
    const user = await findUserByUsername(username);
    if (!user) {
      return handleBadRequest(res, "Invalid user.");
    }
    console.log(user.password);
    const isMatch = await comparePassword(password, user.password);
    if (!isMatch) {
      return handleBadRequest(res, "Invalid user or password.");
    }

    const token = jwt.sign({ userId: user._id }, process.env.JWT_SECRET, {
      expiresIn: "1h",
    });
    res.status(StatusCodes.OK).json({ token });
  } catch (err) {
    handleServerError(err);
  }
});

export default router;
