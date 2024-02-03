package com.polymorphism;

public class Student2 extends College {
	
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

		Student2 obj = new Student2();
		
		obj.studentName("Mari");
		
		obj.studentDetails(21, 5.5f, "Sivan");
		
		obj.studentMarks(498, 1098);
		
	}

}
