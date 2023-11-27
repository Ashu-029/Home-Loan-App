package com.admin.exception;

public class ResourceNotFoundException extends RuntimeException{

	
	public ResourceNotFoundException(String msg) {
		
		super(msg);
	}
	
	public ResourceNotFoundException() {
		super("Resource not found!!!");
	}
	
}
