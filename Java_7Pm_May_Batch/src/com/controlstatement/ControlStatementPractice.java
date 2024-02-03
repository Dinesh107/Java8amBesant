package com.controlstatement;

public class ControlStatementPractice {
	
	public static void main(String[] args) {
		
		// Control Statement Or Looping Statement
		
		// 3 Rules
		
		// Initialization ---> Were We Start
		
		// Condition ---> Were We Stop ---> Condition ---> If condition True The loop run, If false
		
		// Condition False It will Stop Or terminate
		
		// Iteration ----> It will Decrease or Increase the value
		
		// Increment and decrement operators
		
//		i++  = i + 1   ---> Post Increment
//		
//		i--  = i - 1    ---> Post Decrement
//		
//		++i = 1 + i --->     Pre Increment
//		
//		--i = 1 - i --->    Pre Decrement
		
		// Types Of Looping Statement
		
		// While loop, Do While, For Loop, Nested For Loop, For Each Loop
		
		// For Loop
		
		// Using For Loop Print 1 to 10
		
//		int i;
//		
//		//   st1       st2     st4
//		for(i = 1; i<=5; i = i + 1) { // i = 1, i = 2, i = 3, i = 4, i = 5, i = 6
//			
//			// st3
//			System.out.println("Mari Muthu");
//			
//		}
//		
//		System.out.println("--------------------out of loop---------------------");
//		
//		System.out.println(i);
		
		// Using For Loop Print 5 to 1
		
//		int i;
//		
//		for(i = 5; i>=1; i = i - 1) { // i = 5, i = 4, i = 3, i = 2, i = 1, i = 0
//			
//			System.out.println(i);
//			
//		}
//		
//		System.out.println("--------------------out of loop---------------------");
//		
//		System.out.println(i);
		
		// While Loop ----> Entry Control Loop
		
	// 	Using While Loop Print 1 to 10
		
//		int i = 100;
//		
//		while(i<=10) {
//			
//			System.out.println(i);
//			
//			i++;
//		}
		
		
		// do while loop ---> Exit Control Loop
		
//	 	Using do While Loop Print 1 to 10
		
//		int i = 1000;
		
//		do {
//			
//			System.out.println(i);
//			 
//			i = i + 2; // 1000 + 2 = 1002
//			
//		} while(i<=20);
		
		
		
//		task 1 
//		
//		o/p:- 
//		
//		1
//		1
//		1
//		1
//		1
//		1
//		1
//		1
//		1
//		1
//		
//		task 2
//		
//		o/p 
//		
//		i
//		j
//		i
//		j
//		i
//		j
//		i
//		j
//		i
//		j
		
		
//		task 3
//		
//		o/p
//		
//		i
//		i
//		i
//		i
//		i
//		j
//		j
//		j
//		j
//		j
//		
//		task 4
//		
//		o/p
//		
//		z
//		z
//		z
//		z
//		yyyyyyy
//		
//		task 5
//		
//		o/p
//		
//		i = 1
//		
//		i = 2
//		
//		i = 3
//		
//		i = 4
//		
//		i = 5
//		
//		i = 6
//		
//		i = 7
//		
//		i = 8
		
		
		
		// nested for loop 
		
//		row = horizontal
//	
//	    colum = vertical
		
		                             // i = 1, i = 2 , i = 3, i = 4
		     // 1s      2s    7s 
		for(int i = 1; i<=4; i++) { // outer loop is responsible for printing rows 
			
			                         // j = 1,  j = 2, j = 3, j= 4
			
			     //3s       4s    6s
			for(int j = 1; j<=4; j++) { // inner loop is responsible for printing the values
				
				//5s
				
				System.out.print(j + " ");
				
			}
			
			System.out.println();
		}        

	}
	
}





















