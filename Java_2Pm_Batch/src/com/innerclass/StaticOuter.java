package com.innerclass;

public class StaticOuter {
	
	static int x = 10;
	
	int y = 20;
	
	static class Inner {
		
		void display() {
			
		    System.out.println(x);
			
		}
		
	}

}
