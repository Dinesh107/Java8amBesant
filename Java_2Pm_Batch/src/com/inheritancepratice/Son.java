package com.inheritancepratice;

public class Son extends Father {
	
	public void bikeV() {

		System.out.println("Vespa");
	}
	
	public static void main(String[] args) {
		
		Son obj = new Son();
		
		obj.car();
		
		obj.land();
		
		obj.bike();
		
	}
}
