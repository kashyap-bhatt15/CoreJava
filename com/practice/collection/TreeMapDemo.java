package com.practice.collection;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String, String> treeMap = new TreeMap<>();
		
		treeMap.put("a", "One");
		treeMap.put("b", "Two");
		treeMap.put("c", "Four");
		System.out.println(treeMap);
		
		treeMap.put("aa", "Zero");
		treeMap.put("A", "Three");
		System.out.println(treeMap);
		
		treeMap.remove("b");
		System.out.println(treeMap);
		
		Iterator<String> iterator = treeMap.keySet().iterator();
		
		System.out.println("============== Iteration ===========");
		while(iterator.hasNext()) {
			System.out.println(treeMap.get(iterator.next()));
		}
		
		for (String i : treeMap.keySet()) {
			System.out.println(treeMap.get(i));
		}
	}

}
