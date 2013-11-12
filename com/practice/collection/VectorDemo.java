package com.practice.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		vector.add(1);
		vector.add(2);
		vector.add(4);
		System.out.println(vector);
		
		vector.add(3);
		System.out.println(vector);
		vector.set(0, 0);
		System.out.println(vector);
		
		vector.remove(3);
		System.out.println(vector);
		
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(1);
		arrList.add(2);
		
		vector.retainAll(arrList);
		System.out.println("========== After Retain All ========");
		System.out.println(vector);
		vector.add(20);
		vector.add(30);
		
		
		System.out.println("============ Iteration ===========");
		for (Integer i : vector) {
			System.out.println(i);
		}
		
		System.out.println("================ Iteration via Iterator ==============");
		Iterator<Integer> iterator = vector.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}	
	}

}
