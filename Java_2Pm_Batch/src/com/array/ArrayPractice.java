package com.array;

import java.util.Iterator;

public class ArrayPractice {  // a = 12,"wre", 'r', 4.5f;
	
	public static void main(String[] args) {
		
		// array
		
//		int a[] = new int[50];
//		
//		a[0] = 29;
//		
//		a[1] = 20;
//		
//		a[2] = 34;
//		
//		a[3] = 10;
//		
//		a[4] = 50;
//		
		//              5        5
		
		       //1st       2nd         4th  
//		for (int i = 0; i < a.length; i = i + 1) { // i = 0, i = 1, i = 2, i = 3, i = 4, i = 5
//			
//			// 3rd
//			
//			System.out.println(a[i]);
//			
//		}
		
		//                 1                                              2        3 
//      	String a[] = {"Java76tgewtydgwFEWF,73R7826348327627867DY7W8", "Python", "C++"};
		//  
      	 //          1    2    3
      //	char b[] = {'#', 't', 'o'};
//		                      
//		for (int i = 0; i < a.length; i++) {   // i=0, i=1, i=2, i=3, i=4, i=5
//			
//		     System.out.println(a[i]);
//			
//		}
       	
//       	for (int x : a) {
//       		
//       		System.out.println(x);
//			
//		}
		
		
		int a[][] = {{1,2,3,5}, {4,5,6,7}, {7,5,6,7}};
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a[0].length; j++) {

				System.out.print(a[i][j] + " ");

			}

			System.out.print("\n");

       }       
		
	}

}
