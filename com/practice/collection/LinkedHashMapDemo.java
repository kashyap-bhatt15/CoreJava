package com.practice.collection;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String, Float> linkedHashMap = new LinkedHashMap<>();
		
		linkedHashMap.put("one", 1.00f);
		linkedHashMap.put("two", 2.00f);
		linkedHashMap.put("three", 4.00f);
		
		System.out.println(linkedHashMap);
	}

}
