package com.scannerclass;

import java.util.Scanner;

public class UserInputClass {
	
	public static void main(String[] args) {
  
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Name:- ");

		String name = sc.nextLine();

		System.out.println("Your Name Is:- " + name);

		System.out.println("Enter Your Age:- ");

		int age = sc.nextInt();

		System.out.println("Your Age Is:- " + age);

		System.out.println("Enter Your Height:- ");

		// press ctrl + 2 and press l 

		float height = sc.nextFloat();

		System.out.println("Your Height Is:- " + height);

		System.out.println("Enter Your Initial:- ");

		char initial = sc.next().charAt(0);

		System.out.println("Your Initial Is:- " + initial);

		System.out.println("Enter Your Gender:- ");

		String gender = sc.next();

		System.out.println("Your Gender Is:- " + gender);
		
 	}
	
}
