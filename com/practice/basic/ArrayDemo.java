package com.practice.basic;

public class ArrayDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int arr1[] = new int[3];
		int [] arr2 = new int[3];
		arr1[0] = 10;
		arr1[1] = 30;
		arr1[2] = 40;
		
		// Will throw ArrayIndexOutOfBoundsException
		// arr1[3] = 54;
		
		//System.out.println(arr1);
		for(int i = 0; i < arr1.length; i++) {
			//System.out.println(arr1[i]);
		}
		System.out.println("--------------------");
		
		arr2[0] = 0;
		arr2[1] = 1;
		arr2[2] = 3;
		for (int i : arr2) {
			//System.out.println(i);
		}
		
		int [] arr3 = {1,2,3,4,5};
		int arr4 [] = {1, 2, 3, 4, 5, 6};
		
		String [][] states = new String[3][2];
		int arr5[][] = new int[4][4];
		
		states[0][0] = "California";
		states[0][1] = "Sacramento";
		
		states[1][0] = "Washington";
		states[1][1] = "Olympia";
		
		states[2][0] = "New Jersey";
		states[2][1] = "Trenton";
		
		getStateAndCapitals1(states);
		
		getStateAndCapitals2(states);
				
		getStateAndCapitals3(states);
		
		
	}

	private static void getStateAndCapitals3(String[][] states) {
		for(int i = 0; i < states.length; i++) {
			StringBuilder message = new StringBuilder();
			for(int j = 0; j < states[i].length; j++) {
				if (j ==0)
					message.append("Capital of ");
				else
					message.append(" is ");
				message.append(states[i][j]);
			}
			message.append(".");
			System.out.println(message);
		}
	}

	/*
	 * Not a good idea to create String because String is immutable.
	 * every time it is assigned a new value it creates a new copy in memory
	 * and old is sent to garbage collection.
	 * */
	private static void getStateAndCapitals2(String[][] states) {
		for(int i = 0; i < states.length; i++) {
			String message = "Capital of ";
			for(int j = 0; j < states[i].length; j++) {
				if(j > 0)
					message += " is ";
				message += states[i][j] + " ";
			}
			message += ".";
			System.out.println(message);
		}
	}

	private static void getStateAndCapitals1(String[][] states) {
		for(int i = 0; i < states.length; i++) {
			for(int j = 0; j < states[i].length - 1; j++) {
				System.out.println("Capital of " + states[i][j] + " is " + states[i][j+1]);
			}
		}
	}

}
