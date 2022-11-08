//// Arrays example 
//// 8th november

package com.demo;

public class Arr {

	public static void main(String args[]) {

		int a[] = new int[3];
		int b[] = { 1, 2, 3 }; //// b consists of 1,2 & 3
		int c[][] = new int[2][2]; //// two dimentional value of d,2 rows two coloums
		int d[][] = { { 1, 2 }, { 3, 4 } };
		/*
		 * for (int i = 0; i < 2; i++) { //// for loop
		 * 
		 * for (int j = 0; j < 2; j++) { System.out.println(d[i][j] + "\t"); }
		 * 
		 * System.out.println(); }
		 */

		for (int[] x : d) { // for each loop
			for (int y : x) {
				System.out.print(y + "\t"); ///// "\t" for creating space
			}
			System.out.println(); //// Printing the value of multidimentional array d
		}
		// }

		//// for (int x : b) { ///// for each loop
		///// System.out.println(x);
	}
}
