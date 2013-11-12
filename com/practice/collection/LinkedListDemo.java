package com.practice.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("One");
		list.add("Two");
		list.add("Four");
		System.out.println(list);
		
		list.add(0, "Zero");
		System.out.println(list);
		list.set(0, "0");
		System.out.println(list);
		
		list.push("Stack One");
		System.out.println(list);
		list.pop();
		System.out.println(list);
		System.out.println(list.peek());
		System.out.println(list.peekLast());
		
		System.out.println("============= Iteration ==============");
		for (String s : list) {
			System.out.println(s);
		}
		
		System.out.println("=============  Use of Iterator =============");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next() + " ");
	}

}
