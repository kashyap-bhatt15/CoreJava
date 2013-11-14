package com.practice.home;

import java.util.Scanner;

/*
 * Rules for Tower Of Hanoi
 * 1. Only one disk can be moved at a time
 * 2. A larger disk cannot be placed over a smaller one.
 */
public class TowerOfHanoi {
	static int start = 1;
	static int end = 3;
	static int interm = 2;
	static int noOfDisks = 3;
	static int total = 6; //start + end + interm;
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter No of Disks: ");
		int noOfDisks = scanner.nextInt();
		scanner.close();
		
		moveDisks(noOfDisks, start, end, interm);
		//moveDisks(noOfDisks, start, end);
		System.out.println("=================================================");
		TowerOfHanoi toh = new TowerOfHanoi();
		toh.moveDisks(noOfDisks, start, end);
		
	}

	/**
	 * @param no is total no of disks.
	 * @param start is from which tower disks to be moved.
	 * @param end is where disks from start will go.
	 * @param interm is third disks to use for moving from start to finish.
	 */
	static void moveDisks(int no, int start, int end, int interm) {
		if(no == 0) {
			return;
		}
		else {
			moveDisks(no-1, start, interm, end);
			//System.out.println("move " + no + " from " + start + " to " + end);
			System.out.println("move " + no + " from " + start + " to " + end);
			moveDisks(no-1, interm, end, start);
			//System.out.println(" ----------------------------------------------- ");
			//System.out.println("move " + no + " from " + start + " to " + end);
		}
		return;
	}
	
	void moveDisks(int no, int start, int end) {
		if(no == 0) {
			return;
		}
		else {
			interm = total - (start + end);
			moveDisks(no-1, start, interm, end);
			System.out.println("move " + no + " from " + start + " to " + end);
			moveDisks(no-1, interm, end, start);
			//System.out.println(" ----------------------------------------------- ");
			//System.out.println("move " + no + " from " + start + " to " + end);
		}
		return;
	}
}