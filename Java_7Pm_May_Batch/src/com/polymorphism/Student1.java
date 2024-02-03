package com.polymorphism;

public class Student1 extends College {

	@Override
	public void studentName(String name) {

		super.studentName(name);
	}

	@Override
	public void studentDetails(int age, float height, String fathername) {

		super.studentDetails(age, height, fathername);
	}

	@Override
	public void studentMarks(int tenthmark, int twelthmark) {

		super.studentMarks(tenthmark, twelthmark);
	}
	
	public static void main(String[] args) {
		
		Student1 obj = new Student1();
		
		obj.studentName("Murugan");
		
		obj.studentDetails(20, 5.5f, "Sivan");
		
		obj.studentMarks(490, 1990);
	}
	
}
