package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String passwd = "tiger";
		
		try(Connection conn = DriverManager.getConnection(url, user, passwd)) {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp");
			
			Thread.sleep(1000);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("End...");
	}
	
	public static void main3(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String passwd = "tiger";
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url, user, passwd);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp");
			
			Thread.sleep(1000);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("End...");	
	}
	
	public static void main2(String[] args) {
		
		try { 
			System.out.println(10/0);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally");
		}
		
		System.out.println("End...");
	}
}
