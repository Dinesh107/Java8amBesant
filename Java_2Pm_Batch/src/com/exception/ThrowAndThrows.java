package com.exception;

public class ThrowAndThrows {
	
	
	public static void validate(int age) throws Exception {
		
	   if(age>18) {
			
			throw new Exception("404 error");
			
		} else {
			
			System.out.println("Your Are not Eligible For Vote");
			
		}
		
}
	
    public static void main(String[] args) throws Exception {

    	
    	validate(20);
    	
    }

}
