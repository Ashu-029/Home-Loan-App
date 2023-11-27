package com.admin.exception;

public class DuplicateKeyException extends RuntimeException{

	public DuplicateKeyException(String msg1){
		super(msg1);
	}
	
	public DuplicateKeyException() {
		super("Resource not found!!!");
	}
}
