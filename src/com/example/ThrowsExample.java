package com.example;

import java.sql.DriverManager;

public class ThrowsExample {

	static void cursorMove(int line, int column) throws Exception {
		if(line <= 0 || column <= 0) {
			throw new Exception("line, column은 1 이상");
		}
		
		System.out.println("처리됨");
		
	}
	
	static void connect() throws Exception {
		DriverManager.getConnection(null);
	}
	
	public static void main(String[] args) throws Exception {
		
		try {
			cursorMove(10, 20);
			cursorMove(-10, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		connect();
		
	}
}
