package com.example.problemdetail.iiiproblemdetail.errorhandler;

import jakarta.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppErrorHandler {

	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = RuntimeException.class)
	public ProblemDetail handleInvalidValueError(RuntimeException ex, HttpServletRequest request){
		request.getHeaderNames().asIterator().forEachRemaining(System.out::println);

		ProblemDetail pd = ProblemDetail.forStatus(HttpStatus.BAD_REQUEST);
		pd.setDetail(ex.getMessage());
		pd.setTitle(HttpStatus.BAD_REQUEST.getReasonPhrase());
		pd.setProperty("timestamp",LocalDateTime.now());
		return pd;
	}
}
