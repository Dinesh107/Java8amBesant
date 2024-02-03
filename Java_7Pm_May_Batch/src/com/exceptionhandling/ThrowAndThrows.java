package com.exceptionhandling;

public class ThrowAndThrows {
	
	
	public static void validate(int age) throws Exception {

		if(age>=18) {
			
			throw new Exception("404 - Page Not Found");
			
		} else {
			
			System.out.println("You Cannot Vote");
			
		}
		
	}

	public static void main(String[] args) throws Exception {
		
		validate(20);
		
	}

}
