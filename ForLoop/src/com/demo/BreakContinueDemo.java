package com.demo;

public class BreakContinueDemo {

	public static void main(String args[]) {

		for (int i = 0; i <= 10; i++)

		{

			if (i == 5)
				break;
			System.out.println(i);
		}
		// break : to come out of the loop
		System.out.println("------With continue-------");
		for (int i = 0; i <= 10; i++) {

			if (i == 5)
				continue; // continue : skips the iteration for that particulat value
			System.out.println(i); // these statements are skipped
		}
	}
}
