package com.practice.collection;

public class MyGeneric<T> {
// public class MyGeneric<T extends Number> {
	private T obj;
	private T objArray[];

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public T[] getObjArray() {
		return objArray;
	}

	public void setObjArray(T objArray[]) {
		this.objArray = objArray;
	}

	public void show() {
		System.out.println(obj.getClass().getName() + " : " + obj);
	}
	
	@SuppressWarnings("unused")
	public double average() {
		double sum = 0.0;
		double avg = 0.0;
		for (T t : objArray) {
			// sum += t.doubleValue();
		}
		avg = sum / objArray.length;
		return avg;
		
	}
}
