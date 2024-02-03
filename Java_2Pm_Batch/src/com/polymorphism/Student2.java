package com.polymorphism;

public class Student2 extends College {
	
	@Override
	public void studentName(String name) {

		super.studentName(name);
	}

	@Override
	public void studentDetails(int age, float height, int weight) {

		super.studentDetails(age, height, weight);
	}

	@Override
	public void studentMarks(int twelthm, int tenthm) {

		super.studentMarks(twelthm, tenthm);
	}
	
	
	public static void main(String[] args) {
		
		Student2 obj = new Student2();
		
		obj.studentName("aravind");
		
		obj.studentDetails(20, 5.8f, 75);
		
		obj.studentMarks(1183, 490);
		
		
	}

}
