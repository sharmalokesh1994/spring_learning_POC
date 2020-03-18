package com.lok.springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerExceptionHandler {

	
	@ExceptionHandler
	public ResponseEntity<CustomerResponseEntity> handleException( CustomerNotFoundException exc ){
		
		CustomerResponseEntity err = new CustomerResponseEntity(exc.getMessage(),
																HttpStatus.NOT_FOUND.value(),
																System.currentTimeMillis() );
		
		return new ResponseEntity<>(err,HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler
	public ResponseEntity<CustomerResponseEntity> handleException( Exception exc ){
		
		CustomerResponseEntity err = new CustomerResponseEntity(exc.getMessage(),
																HttpStatus.BAD_REQUEST.value(),
																System.currentTimeMillis() );
		
		return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
		
	}
	
}
