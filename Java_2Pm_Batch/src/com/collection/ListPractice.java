package com.collection;

import java.util.ArrayList;

import java.util.List;

public class ListPractice {

	public static void main(String[] args) {
		
		//array list

         List<Object> s1 = new ArrayList<Object>(); // ---> empty array list
         
         // 1) add
         
         s1.add("Jagadesh");
         
         s1.add(23);
         
         s1.add(34.5);
         
         s1.add('S');
         
         s1.add(7);
		
		 System.out.println(s1);
		 
		 // 2)  size()
		 
//		 int si = s1.size();
//		 
//		 System.out.println(si);
//		 
//		 //3)  get()
//		 
//		 Object ob = s1.get(1);
//		 
//		 System.out.println(ob);
//		 
//		 //4 set() 
//		 
//		 s1.set(2, "tt");
//		 
//		 System.out.println(s1);
//		 
//		 //5) remove()
//		 
//		 s1.remove(2);
//	 
//       	 System.out.println(s1);
		 
		 //6) indexOf()
		 
//		 int io = s1.indexOf(23);
//		 
//		 System.out.println(io);
//		 
//		//7) contains()
////		 
//		 boolean co = s1.contains(232);
//		 
//		 System.out.println(co);
		 
		 //8 clear()
		 
//		 s1.clear();
//		 
//		 System.out.println(s1);
		 
//	     List<Object> s2 = new ArrayList<Object>();
//         
//         s2.add("Aravind");
//         
//         s2.add(20);
//         
//         s2.add(34.5);
//         
//         s2.add('M');
//         
//         s2.add(7);
//		
//         System.out.println(s2); 
		 
//		//9) addAll()
//		 
//		 s2.addAll(s1);
//		 
//		 System.out.println(s2);
		 
		 //10) retainAll() ----> it will return the common values 
		 
//		 s2.retainAll(s1);
//		 
//		 System.out.println(s2);
		 
		 //11) removeAll()  -----> it will remove the common values
		 
//		 s2.removeAll(s1);
//		 
//		 System.out.println(s2);
		 
//         s1.removeAll(s2);
//		 
//		 System.out.println(s1);
		 
	}

}
