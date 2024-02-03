package com.constructor;

public class ConstPractice {

	public ConstPractice() { // --> non - parameterized Constructor 

	    System.out.println("Default Constructor");
	
	}
	
	public ConstPractice(int num1, int num2) { //// --> parameterized Constructor 
		
		System.out.println(num1 + " " + num2);
		
	}
	
	
     public ConstPractice(int num1, int num2, int num3) { //// --> parameterized Constructor 
		
		System.out.println(num1 + " " + num2);
		
	}
	
    public  ConstPractice(int age ) { //// --> parameterized Constructor 
		
		System.out.println(age);
		
	}
    	
	public static void main(String[] args) {

		ConstPractice s1 = new ConstPractice();
				
		ConstPractice s2 = new ConstPractice(23, 34);
		
		ConstPractice s3 = new ConstPractice(20);
		
		
	}

}
