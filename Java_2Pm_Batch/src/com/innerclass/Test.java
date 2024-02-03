package com.innerclass;

public class Test {
	
	public static void main(String[] args) {
		
//		Outer o = new Outer();
//		
//		o.outerDisplay();
		
//		Outer.Inner i = new Outer().new Inner();
		
//		Outer2 o = new Outer2();
//		
//		o.Display();
		
		StaticOuter.Inner i = new StaticOuter.Inner(); // Static Inner class
		
		i.display();
		
		
		
	}

}




