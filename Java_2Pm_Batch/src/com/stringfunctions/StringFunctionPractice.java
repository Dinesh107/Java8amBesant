package com.stringfunctions;

public class StringFunctionPractice {

	public static void main(String[] args) {

		String s = "Welcome-To-Java";
		
//	    // 1) length
//		
//		int len = s.length();
		
		//           15
		int len = s.length();
		
		System.out.println("The length of the String is:- " + len);
//		
//		System.out.println(len);
//		
//		// 2) equals()  ---> case sensitive
//		
//		boolean eq = s.equals("Welcome To Java");
//		
//		System.out.println(eq);
//		
//		// 3.s.equalsIgnoreCase()
//		
//		boolean ei = s.equalsIgnoreCase("Welcome To Java");
//		
//		System.out.println(ei);
//		
//		// 4.s.toUpperCase()
//		
		String uc = s.toUpperCase();
		
		System.out.println(uc);
//		
//		// 5.s.toLowerCase()
//		
		String lc = s.toLowerCase();
		
		System.out.println(lc);
//		
//		// 6.s.startsWith()  --> case  sensitive
//		
//		boolean sw = s.startsWith("Welcome");
//		
//		System.out.println(sw);
//		
//		// 7.s.endsWith()
//		
//		boolean ew = s.endsWith("Java");
//		
//		System.out.println(ew);
//		
		// 8.s.contains()
		
//		boolean co = s.contains("Python");
//		
//		System.out.println(co);
//		
//		// 9.s.indexOf()  //----> value
//		
		int io = s.indexOf("e");
		
		System.out.println(io);
//		
//		// 10.s.lastIndexOf() //----> value
//		
		int lio = s.lastIndexOf("e");
		
		System.out.println(lio);
		
		// 11.s.charAt() //---> index
		
		char ca = s.charAt(1);
		
		System.out.println(ca);
//		
//		// 12.s.replace() 
//		
//		String rep = s.replace("Java", "C");
//		
//		System.out.println(rep);
		
		// 13  s.isEmpty()
		
//		boolean em = s.isEmpty();
//		
//		System.out.println(em);
		
		//14.s.subString()
		
//		String sub = s.substring(6);
//		
//		System.out.println(sub);
//		
//        String sub = s.substring(2, 12);  // giving range we can cut the string
// 		
//		System.out.println(sub);
		
		//15 16.s.trim()
		
//		System.out.println(s);
//		
//		String tr= s.trim();
//		
//		System.out.println(tr);
		
		//16 .s.split()
		
		//Java
		String[] sp = s.split("a");
		
//		for (String x : sp) {
//			
//			System.out.print(x);
//			
//     	}	
	
	//                      	4   
		for (int i = 0; i < sp.length; i++) { // 4 < 4
			
			System.out.print(sp[i]);
			
		}
	}

}
