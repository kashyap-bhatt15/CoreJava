package com.practice.collection;

public class MyGeneric2<T extends Number> {
	private T objArray[];

	public T[] getObjArray() {
		return objArray;
	}

	public void setObjArray(T objArray[]) {
		this.objArray = objArray;
	}
	
	public double average() {
		double sum = 0.0;
		double avg = 0.0;
		for (T t : objArray) {
			sum += t.doubleValue();
		}
		avg = sum / objArray.length;
		return avg;		
	}

}
