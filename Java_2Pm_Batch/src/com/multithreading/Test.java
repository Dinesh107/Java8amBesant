package com.multithreading;

public class Test {
	
	static void display() {  // 3
		
		System.out.println("Hello"); // 4
		
	}
	
	public static void main(String[] args) {  // 1 
		
		display();  // 2
		
		System.out.println("Students"); // 5
	}

}
