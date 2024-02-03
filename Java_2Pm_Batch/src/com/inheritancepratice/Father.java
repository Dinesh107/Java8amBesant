package com.inheritancepratice;

public class Father extends Grandfather {
	
	public void bike() {

		System.out.println("RE 350 1947");
		
	}
	
	public static void main(String[] args) {
		
	      Father obj = new Father();
	      
	      obj.car();
  		
		  obj.land();
	}
	
}
