package com.example.problemdetail.iiold.errorhandler;

import jakarta.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppErrorHandler {

	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = RuntimeException.class)
	public ErrorResponse handleInvalidValueError(RuntimeException ex, HttpServletRequest request){
		HttpStatus status = HttpStatus.BAD_REQUEST;
		return new ErrorResponse(LocalDateTime.now(),
				status.value(),
				status.getReasonPhrase(),
				ex.getMessage(),
				request.getRequestURI()
		);
	}
}
