package com.practice.collection;

public class GenericApp {

	public static void main(String[] args) {
		MyGeneric<String> gen1 = new MyGeneric<>();
		gen1.setObj("Hello");
		gen1.show();
		String[] sArray = {"TEST", "FIRST"};
		
		gen1.setObjArray(sArray);
		
		MyGeneric<Integer> gen2 = new MyGeneric<>();
		gen2.setObj(2);
		gen2.show();
		
		
		double d = gen1.average();
		System.out.println(d);
		
		
		MyGeneric2<Float> gen3 = new MyGeneric2<>();
		Float f[] = {1.00f, 2.30f, 3.40f, 5.30f};
		gen3.setObjArray(f);
		System.out.println(gen3.average());
	}
}
