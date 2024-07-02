import { startOfYear, endOfYear } from "date-fns";

export const getYearRange = (year) => {
  const startDate = startOfYear(new Date(year, 0, 1));
  const endDate = endOfYear(new Date(year, 11, 31));
  return { startDate, endDate };
};

export const getMonthRange = (month, year) => {
  const startDate = new Date(year, month, 1);
  const endDate = new Date(year, month + 1, 1);
  return { startDate, endDate };
};
