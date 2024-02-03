package com.innerclass;

public class Outer2 {
	
//	void Display() {
//		
//		class Inner {
//			
//		    void innerDisplay() {
//		    	
//		    	System.out.println("Hello Students");
//	
//		    }
//			
//		}	
//		
//		
//		
// 		
//	}
	
	int a = 10;
	
	static int c = 100;
	
	
	
	void method1() {
		
		System.out.println("Normal Method");
		
		int b = 5;
		
		System.out.println(b);
		
	}
	
	static void method2() {
		
		System.out.println("Static Method");
		
	}
	
	public static void main(String[] args) {
		
		Outer2 obj = new Outer2();
		
		System.out.println(obj.a);
		
		obj.method1();
		
		// Static 
		
		System.out.println(c);
		
		method2();
		
	}
}


