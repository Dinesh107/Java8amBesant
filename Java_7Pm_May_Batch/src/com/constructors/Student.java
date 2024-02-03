package com.constructors;

public class Student {
	
	
	 public Student() {   // non - parameterized Constructor or default constructor

	      System.out.println("non - parameterized Constructor or default constructor");
	 
	 }
		

	public Student(String name) {  // parameterized Constructor
		 
		 System.out.println("Hai I am " + name);
		 
		 
	 }
	
	public Student(int age) {  // parameterized Constructor
		 
		 System.out.println(age);
		 
		 
	 }
	 
	 public static void main(String[] args) {
		
		 
		Student obj1 = new Student(); 
		
		Student obj2 = new Student("Parameterized Constructor");
		 
		Student obj3 = new Student(20);
		 
	}
	 
}
