package com.stringfunctions;

import java.util.Iterator;

public class StringFunctionsPractice {

	public static void main(String[] args) {

		String s = "Welcome-To-Java";
		
		// 1)s.length()
		
		/*
		 * int len = s.length();
		 * 
		 * System.out.println(len);
		 * 
		 * // 2.s.equals()
		 * 
		 * boolean eq = s.equals("Welcome To Java");
		 * 
		 * System.out.println(eq);
		 * 
		 * // 3.s.equalsIgnoreCase()
		 * 
		 * boolean eic = s.equalsIgnoreCase("welcome to java");
		 * 
		 * System.out.println(eic);
		 * 
		 * // 4.s.toUpperCase()
		 * 
		 * String uc = s.toUpperCase();
		 * 
		 * System.out.println(uc);
		 * 
		 * // 5.s.toLowerCase()
		 * 
		 * 
		 * String lc = s.toLowerCase();
		 * 
		 * System.out.println(lc);
		 * 
		 * 
		 * // 6.s.startsWith()
		 * 
		 * boolean sw = s.startsWith("Welcome");
		 * 
		 * System.out.println(sw);
		 * 
		 * 
		 * 
		 * // 7.s.endsWith()
		 * 
		 * boolean ew = s.endsWith("Welcome");
		 * 
		 * System.out.println(ew);
		 * 
		 * // 8.s.contains()
		 * 
		 * boolean con = s.contains("Welcome To Java");
		 * 
		 * System.out.println(con);
		 * 
		 * // 9.s.indexOf()
		 * 
		 * int io = s.indexOf('a');
		 * 
		 * System.out.println(io);
		 * 
		 * // 10.s.lastIndexOf()
		 * 
		 * int lio = s.lastIndexOf('a');
		 * 
		 * System.out.println(lio);
		 * 
		 * // 11.s.charAt()
		 * 
		 * char ca = s.charAt(9);
		 * 
		 * System.out.println(ca);
		 * 
		 * 
		 * // 12.s.replace()
		 * 
		 * 
		 * String rep = s.replace("Java", "Javascript");
		 * 
		 * System.out.println(rep);
		 */
		
		
		// System.out.println(s);
		
		// 13.s.isEmpty()
		
//		boolean em = s.isEmpty();
//		
//		System.out.println(em);
		
		
		// 14.s.trim()
		
//		String tr = s.trim();
//		
//		System.out.println(tr);
		
		// 15.s.subString() --> Length Based Method
		
//		String sub = s.substring(1);
//		
//		System.out.println(sub);
		
		// 16.s.split()
		
		String[] sp = s.split("l");
		
		// For Each Loop
		
		for (String it : sp) {
						
			System.out.print(it);
			
		}	
		
	}

}
