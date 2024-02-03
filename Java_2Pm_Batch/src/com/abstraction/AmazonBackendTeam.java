package com.abstraction;

public class AmazonBackendTeam extends Amazon {

	@Override
	public void password() {

		System.out.println("12344!@#");
		
	}

	@Override
	public void username() {

		super.username();
	}
	
	
	public static void main(String[] args) {
		
		AmazonBackendTeam obj = new AmazonBackendTeam();
		
		obj.username();
		
		obj.password();
		
	}
	

}
