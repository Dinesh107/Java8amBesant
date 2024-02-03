package com.collections;

import java.util.Collection;

import java.util.HashMap;

import java.util.Map;

import java.util.Map.Entry;

import java.util.Set;

public class MapPractice {

	public static void main(String[] args) {

		// Map
		
		// Hash Map
		
		Map<Integer, String> m = new HashMap<Integer, String>();
		
		// Put()
		
		m.put(23, "Java");
		
		m.put(24, "C++");
		
		m.put(25, "Java");
		
		m.put(26, "Java");
		
		m.put(27, "C");
		
		System.out.println(m);
		
		//  size() 
		
		int si = m.size();
		
		System.out.println(si);
		
		// get() 
		
		String st = m.get(27);
		
		System.out.println(st);
		
		//  entrySet()
		
		Set<Entry<Integer, String>> es = m.entrySet();
		
		System.out.println(es);
		
		// keySet()
		
		Set<Integer> ks = m.keySet();
		
		System.out.println(ks);
		
		// values()
		
		Collection<String> va = m.values();
		
		System.out.println(va);
		
		// containsKey() 
		
		boolean ck = m.containsKey(23543);
		
		System.out.println(ck);
		
		// containsValue()   
		
		boolean cv = m.containsValue("Java");
		
		System.out.println(cv);
		
		
	}

}
