package com.example;

public class AutoCloseExample {

	static class Alpha implements AutoCloseable {
		
		void show() throws Exception {
			System.out.println("show()...");
			throw new Exception();
		}
		
		@Override
		public void close() throws Exception {
			System.out.println("close()...");
		}
	}
	
	public static void main(String[] args) {
		
		//Alpha a = new Alpha();
		
		try (Alpha a = new Alpha();) {
			a.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
