package com.pattern;

public class Pyramid1 { /// pattern to print star method

	static void pattern1(int num) {
		// outer for loop
		for (int i = 1; i <= 5; i++) {
			System.out.println();
			// inner for loop
			for (int j = 1; j <= i; j++)
				System.out.print(j + " ");

		}
	}

	public static void main(String args[]) {
		// TODO Auto generated method stub

		pattern1(8); /// Calling method
	} // end of main
} // end of class
