package com.variables;

public class VariablesPractice {
	
	int b = 20; // Class Variable, Blue Colour
	
	static int c;  // Static Variable
	
	public void localVariable() { 
		
	    int a = 10; // Local variable, Brown Colour
		
		System.out.println(a);
	
	}
	
	static void number() {  // Static Method

		System.out.println("Static Method");
		
	}

	public static void main(String[] args) {
		
//		VariablesPractice obj = new VariablesPractice();
//		
//		obj.localVariable();
//		
//		System.out.println(obj.b);
		
		number();
		
		System.out.println(c);
		
	}

}
