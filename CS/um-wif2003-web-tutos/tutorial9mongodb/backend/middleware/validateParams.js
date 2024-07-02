import Joi from "joi";
import { StatusCodes } from "http-status-codes";

export const yearSchema = Joi.object({
  year: Joi.string()
    .length(4)
    .regex(/^\d{4}$/)
    .required(),
});

export const monthYearSchema = Joi.object({
  monthYear: Joi.string()
    .length(7)
    .regex(/^(0[1-9]|1[0-2])-\d{4}$/)
    .required(),
});

export const validateParams = (schema) => (req, res, next) => {
  const { error } = schema.validate(req.params);
  if (error) {
    return res
      .status(StatusCodes.BAD_REQUEST)
      .json({ message: error.details[0].message });
  }
  next();
};
