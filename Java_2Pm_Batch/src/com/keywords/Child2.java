package com.keywords;

public class Child2 extends Parent {
	
	int a = 7;
	
	int b = 9;
	
	public void num2() {

		System.out.println(super.a);
		
		System.out.println(this.a);
		
	}
	
	
	
	@Override
	public void num1() {
		
		this.num2();  // invoke

	}



	public static void main(String[] args) {
		
		Child2 obj = new Child2();
		
		obj.num1();
		
	}

}
