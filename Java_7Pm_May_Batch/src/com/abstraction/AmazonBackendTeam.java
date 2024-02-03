package com.abstraction;

public class AmazonBackendTeam extends Amazon {

	
	@Override
	public void userName() {

		super.userName();
		
	}

	@Override
	public void password() {

		System.out.println("1234567");
		
	}

	public void signUp() {

		System.out.println("First name");
		
	}
	
	public static void main(String[] args) {
		
		AmazonBackendTeam obj = new AmazonBackendTeam();
		
		obj.userName();
		
		obj.password();
		
		obj.signUp();
	}

}
