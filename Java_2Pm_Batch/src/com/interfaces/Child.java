package com.interfaces;

public class Child implements Father, Mother {

	@Override
	public void chain() {

		System.out.println("Gold Chain");
		
	}

	@Override
	public void watch() {

		System.out.println("Fastrack");
		
	}

	public static void main(String[] args) {
		
		Child obj = new Child();
		
		obj.chain();
		
		obj.watch();
		
	}
	
}
