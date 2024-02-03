package com.polymorphism;

public class College {
	
	public void studentName(String name) {

		System.out.println(name);
		
	}
	
	public void studentDetails(int age, float height, String fathername) {
		
		System.out.println(age + " " + height + " " + fathername);

	}
	
	public void studentMarks(int tenthmark, int twelthmark) {

		System.out.println(tenthmark + " " + twelthmark);
		
	}
	
	public static void main(String[] args) {
		
		College obj = new College();
		
		obj.studentName("Suresh");
		
		obj.studentDetails(21, 5.5f, "Sivan");
		
		obj.studentMarks(450, 1099);
		
	}

}
