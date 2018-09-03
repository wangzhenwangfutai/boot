package com.example.demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlert {
	
	@ExceptionHandler(value=Exception.class)
	public void exceptionHandler(Exception e){
		System.out.println(e.getMessage());
	}

}
