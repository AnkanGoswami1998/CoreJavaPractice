///for loop

package com.demo;

public class Example3 {

	public static void printOdd() {
		for (int i = 0; i <= 100; i++) { /// For loop conditions
			if (i % 2 == 1)/// Condition of odd
				System.out.println(i); ////// printing the value of 1 to 100 even numbers
		}
	}

	public static void main(String args[]) {
		printOdd(); //// Calling the method
	}
}
