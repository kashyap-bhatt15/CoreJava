package com.practice.collection;

import java.util.Hashtable;
import java.util.Iterator;

public class HashtableDemo {

	public static void main(String[] args) {
		Hashtable<String, String> hashtable = new Hashtable<>();
		
		hashtable.put("one", "One");
		hashtable.put("two", "Two");
		hashtable.put("three", "Four");
		
		System.out.println(hashtable);
		
		hashtable.put("One", "Onee");
		System.out.println(hashtable);
		
		// For adding key case matters
		// For removing keys are case insensitive.
		hashtable.remove("One");
		System.out.println(hashtable);
		
		
		System.out.println("====== Iteration =======");
		for (String string : hashtable.keySet()) {
			System.out.println(hashtable.get(string));
		}
		
		Iterator<String> iterator = hashtable.keySet().iterator();
		while (iterator.hasNext()) {
			System.out.println(hashtable.get(iterator.next()));	
		}
	}

}
