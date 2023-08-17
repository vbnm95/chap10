package com.example;

import util.VT100;

public class VT100Example {
	public static void main(String[] args) {
		//VT100.cursorMove(100, 200);
		
		try {
			VT100.cursorMove(0, 10);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("End...");
	}
}
