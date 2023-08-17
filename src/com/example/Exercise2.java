package com.example;

public class Exercise2 {

	static void xxx() {
		try {
			System.out.println("try...");
			return;
		} catch(Exception e) {
			
		} finally {
			System.out.println("finally...");
		}
	}
	
	public static void main(String[] args) {
		xxx();
	}
}
