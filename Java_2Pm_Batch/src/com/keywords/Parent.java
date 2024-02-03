package com.keywords;

public class Parent {
	
	int a = 23;
	
	public void num1() {

		int b = 89;
		
		System.out.println(b);
		
		System.out.println(a);
		
	}
	
	
	public static void main(String[] args) {
		
		Parent obj = new Parent();
		
		obj.num1();
		
	}

}
