package com.exception;

public class TryCtachPractice {

	public static void main(String[] args) {

		
		try {
			
			int a = 10;
			
			int b = 0;
			
			System.out.println(a/b);
			
		} catch (Exception a) {

			a.printStackTrace();
		}
		
		finally {
			
			System.out.println("It Will Always Run");
			
		}
	
		System.out.println("-----------*----------");
		
		System.out.println("Remaining Code");
		
	    int d = 6;
	    
	    int e = 4;
	    
	    System.out.println(d-e);
	}

}
