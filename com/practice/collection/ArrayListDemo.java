package com.practice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// Following only for jdk 1.6 and below till 1.5
		// ArrayList<String> arrList = new ArrayList<String>();
		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("One");
		arrList.add("Two");
		arrList.add("Four");
		System.out.println(arrList.size());
		System.out.println(arrList);
		
		arrList.add(2, "Three");
		System.out.println(arrList);
		arrList.add(0, "Zero");
		
		System.out.println(arrList.get(4));
		
		
		arrList.set(2, "Twenty");
		System.out.println(arrList);
		
		arrList.add("Three");
		System.out.println(arrList);
		arrList.remove("Three"); // Will remove only first occurrence.
		arrList.remove(0);
		System.out.println(arrList);
		
		System.out.println("============== With For Each =================");
		for (String s : arrList) {
			System.out.print(s + ", ");
		}
		System.out.println();
		
		System.out.println("=============== With Iterator ================");
		Iterator<String> iterator = arrList.iterator();
		while(iterator.hasNext())
			System.out.print(iterator.next() + " ");
		System.out.println();
		
		System.out.println("=============== With List Iterator ================");
		ListIterator<String> listIterator = arrList.listIterator();
		while(listIterator.hasNext())
			System.out.print(listIterator.next() + " ");
		System.out.println();
		
		System.out.println("=============== With List Iterator ================");
		ListIterator<String> listIterator2 = arrList.listIterator(arrList.size());
		while(listIterator2.hasPrevious())
			System.out.print(listIterator2.previous() + " ");
		System.out.println();
		
		System.out.println("============== Sorted with Collections ================");
		Collections.sort(arrList);
		System.out.println(arrList);
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(10);

	}
}


//Following is the program for Auto Boxing feature which need jdk <= 1.4
/*
import java.util.ArrayList;

//@SuppressWarnings("unused");
public class AutoBoxingDemo {

	public static void main(String[] args) {
		ArrayList arrList = new ArrayList();
		arrList.add("1");
		Integer a = new Integer(10);
		arrList.add(a);
		
		System.out.println(arrList);
		
		// Following will give an error
		// String s = arrList.get(0);
		String s = (String) arrList.get(0);
		s = (String) arrList.get(1);
		System.out.println(s);
		// Will give an error < 1.5 but not >= 1.5
		//Integer i = 10;
		// int t = i;
		
		Integer i = new Integer(1);
		int t = i.intValue();
		
		System.out.println(t);
	}

}

*/