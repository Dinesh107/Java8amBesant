package com.collection;

import java.util.Collection;

import java.util.HashMap;

import java.util.Map;

import java.util.Map.Entry;

import java.util.Set;

public class MapPractice {

	public static void main(String[] args) {

		
		// map ----> Interface 
		
		// hash map
		
		Map<Float, String> m = new HashMap<Float, String>(); // Empty Hash Map
		
		//1) put 
		
		m.put(1.24f, "Java");
		
		m.put(23.45f, "Python");
		
		m.put(45.65f, "C++");
      
		m.put(23.56f, "C");
		
		m.put(56.8f, "HTML");
		
		System.out.println(m);
		
		Set<Entry<Float, String>> es = m.entrySet();
		
		System.out.println(es);
		
		for (Entry<Float, String> it : es) {
			
			System.out.println(it);
			
		}
		
		
		
		
		
		// size()
//		
//		int si = m.size();
//		
//		System.out.println(si);
		
		
		int si = m.size();
		
		System.out.println(si);
		
		
		
		
////		
////		//  get()
////		
////		String st = m.get(1.2f);
////		
////		System.out.println(st);
		
		//    System.out.println(m.get(56.8f));
		
		
		
////		
////		//  entrySet()
////		
//		Set<Entry<Float, String>> es = m.entrySet();
//		
//		System.out.println(es);
////		
////		
//		// keySet()
//		
//		Set<Float> ks = m.keySet();
//		
//		System.out.println(ks);
		
		Set<Float> ks = m.keySet();
		
		System.out.println(ks);
////		
////		//values
////		
//		Collection<String> va = m.values();
//		
//		System.out.println(va);
		
		Collection<String> values = m.values();
		
		System.out.println(values);
////		
////		//  containsKey()
////		
		boolean ck = m.containsKey(1.24f);
		
		System.out.println(ck);
////		
////		// containsvalue
////		
//		boolean cv = m.containsValue("java");
//		
//		System.out.println(cv);
		
	}

}
