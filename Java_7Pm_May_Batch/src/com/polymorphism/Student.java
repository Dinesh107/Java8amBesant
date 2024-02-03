package com.polymorphism;

public class Student {
	
	
	public void studentDetails(String name) { // Datatype

       	System.out.println(name);	
		
	}
	
	public void studentDetails(int age, float height, String fathername) { // datatype order

       	System.out.println(age + " " + height + " " + fathername);
       		
	}
   

	public void studentDetails(int m1, int m2, int m3) { // datatype count

       	System.out.println(m1 + " " + m2 + " " + m3);	
		
	}
	
	 public static void main(String[] args) {

		Student obj = new Student();
		
	    obj.studentDetails("Ganesh");	
	    
	    obj.studentDetails(20, 5.5f, "Sivan");
		
	    obj.studentDetails(90, 99, 100);
	}

}
