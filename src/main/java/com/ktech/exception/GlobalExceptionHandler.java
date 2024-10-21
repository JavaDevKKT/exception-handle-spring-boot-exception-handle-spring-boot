package com.ktech.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	@ExceptionHandler(Exception.class)
	public String handleError(Exception exception) {
		String message = exception.getMessage();
		logger.error(message);
		return "message";
	}

	@ExceptionHandler(ArithmeticException.class)
	public String handleArithmeticException(Exception e) {
		String message = e.getMessage();
		logger.error(message);
		return "message";
	}
}
