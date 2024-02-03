package com.abstraction;

public class Child implements Father, Mother {

	@Override
	public void ring() {

		System.out.println("Gold Ring");
		
	}

	@Override
	public void chain() {

		System.out.println("Silver Chain");
		
	}

	@Override
	public void bike() {

		System.out.println("Hero Honda");
		
	}
	
	@Override
	public void car() {

		System.out.println("nano");
		
	}
	
	
	public static void main(String[] args) {
		
		Child obj = new Child();
				
	    obj.bike();
		
		obj.chain();
		
		obj.ring();
		
		obj.car();
	}

}
