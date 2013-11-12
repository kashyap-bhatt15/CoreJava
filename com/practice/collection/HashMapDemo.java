package com.practice.collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "One");
		hashMap.put(2, "Two");
		hashMap.put(4, "Four");
		
		System.out.println(hashMap);
		
		hashMap.put(3, "Three");
		System.out.println(hashMap);
		
		hashMap.put(null, "Five");
		System.out.println(hashMap);
		
		hashMap.put(null, "Six");
		System.out.println(hashMap);
		
		System.out.println(hashMap.get(1));
		
		hashMap.put(1, "one replaced");
		System.out.println(hashMap);
		
		hashMap.remove(null);
		System.out.println(hashMap);
		
		Iterator<Integer> iterator = hashMap.keySet().iterator();
		while(iterator.hasNext()) {
			//System.out.println(iterator.next());
			System.out.println(hashMap.get(iterator.next()));
		}
		
		
		System.out.println("============================ Iterator 2 ========== ");
		HashMap<String, Integer> hashMap2 = new  HashMap<>();
		hashMap2.put("D", 1);
		hashMap2.put("A", 2);
		hashMap2.put("C", 3);
		hashMap2.put("aa", 11);
		System.out.println(hashMap2);
		
		Set<String> set = hashMap2.keySet();
		Iterator<String> it = set.iterator();
		
		while (it.hasNext()) {
		}
		
		
		
		
	}
}
