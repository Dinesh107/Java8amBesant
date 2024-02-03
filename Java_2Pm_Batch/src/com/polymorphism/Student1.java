package com.polymorphism;

public class Student1 extends College {

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
		
		Student1 obj = new Student1();
		
		obj.studentName("jaga");
		
		obj.studentDetails(20, 5.5f, 70);
		
		obj.studentMarks(1180, 480);
		
		
	}

	
	

}
