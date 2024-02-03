package com.exceptionhandling;

public class ExceptionHandling {

	public static void main(String[] args) {

		try {
			
			int a = 6;
			
			int b = 2;
			
			System.out.println(a/b);
			
		} catch (Exception w) {
			
			w.printStackTrace();
			
		} 
		
		finally {
			
			System.out.println("Developer and Tester Refrence");
			
		}
		
		System.out.println("---------------------------------");
		
        int c = 6;
		
		int d = 6;
		
		System.out.println(c+d);
	
		
	}

}
