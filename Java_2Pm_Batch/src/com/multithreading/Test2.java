package com.multithreading;

public class Test2 extends Thread {
	
//    static void display() {  // 3
//    	
//    	int i = 1;
//    	
//    	while(true) {
//    		
//           System.out.println(i + "Hello");
//           
//           i++;
//    		
//    	}
//	
//    }
	
	public void run() {

		int i = 1;

		while(true) {

			System.out.println(i + "Hello");

			i++;

		}
     }
     
	
    public static void main(String[] args) { // 1
		
//    	display(); // 2
//    	
    	
    	Test2 t = new Test2();
    	
    	t.start();
    	
    	int i = 1;
    	
    	while(true) {
    		
    	  System.out.println(i + "World");
    	  
    	  i++;
    		
    	}
    	
	 }
 
  }
