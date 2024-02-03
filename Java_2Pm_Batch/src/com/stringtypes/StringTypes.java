package com.stringtypes;

public class StringTypes {

	public static void main(String[] args) {
		
	//to find the address of particular value there is method
		 
		// identityHashCode --> System.out.println(System.identityHashCode(Variable name));
		
		// immutable String

//		String s1 = "Aravind"; // original content
//		
//		String s2 = "Aravind"; // duplicate content // share the memory
//		
//		System.out.println(System.identityHashCode(s1));
//		
//		System.out.println(System.identityHashCode(s2));
//		
//		System.out.println(s1 + s2);
//		
//		System.out.println(System.identityHashCode(s1+s2)); // new Memory Is created, when we concat
		
		// mutable string
		
		StringBuffer s1 = new StringBuffer("Arvind");
		
		StringBuffer s2 = new StringBuffer("Arvind"); // it will create the new memory
		
		System.out.println(System.identityHashCode(s1));
		
		System.out.println(System.identityHashCode(s2));
		
		System.out.println(s2.append(s1));
		
		System.out.println(System.identityHashCode(s2.append(s1))); // memory is sharing
	}

}
