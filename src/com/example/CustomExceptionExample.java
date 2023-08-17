package com.example;

public class CustomExceptionExample {

	static class DivideException extends Exception {
		
		public DivideException() {
			
		}
		
		public DivideException(String msg) {
			super(msg);
		}
	}
	
	static void xxx() throws DivideException {
		throw new DivideException("사용자 예외 발생");
	}
	
	public static void main(String[] args) {
		
		try {
			xxx();
		} catch (DivideException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
