package com.example.demo;

public class InvalidDetailsException extends RuntimeException{
	public InvalidDetailsException() {
		super("invalid details");
	}
}
