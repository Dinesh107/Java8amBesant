package com.keywords;

public class ThisChild extends SuperParent {
	
	int a = 20;
	
	public void number2() {

		System.out.println("Child Method");
		
		System.out.println(super.a); // Parent Class refrence 
		
	}
	
	@Override
	public void number1() {

		super.number1();
		
		this.number2(); // invoking the child method or current class method
	}

	public static void main(String[] args) {
		
		ThisChild obj = new ThisChild();
		
	// 	obj.number2();
		
		obj.number1();
	}

}
