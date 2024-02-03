package com.stringtypes;

public class StringTypesPractice {
	
	public static void main(String[] args) {
//		
//		to find a memory address of a particular value there is method called
//		
//		System.identityHashCode(method)
		
		// Immutable String
		
//		System.out.println("Immutable String");
//		
//		String s1 = "Hari";  // Original 
//		
//		System.out.println(System.identityHashCode(s1));
//		
//		String s2 = "Hari";  // Duplicate,  Memory Will be shared
//		
//		System.out.println(System.identityHashCode(s2));
//		
//		System.out.println(s1+s2);
//		
//		System.out.println(System.identityHashCode(s1+s2)); // new memory is created
		
		
	// Mutable String
		
		System.out.println("Mutable String");
		
		StringBuffer s1 = new StringBuffer("vishesh");
		
		System.out.println(System.identityHashCode(s1));
		
		StringBuffer s2 = new StringBuffer("vishesh");
		
		System.out.println(System.identityHashCode(s2)); // new memory is created
		
        System.out.println(s1.append(s2));
		
		System.out.println(System.identityHashCode(s1.append(s2)));
		
//        System.out.println(s2.append(s1));   // memory is shared
//		
//		System.out.println(System.identityHashCode(s2.append(s1)));
		
		
//		StringBuffer s1 = new StringBuffer("vishesh");
//		
//		System.out.println(System.identityHashCode(s1));
//		
//		StringBuffer s2 = new StringBuffer("vishesh");
//		
//		System.out.println(System.identityHashCode(s2));
//		
//		System.out.println(s1.append(s2));
//		
//		System.out.println(System.identityHashCode(s1.append(s2)));
//		
//        System.out.println(s2.append(s1));   // memory is shared
//		
//		System.out.println(System.identityHashCode(s2.append(s1)));
//		
		
		
		
		
		
		
		
		
		
	}

}
