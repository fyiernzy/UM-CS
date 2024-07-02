import { StatusCodes } from "http-status-codes";

StatusCodes;
export const handleServerError = (err, res) => {
  console.error(err);
  return res
    .status(StatusCodes.INTERNAL_SERVER_ERROR)
    .json({ message: "Server Error" });
};

export const handleBadRequest = (res, message) => {
  return res.status(StatusCodes.BAD_REQUEST).json({ message: message });
};
