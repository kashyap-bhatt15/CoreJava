package com.practice.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hashset = new HashSet<>();
		
		hashset.add("One");
		hashset.add("Two");
		hashset.add("Four");
		
		System.out.println(hashset);
		System.out.println(hashset.size());
		
		hashset.add("Three");
		System.out.println(hashset);
		
		System.out.println("============== Add Duplicate ==================");
		hashset.add("One");
		hashset.add("one");
		System.out.println(hashset);
		
		String getVariable = null;
		for (String s : hashset) {
			if(s.equals("Four")) {
				getVariable = s;
				s = "Fourty"; // This will not change value in hash set
				
			}
		}
		hashset.remove("Four");
		hashset.add("Fourty");
		System.out.println(getVariable);
		System.out.println(hashset);
		
		System.out.println("================= Iterator Iteration ===============");
		Iterator<String> iterator = hashset.iterator();
		while(iterator.hasNext())
			System.out.print(iterator.next() + " ");
		System.out.println();
		
		// Can't sort hashset will give an error.
		// Collections.sort(hashset);
		

	}

}
