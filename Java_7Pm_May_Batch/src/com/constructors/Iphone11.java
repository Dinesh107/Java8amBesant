package com.constructors;

public class Iphone11 extends Iphone10 {

	@Override
	public void camera() {
		
		System.out.println("12mp");
		
	}
	

//	public Iphone10() {
//
//	  System.out.println("parent const");
//	
//	}

	public static void main(String[] args) {

		Iphone11 obj = new Iphone11();
		
		obj.camera();
		
	}

}
