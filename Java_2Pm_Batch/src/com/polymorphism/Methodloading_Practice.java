package com.polymorphism;

public class Methodloading_Practice {
	
	
//	public void student(String name) {
//
//		System.out.println(name);
//		
//	}
//	
//	public void student(int rollno, float height, int weight) {
//		
//		System.out.println(rollno + " " + height + " " + " " + weight);
//		
//	}
//	
//   
//    public void student(int tenthm, int twelthm)  {
//		
//		System.out.println(tenthm + " " + twelthm);
//		
//	}
	
	
	public int addition(int num1, int num2) {

		return num1 + num2;
		
	}
	
    public int addition(int num1, int num2, int num3) {

    	return num1 + num2 + num3;
		
	}
	
	
    public int addition(int num1, int num2, int num3, int num4) {

    	return num1 + num2 + num3 + num4;
		
	}
	
	
     
	
	public static void main(String[] args) {
		
		Methodloading_Practice obj = new Methodloading_Practice();
		
//		obj.student("Jagadesh");
//		
//		obj.student(1232, 5.5f, 70);
//		
//		obj.student(490, 1190);
		
		System.out.println(obj.addition(10, 20));
		
		System.out.println(obj.addition(20, 50, 10));
		
		System.out.println(obj.addition(20, 10, 56, 68));
		
	}
	
}
