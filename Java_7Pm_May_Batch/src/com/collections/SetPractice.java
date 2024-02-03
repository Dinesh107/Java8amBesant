package com.collections;

import java.util.HashSet;

import java.util.LinkedHashSet;

import java.util.Set;

import java.util.TreeSet;

public class SetPractice {

	public static void main(String[] args) {

		// Set
		
		//HashSet
		
//		Set<Integer> s1 = new HashSet<Integer>();
//		
//		// Add
//		
//		s1.add(23);
//		
//		s1.add(45);
//		
//		s1.add(12);
//		
//		s1.add(67);
//		
//		s1.add(3);
//		
//		System.out.println(s1);
		
		// LinkedHashSet
		
       Set<Integer> s1 = new LinkedHashSet<Integer>();
		
		// Add
		
		s1.add(222);
		
		s1.add(45);
		
		s1.add(3);
		
		s1.add(67);
		
		s1.add(34);
		
		System.out.println(s1);
		
		// Size
		
		int si = s1.size();
		
		System.out.println(si);
		
		//  contains()
//		
//		boolean con = s1.contains(34243);
//		
//		System.out.println(con);
		
		// addall()
		
        Set<Integer> s2 = new LinkedHashSet<Integer>();
		
		// Add
		
		s2.add(222);
		
		s2.add(345);
		
		s2.add(212);
		
		s2.add(672);
		
		s2.add(342);
		
		System.out.println(s2);
		
		// addAll
		
//		s2.addAll(s1);
//		
//		System.out.println(s2);
		
		
		// clear()
		
//		s1.clear();
//		
//		System.out.println(s1);
		
//		boolean em = s1.isEmpty();
//		
//		System.out.println(em);
		
		//   removeall() ---> it will remove the common values
		
		s1.removeAll(s2);
		
		System.out.println(s1);
		
		
		
		// TreeSet
//		
//		  Set<Integer> s1 = new TreeSet<Integer>();
//			
//			// Add
//
//		  s1.add(23);
//
//		  s1.add(45);
//
//		  s1.add(3);
//
//		  s1.add(67);
//
//		  s1.add(32);
//
//		  System.out.println(s1);
		
	}

}
