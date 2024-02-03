package com.oops;    // Package

public class OopsPractice {     // Class
	
    public void bike() {    // Method
		
		System.out.println("Hero Honda");    // Print Statement
		
	}
	
	public void car() {  // Method
		
		System.out.println("Maruthi");  // Print Statement
		
	}
	
	public OopsPractice() {

	   System.out.println("hey i am a default constructor");
	
	}

	public static void main(String[] args) {  // Main Method
		 
		OopsPractice obj = new OopsPractice();// Object  
		
//		OopsPractice obj2 = new OopsPractice();// Object  
//		
//		OopsPractice obj3 = new OopsPractice();// Object  
		
		obj.bike();     // Method Calling Using Obj
		
		obj.car();     // Method Calling Using Obj
		
	}
	
}
