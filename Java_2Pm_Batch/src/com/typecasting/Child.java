package com.typecasting;

public class Child extends Parent {
	
	public void num2() {

		System.out.println("Child Method");
		
	}
	
	public static void main(String[] args) {
		
//		Child obj = new Child();  // object
		
	 //   Child obj = new Parent();  // downcasting
	    
	    Parent obj = new Child();  // upcasting 
	    
	    obj.num1();
		
	}

}
