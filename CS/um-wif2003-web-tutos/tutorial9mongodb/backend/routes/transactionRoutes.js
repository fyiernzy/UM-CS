import express from "express";
import { StatusCodes } from "http-status-codes";
import { Transaction } from "../models/Transaction.js";
import { getMonthRange, getYearRange } from "../helpers/dateHelper.js";
import {
  yearSchema,
  monthYearSchema,
  validateParams,
} from "../middleware/validateParams.js";

import { handleServerError } from "../helpers/errorHandler.js";

const router = express.Router();

router.post("/", async (req, res) => {
  try {
    const { date, type, category, description, amount } = req.body;

    const newTransaction = new Transaction({
      date: new Date(date),
      type: type,
      category: category,
      description: description,
      amount: amount,
    });

    const savedTransaction = await newTransaction.save();
    res.status(StatusCodes.CREATED).json(savedTransaction);
  } catch (err) {
    handleServerError(err, res);
  }
});

// Get all transactions
router.get("/", async (req, res) => {
  try {
    const allTransactions = await Transaction.find();
    res.status(StatusCodes.OK).json(allTransactions);
  } catch (err) {
    handleServerError(err, res);
  }
});

// Get transactions by month and year
router.get("/:monthYear", validateParams(monthYearSchema), async (req, res) => {
  const { monthYear } = req.params;
  const [month, year] = monthYear.split("-");
  try {
    const { startDate, endDate } = getMonthRange(
      parseInt(month, 10),
      parseInt(year, 10)
    );

    const transactions = await Transaction.find({
      date: {
        $gte: startDate,
        $lt: endDate,
      },
    });

    res.status(StatusCodes.OK).json(transactions);
  } catch (err) {
    handleServerError(err, res);
  }
});

// Get transactions by year
router.get("/:year", validateParams(yearSchema), async (req, res) => {
  const { year } = req.params;

  try {
    const { startDate, endDate } = getYearRange(parseInt(year, 10));

    const transactions = await Transaction.find({
      data: {
        $gte: startDate,
        $lt: endDate,
      },
    });

    res.status(StatusCodes.OK).json(transactions);
  } catch (err) {
    handleServerError(err, res);
  }
});

// Update a transaction
router.put("/:transactionId", async (req, res) => {
  const { transactionId } = req.params;
  const { date, type, category, description, amount } = req.body;
  try {
    const updatedTransaction = await Transaction.findByIdAndUpdate(
      transactionId,
      {
        type,
        amount,
        category,
        date,
        description,
      },
      { new: true, runValidators: true }
    );

    if (!updatedTransaction) {
      return res
        .status(StatusCodes.NOT_FOUND)
        .json({ message: "Transaction Not Found" });
    }

    res.status(StatusCodes.OK).json(updatedTransaction);
  } catch (err) {
    handleServerError(err, res);
  }
});

// Delete a transaction
router.delete("/:transactionId", async (req, res) => {
  const { transactionId } = req.params;
  try {
    const deletedTransaction = await Transaction.findByIdAndDelete(
      transactionId
    );
    if (!deletedTransaction) {
      req
        .status(StatusCodes.NOT_FOUND)
        .json({ message: "Transaction Not Found" });
    }
    res.status(StatusCodes.OK).json({
      message: "Transaction deleted successfully",
      transaction: deletedTransaction,
    });
  } catch (err) {
    handleServerError(err, res);
  }
});

export default router;
