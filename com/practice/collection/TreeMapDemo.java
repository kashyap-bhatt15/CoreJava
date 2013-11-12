package com.practice.collection;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		
		treeMap.put(1, "One");
		treeMap.put(2, "Two");
		treeMap.put(3, "Four");
		System.out.println(treeMap);
		
		treeMap.put(0, "Zero");
		treeMap.put(3, "Three");
		System.out.println(treeMap);
		
		treeMap.remove(2);
		System.out.println(treeMap);
		
		Iterator<Integer> iterator = treeMap.keySet().iterator();
		
		System.out.println("============== Iteration ===========");
		while(iterator.hasNext()) {
			System.out.println(treeMap.get(iterator.next()));
		}
		
		for (Integer i : treeMap.keySet()) {
			System.out.println(treeMap.get(i));
		}
	}

}
