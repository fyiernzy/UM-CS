import bcrypt from "bcryptjs";
import { User } from "../models/user.js";

export async function findUserByUsername(username) {
  return User.findOne({ username });
}

export async function createUser(username, hashedPassword) {
  const newUser = new User({
    username: username,
    password: hashedPassword,
  });
  return newUser.save();
}

export async function hashPassword(password) {
  const salt = await bcrypt.genSalt(10);
  return bcrypt.hash(password, salt);
}
export async function comparePassword(password, hash) {
  return bcrypt.compare(password, hash);
}
