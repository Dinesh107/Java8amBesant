package com.constructor;

public class ConstructorPractice2 {
	
	public ConstructorPractice2() {
		
		System.out.println("Default Const");
		
	}
	
     public ConstructorPractice2(int num1, int num2) { //// --> parameterized Constructor 
		
		System.out.println(num1 + " " + num2);
		
	}
	
	public void method1() {
		
		System.out.println("I am a Method");
		
	}
	
	public static void main(String[] args) {
		
		ConstructorPractice2 obj1 = new ConstructorPractice2();

		ConstructorPractice2 obj2 = new ConstructorPractice2(23, 34);
		
	}

}
