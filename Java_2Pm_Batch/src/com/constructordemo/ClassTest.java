package com.constructordemo;

public class ClassTest {
	
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(10,5);
		
//		r.length = 10;
//		
//		r.breadth = 5; 
		
//		r.setLength(3);
//		
//		r.setBreadth(3);
		
		System.out.println("the area of rectangle is:- " + r.area());
		
		System.out.println("the perimeter of rectangle is:- " + r.perimeter());
		
		System.out.println("It is square:- " + r.isSquare());
		
	}

}
