package com.typecasting;

public class Child extends Parent {
	
	public void childMethod() {

		System.out.println("Child Method");
		
	}
	
	public static void main(String[] args) {
		
//		Child obj2 = new Child();
//		
//		obj2.childMethod();
//		
//		obj2.parentMethod();
		
		
		// Upcasting And Downcasting
		
		//Upcasting 
		
		Parent obj1 = new Child(); 
		
		obj1.parentMethod();
		
		// Downcasting
		
		// Child obj2 =  new Parent(); // Downcasting Is Not Possible 
	}

}
