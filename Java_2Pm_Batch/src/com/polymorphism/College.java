package com.polymorphism;

public class College {
	
	public void studentName(String name) {

		System.out.println(name);
		
	}
	
	public void studentDetails(int age, float height, int weight) {

		System.out.println(age + " " + height + " " + weight);
		
	}
	
     public void studentMarks(int twelthm, int tenthm) {

    	 System.out.println(twelthm + " " + tenthm);
    	 
	}
     
     public static void main(String[] args) {
		
    	 College obj = new College();
    	 
    	 obj.studentName("Dinesh");
    	 
    	 obj.studentDetails(20, 5.3f, 62);
    	 
    	 obj.studentMarks(290, 587);
    	 
	}
}
