package com.pattern;

public class Diamond {
	static void diamondpattern() {
		int j; /// Declaring variables
		for (int i = 1; i <= 5; i++) {

			System.out.println();

			// inner loop for spaces
			for (j = 5; j >= 5; j--) {
				System.out.print(" ");
			}

			// inner loop to print star
			for (j = 1; j <= i; j++) {

				System.out.print("* ");

			}
			// outer loop ends
		}
		for (int i = 5; i >= 1; i--) {

			System.out.println();

			for (j = 1; j <= 5 - 1; j++) {

				System.out.print(" ");
			}

			for (j = 1; j <= i; j++) {

				System.out.print("* ");
			}

		}
	}

	public static void main(String args[]) {
		// TODO Auto generated method stub
		diamondpattern(); // calling the method
	} /// end of main

}
