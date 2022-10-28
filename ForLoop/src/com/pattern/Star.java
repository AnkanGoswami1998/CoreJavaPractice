package com.pattern;

public class Star { /// pattern to print star method

	static void starpattern() {
		int j; /// Declaring variables
		for (int i = 1; i <= 5; i++) {

			System.out.println();

			// inner loop for spaces
			for (j = 5; j >= i; j--) {
				System.out.print(" ");
			}

			// inner loop to print star
			for (j = 1; j <= i; j++) {

				System.out.print("* ");

			}
			// outer loop ends
		}
	}

	public static void main(String args[]) {
		// TODO Auto generated method stub
		starpattern(); // calling the method
	} /// end of main

} /// end of class
