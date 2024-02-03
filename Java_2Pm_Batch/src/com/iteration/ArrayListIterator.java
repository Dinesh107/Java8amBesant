package com.iteration;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {

		
//		java iterator:- 
//		
//		it is an object that can be used to loop through collections, like array list,
//		
//		hash set, it is called iterator.
		
		
		// ArrayList
		
	ArrayList<Integer> num = new ArrayList<Integer>();
	
	num.add(12);
	
	num.add(8);
	
	num.add(2);
	
	num.add(23);
	
	Iterator<Integer> it = num.iterator();
	
	while(it.hasNext()) {
		
		int i = it.next();
		
		if(i < 10) {
			
			it.remove();
		}
		
	}
	
	System.out.println(num);
		
	}

}
