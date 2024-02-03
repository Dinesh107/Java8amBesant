package com.controlstatement;

public class ControlStatementPractice {

	public static void main(String[] args) {

		//control statement or looping statement
		
		// types:- for loop, while loop, do while loop, nested for loop.
		
		// initialization, condition, iteration
		
		
	//	initialization :- were we start
		
		
	//  condition :- were we stop, based true or false --> if condition true the will
		//run if the false will stop or terminate
		
	// iteration :- it will increase or decrease the value
		
		// four types iterate operators
		
//		i++ ===> post increment operator, i + 1
//		
//		i-- ===> post decrement operator, i - 1
//		
//		++i ===> pre increment operator
//	
//		--i ===> pre decrement operator 
		
		// for loop
		
		// using for loop print 1 to 10
		
		      //1        //2     // 4
//		for(int i = 10; i>=1; i--) { // i = 1, i = 2, i = 3, i = 4, i = 5,i = 6  
//			
//			   //3
//			System.out.println(i);
//			
//		}

		// while loop ---> entry control loop
		
		// using while loop print 1 to 10
		
//		int i = 1;
//		
//		while(i<=10) {
//			
//			System.out.println(i);
//			
//			i++;
			
	//	}
	
	// do while loop ---> exit control loop
		
	//	using do while loop print 1 to 10
		
//		int i = 12;
//		
//		do {
//			
//			System.out.println(i);
//			
//			i++;
//			
//		} while(i<=10);
		
		// nested for loop
		
//		for(int row = 1; row<=5; row++) { // outer loop    i = 1, i = 2, i = 3
//			
//			for(int col = 1; col<=10; col++) { // inner loop j = 1, j = 2, j = 3, j = 4
//				
//				System.out.print(col + " ");
//			}
//			
//			System.out.println();
//			
//		}
		
//		System.out.println("INVERTED TRIANGLE");
//		
//		System.out.println("-------------------------");
//		
//		System.out.println();
//		
//		for(int i = 3; i>=1; i--) {// OUTER LOOP i=1, i=2, i=3
//			
//		      for(int j = 1; j < i; j++) { // j=1, j=2, j=3 
//		    	  
//		    	  System.out.print(" ");
//		    	  
//		      }
//		      
//		      for(int j = i; j<=3; j++) { // 
//		    	  
//		    	  System.out.print("* ");
//		    	  
//		      }
//			
//		   System.out.println();
//		      
//	    }
		
		System.out.println("TRIANGLE CODE");
		
         System.out.println("-------------------------");
		
		System.out.println();
		
		for(int i = 1; i<=5; i++) {   // OUTER LOOP i = 1, i = 2, i = 3, i =4
			
		      for(int j = 5; j > i; j--) { //  j = 5, j = 4, j = 3, j = 2
		    	 
		    	  System.out.print(" ");
		    	  
		      }
		      
		      for(int j = 1; j<=i; j++) { // j=1, j =2 
		    	  
		    	  System.out.print("* ");
		    	  
		      }
			
		   System.out.println();
		      
	    }
		
		
		
		 // nested For Loop

//        for(int i = 1; i<=10; i++) { // outer loop --> row, i=1, i=2, i=3  
//        	
//        	for(int j=1; j<=i; j++) {   // inner loop --> to print values, j=1, j=2, j=7
//        		
//        	System.out.print("*" + " ");
//        		
//        	}
//        	
//        	System.out.println();
//        	
//         } 
        
     
		
		
		
		
		
		
	
	}

}

//    task using loop:- 
//    
//     task 1:- 
//     
//     
//     1
//     1
//     1
//     1
//     1
//     1
//     1
//     1
//     1
//     1
//     
//     task 2
//     
//     1
//     i
//     1
//     i
//     1
//     i
//     1
//     i
//     1
//     i
//     
//     task 3
//     
//     1
//     1
//     1
//     1
//     1
//     4
//     4
//     4
//     4
//     4
     
      
         
         
     
     
          




