package com.admin.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalExceptionHandler extends Exception {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<String>notFoundException(ResourceNotFoundException ex){
		
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
		
	}
	
	@ExceptionHandler(DuplicateKeyException.class)
    public ResponseEntity<String> handleDuplicateKeyException(DuplicateKeyException e) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
    }

}
