import cors from "cors";
import dotenv from "dotenv";
import express from "express";
import mongoose from "mongoose";
import authRoutes from "./routes/auth.js";
import transactionRoutes from "./routes/transactionRoutes.js";

dotenv.config();

const app = express();
const PORT = process.env.PORT || 5050;
const MONGO_URL = process.env.MONGO_URL;

app.use(cors());
app.use(express.json());
app.use("/api/auth", authRoutes);
app.use("/api/transactions", transactionRoutes);

mongoose
  .connect(MONGO_URL)
  .then(() => {
    console.log(`Connected to MongoDB`);
    app.listen(PORT, () => {
      console.log(`Server running on port ${PORT}`);
    });
  })
  .catch((err) => {
    console.error("Database connection error:", err);
  });
