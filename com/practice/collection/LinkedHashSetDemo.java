package com.practice.collection;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		
		lhs.add("One");
		lhs.add("Two");
		System.out.println(lhs);
		
		TreeSet<String> ts = new TreeSet<>();
		ts.add("zero");
		ts.add("One");
		ts.add("one");
		ts.add("Zero");
		
		System.out.println(ts);
	}

}
