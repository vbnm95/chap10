package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class ExceptionExample {
	
	public static void main(String[] args) {
		String url = "";
		String user = "scott";
		String passwd = "tiger";
		
		try {
			Connection conn = DriverManager.getConnection(url, user, passwd);
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
		}
		
		System.out.println("End...");
		
	}
	public static void main3(String[] args) {
		System.out.println("Start...");
		System.out.print(">>");
		
		Scanner scan = new Scanner(System.in);
		
		try {
			int num = scan.nextInt();
			System.out.println("num =" + num);
		} catch(Exception err) {
			System.out.println("Error: " + err);
		}
		
		scan.close();
		System.out.println("End...");
		
	}
	
	public static void main2(String[] args) {
		System.out.println("Start");
		
		System.out.println(100/0);
		
		System.out.println("End");
	}
}
