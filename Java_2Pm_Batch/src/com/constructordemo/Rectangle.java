package com.constructordemo;

public class Rectangle {
	
	private int length;
	
	private int breadth;
	
	public Rectangle() {
		
		length = 1;
		
		breadth = 1;
	}
	
	public Rectangle(int l, int b) {
		
		length = l;
		
		breadth = b;
		
	}
	
	int getLength() {
		
		return length;
		
	}
	

	public void setBreadth(int b) {
		
		if(b>0) {
			
			breadth = b; 
			
		} else {
			
			breadth = 0;
			
		}
		
	}
	
    int getBreadth() {
		
		return breadth;
		
	}
	
	public void setLength(int l) {
		
		if(l>0) {
			
			length = l;
			
		} else {
			
			length = 0;
			
		}
		
	}
	
	public int area() {
		
		return length * breadth;
		
	}
	
	public int perimeter() {
		
		return 2 * (length + breadth);
		
	}
	
	public boolean isSquare() {
		
		if(length == breadth) {
			
			return true;
			
		} else {
			
			return false;
			
		}
					
	}
	

}
