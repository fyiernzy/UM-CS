import { mongoose } from "mongoose";

const { Schema } = mongoose;

const transactionSchema = new Schema(
  {
    date: {
      type: Date,
      required: true,
    },
    type: {
      type: String,
      required: true,
      enum: ["income", "expense"],
    },
    category: {
      type: String,
      required: true,
    },
    description: {
      type: String,
      required: false,
    },
    amount: {
      type: Number,
      required: true,
    },
  },
  {
    timestamps: true,
  }
);

export const Transaction = mongoose.model("Transaction", transactionSchema);
