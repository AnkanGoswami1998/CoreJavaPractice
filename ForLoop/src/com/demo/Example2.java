////For Loop

package com.demo;

public class Example2 {

	static void printEven() {
		for (int i = 0; i <= 20; i++) { /// For loop conditions
			if (i % 2 == 0) { /// Condition of even
				System.out.println(i);////// printing the value of 1 to 20 even numbers
			}
		}

	}

	public static void main(String[] args) {

		printEven(); //// Calling the method
	}
}
