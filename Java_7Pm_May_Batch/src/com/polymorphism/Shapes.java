package com.polymorphism;

public class Shapes {
	
	public void area(double length, double width) {

		double result = (length * width);
		
		System.out.println("Area Of Rectangle:- " + result);
		
	}
	
	public static void main(String[] args) {
		
		Shapes obj = new Shapes();
		
		obj.area(23.3, 20.4);
		
	}

}
