package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {
		
		int[] intArray = new int[3];
		
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
		
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		/*
		 * int[] intArray = new int[] {3,6,9};
		 * 
		 * for(int i=0; i<intArray.length; i++) {
		 *  System.out.println(intArray[i]); }
		 */
		/*
		int[] intArray = {3,6,9};
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		*/
		
		
		System.out.println("=====================");
		
		
		double[] dArray = new double[3];
		
		dArray[0] = 1.1;
		dArray[1] = 7.1;
		dArray[2] = 5.5;
		
		for(int i=0; i<dArray.length; i++) {
			System.out.println(dArray[i]);
		}
		
		System.out.println("====================");
		
		char[] cArray = new char[5];
		cArray[0] = '안';
		cArray[1] = '안';
		cArray[2] = '안';
		cArray[3] = '안';
		cArray[4] = '안';
		
		for(int i =0; i<cArray.length; i++) {
			System.out.println(cArray[i]);
		}
		
		boolean[] bArray = new boolean[4];
		
		bArray[0] = true;
		bArray[1] = false;
		bArray[2] = 3==5;
		
		for(int i =0; i<bArray.length; i++) {
			System.out.println(bArray[i]);
		}
	}
}
