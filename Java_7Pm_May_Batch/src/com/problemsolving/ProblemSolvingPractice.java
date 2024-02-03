package com.problemsolving;

import java.util.LinkedHashMap;

import java.util.Map;

import java.util.Map.Entry;

import java.util.Scanner;

import java.util.Set;

public class ProblemSolvingPractice {
	
	public static void main(String[] args) {
		
		// 1) Find The Given number is hard or even
		
	     int a = 10;
	     
	     int b = 2;
	     
	     System.out.println(a/b);
		
     	 System.out.println(a%b);	
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter The Number:- ");
		 
		 int num = sc.nextInt();
		 
		 if(num%2 == 0) {
			 
			 System.out.println("This Number Is Even");
			 
		 } else {
			 
			 System.out.println("This Number Is Hard");
			 
		 }
		
		 // 2) Find The Given number is Prime Number or Not
		
		
//		 Scanner sc = new Scanner(System.in);
//		 
//		 System.out.println("Enter The Number:- ");
//		 
//		 int num = sc.nextInt(); // num = 4
//		
//		 int temp = 0; 
//		 //             2   4 
//		 for(int i = 2; i<num; i++) { // i =2 , i = 3, i = 4
//			 
//			int rem = num % i;  // rem = 1
//			 
//			 if(rem==0) {
//				 
//				temp = temp + 1; // temp = 1
//				 
//			 }
//		 }
//		 
//		 System.out.println(temp);
		 
		 // 0
//		if(temp == 0) {
//			
//			System.out.println("It is a Prime Number");
//			
//		} else {
//			
//			System.out.println("It is Not a Prime Number");
//			
//		}
		
		
		// 3)  Reverse The String
		
		// i/p = mari
		
		// o/p = iram 
		
//		String name = "mari";
//		
//		String rev = "";  // --> Empty String To Store The Reverse String
//		
//		int le = name.length();
//		
//		System.out.println(le);
//		
//		//              3
//		for(int i = name.length()-1; i>=0; i = i - 1) { // i = 3, i = 2, i = 1, i = 0, i = -1
//			
//			  rev = rev + name.charAt(i);
//			  
//			  //----> 1s iteration "" + i = i, rev = i
//			  
//			  //-----> 2nd iteration i + r = ir, rev = ir
//			  
//			  // ----> 3rd iteration  ir + a = ira, rev = ira
//			  
//			  // -----> 4th iteration  ira + m = iram, rev = iram
//			  
//			  System.out.println(rev);
//			  
//		}
//		
//		System.out.println("The Reversed String Is:- " + rev);
		
		// Find the Given String Is palindrome or not
		
//		malayalam   ---> malayalam
//		
//		mam  ---> mam
//		
//		121 ---> 121
		
		
//        String name = "mam";
//		
//		String rev = "";  // --> Empty String To Store The Reverse String
//		
//		int le = name.length();
//		
//		System.out.println(le);
//		
//		//              3
//		for(int i = name.length()-1; i>=0; i = i - 1) { // i = 3, i = 2, i = 1, i = 0, i = -1
//			
//			  rev = rev + name.charAt(i);
//			  
//			  //----> 1s iteration "" + i = i, rev = i
//			  
//			  //-----> 2nd iteration i + r = ir, rev = ir
//			  
//			  // ----> 3rd iteration  ir + a = ira, rev = ira
//			  
//			  // -----> 4th iteration  ira + m = iram, rev = iram
//			  
//			  System.out.println(rev);
//			  
//		}
//		
//		System.out.println("The Reversed String Is:- " + rev);
//		
//		if(name.equals(rev)) {
//			
//			System.out.println("It Is Palindrome");
//			
//		} else {
//			
//			System.out.println("It Is Not a Palindrome");
//			
//		}
		
		
		// 5) Amstrong Number
		
		
//		int num, r, sum = 0, n1;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the number:- ");
//
//	    num = sc.nextInt(); // num = 153
//		
//		n1 = num; // n1 = 153, num = 153
//		
//		while(num>0) {
//			
//			r = num % 10; // r = 3, r = 5, r = 1 
//			
//			sum = sum + r * r * r; // 0 + 27 = 27, sum = 27, 
//			
//			// ---> 2nd iteration 27 + 125 = 152, sum = 152
//			
//			// ---> 3nd iteration 152 + 1 = 153, sum = 153
//			
//			num = num / 10; // num = 1
//			
//		}
//		
//		if(n1==sum) {
//			
//			System.out.println("It is Amstrong Number");
//			
//		} else {
//			
//			System.out.println("It is Not a Amstrong number");
//			
//		}
		
		//   6) Fibonannci Series
		
//		int a[] = new int [30];
//		
//		a[0] = 0;
//		
//		a[1] = 1;
//		
//		int num = 4;
//		  //              4
//		for(int i = 2; i<num; i++) { //i = 2, i = 3, 4
//			
//			 a[i]= a[i-1] + a[i-2];
//			 
//     // 1st --> it ---> a[2] = a[2-1] + a[2-2] = a[1] + a[0] = 1 + 0 = 1
//			 
//	 // 2nd --> it ---> a[3] = a[3-1] + a[3-2] = a[2] + a[1] = 1 + 1 = 2
//			 
//	 // 3rd --> it ---> 
//			
//		}
//		
//	//	int a[] = 0, 1, 1, 2
//		
//		int x = 3;
//		
//		System.out.println(x);
//		
//		for (int r : a) {
//			
//			System.out.println(r);
//			
//		}
		
		
//		// 7) Adding Two Array 
//		
//	    int a[][] = {{3,5,2}, {2,1,2}, {4,3,0}};
//	    
//	    int b[][] = {{1,3,5}, {3,3,2}, {3,3,2}};
//	    
//	    int c[][] = new int[3][3];
//		
//		for(int i = 0; i<3; i++) { // i = 2
//			
//			for(int j = 0; j<3; j++) { // j = 0
//								
//				c[i][j] = a[i][j] + b[i][j];
				
				// i = 0
				
				//1st iteration--> c[0][0] = a[0][0] + b[0][0] = 3 + 1 = 4 
				
				//2nd iteration--> c[0][1] = a[0][1] + b[0][1] = 5 + 3 = 8
				
				// 3rd iteration -> c[0][2] = a[0][2] + b[0][2] = 9 + 5 = 14
				
               // i = 1
				
				//1st iteration--> c[1][0] = a[1][0] + b[1][0] = 7 + 3 = 10 
				
				//2nd iteration--> c[1][1] = a[1][1] + b[1][1] = 6 + 5 = 11
				
				// 3rd iteration -> c[1][2] = a[1][2] + b[1][2] = 2 + 2 = 4
				
               // i = 2
				
				//1st iteration--> c[2][0] = a[2][0] + b[2][0] = 4 + 8 = 12
				
				//2nd iteration--> c[2][1] = a[2][1] + b[2][1] = 3 + 3 = 6
				
				// 3rd iteration -> c[2][2] = a[2][2] + b[2][2] = 5 + 2 = 7
				
				// i = 3
				
				
//			}
//			
//		}
		
//		System.out.println("The Added Matrix in c:- ");
//		
//		for (int[] x : c) {
//			
//			for (int y : x) {
//				
//				System.out.print(y + " ");
//				
//			}
//			
//			System.out.println();
//			
//		}
//		
		
	//	8) Making Simple Calculator Using Switch.
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter The Num1:- ");
//		
//		double num1 = sc.nextDouble();
//		
//		System.out.println("Enter The Num2:- ");
//		
//		double num2 = sc.nextDouble();
//		
//		System.out.println("Enter The Operator (+, - , /, *)");
//		
//		char operator = sc.next().charAt(0);
//		
//		double result = 0;
//		
//		switch(operator) {
//		
//		
//		case '+': 
//		
//		        result = num1 + num2;
//		
//		        break;
//		        
//		case '-':
//			
//			    result = num1 - num2;
//			    
//			    break;
//			    
//		case '*': 
//			
//			    result = num1 * num2;
//			    
//			    break;
//			    
//		case '/':
//			
//			    result = num1 / num2;
//			    
//			    break;
//			    
//			    
//		default:
//			
//			System.out.println("Sorry! Operator Is Incorrect");
//			    	
//		}
//		
//		System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		
		
	//9) Reapeated Character in a String.
		
		
//	  VISHESH      
//	  
//	  h --> 2
//	  
//	  s --> 2
		
		
//		String x = "QWWWWWQEEWERRRWWERRTTTTYYYYYYT"; 
//		
//		char y[] = x.toCharArray();
//		
//		int size = y.length;
//		
//		System.out.println("The Length of The String is " + size);
//		
//		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
////		
////		
//      	int i = 0; // i = 1, i = 2, i = 3 
////		
////		  //        7
//		while(i != size) {
//			
//		
//			if(map.containsKey(y[i]) == false) {
//			
//		       map.put(y[i], 1);
//				
//		    } else {
//		    	//      1
//		    	 int oldval = map.get(y[i]);
//		    	 
//		    	 int newval = oldval + 1;
//		    	 
//		    	 map.put(y[i], newval);
//		    	
//		    }
//			
//			i++;
//		
//		}
//	
//		Set<Entry<Character, Integer>> lhmap = map.entrySet();
//		
//		for(Entry<Character,Integer> data : lhmap) {
//			
//			if(data.getValue() > 1) {
//				
//				System.out.print(data.getKey() + " ");
//				
//				System.out.println(data.getValue());
//				
//			}
//			
//			
//		}
		
		// Sum of Natural Number
		
//		int n, i, s = 0; 
//		
//		Scanner sc = new Scanner(System.in);
//	
//		System.out.println("Enter The N value:- ");
//		
//	    n = sc.nextInt();
//		    //     1   3          
//		for(i = 1; i<=n; i = i + 1) { // i = 1, i = 2, i = 3, i = 4
//			
//		    s = s + i;    // s = 0 + 1, s = 1, s = 1 + 2, s = 3, s = 3 + 3, s = 6
//		
//		}
//		
//		System.out.println("The Sum Of Natural Number Is:- " + s);
		
//        int n, i, s = 0, p = 2; 
//		
//		Scanner sc = new Scanner(System.in);
//	
//		System.out.println("Enter The N value:- ");
//		
//	    n = sc.nextInt(); // n = 5
//	//             1   3
//	    for(i = 1; i<=n; i = i + 2) { 
//	    	
//	    	if(p % 2 == 0) { 
//	    		
//	    		s = s + i;  
//	    		
//	    	} else {
//	    		
//	    		s = s - i; 
//	    		
//	         }
//	    	
//	    	p = p + 1;
//	    }
//	    
//	    System.out.println(s);
		
		//1) Find Whether The Given Number is odd or even
		
		// i/p = 
		
//		int a = 10;
//		
//		int b = 2;
//		
//		System.out.println(a/b);
//		
//		System.out.println(a%b);
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter The Number");
//		
//	    int number = sc.nextInt();
//	    
//	    if(number%2 == 0) {
//	    	
//	    	System.out.println("This Number Is Even");
//	    	
//	    } else {
//	    	
//	    	System.out.println("This Number Is Odd");
//	    	
//	    }
	    
	    // 1) Triangle Pattern
	    
//	    System.out.println("Triangle Code");
//	    	    
//	    System.out.println("---------------------------");
//	    
//	    for(int i = 1; i<=3; i = i + 1) {   // i = 1, i = 2, i = 3
//	    	
//	   //                   4	3
//	    	for(int j = 4 ; j > i; j = j - 1) { // 
//	    		System.out.print(" ");
//	    		
//	    	}
//	    	
//	    	
//	    //                 4 	3
//	    	for(int j = 1; j <= i; j = j + 1) { // j = 1, j = 2, j = 3, j = 4
//	    		
//	    		System.out.print("* ");
//	    		
//	    	}
//	    	
//	    	System.out.println();
//	    	
//	    }
	    
	    
	    
	    // Find Whether The Given Number Is Prime Number Or Not
	    
	    
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter The N value:- ");
//		
//		int number = sc.nextInt();
//		
//        int temp = 0;
//                     
//            //         3      4
//        for(int i = 2; i < number; i = i + 1) { // i = 2, i = 3
//        	
//        	int rem = number % i;  // rem = 0  rem = 1
//        	
//        	if(rem==0) {
//        		
//        		temp = temp + 1; // temp = 1
//        		
//        	} 
//        	
//        }
//	    
//         if(temp == 0) {
//    		
//        	System.out.println("It is a prime Number");
//    		
//    	} else {
//    		
//    		System.out.println("It is a not prime Number");
//    		
//    	}
		
		
      // Fibonancci Series
		
//		int a[] = new int[10];
//		
//		a[0] = 0;
//		
//		a[1] = 1;
//		
//		int num = 10;
//		  //           2    4
//		for(int i = 2; i < num; i = i + 1) { // i = 2, i = 3, i = 4
//			
//		// 1st ---> a[2] = a[2-1] + a[2-2] = a[1] + a[0] = 1 + 0 = 1
//		
//		// 2nd ---> a[3] = a[3-1] + a[3-2] = a[2] + a[1] = 1 + 1 = 2
//			
//		   a[i] = a[i-1] + a[i-2];
//		    	
//		}
//		
//		for (int iteration : a) {
//			
//			System.out.println(iteration);
//			
//		}
		
		// Adding Two Matrix
		
//		int a[][] = {{1,1,1}, {1,2,1},{1,2,2}};
//		
//		int b[][] = {{1,3,1}, {2,2,1},{1,2,2}};
//		
//		int c[][] = new int[3][3];
		
		
		
		
		
	}

}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
