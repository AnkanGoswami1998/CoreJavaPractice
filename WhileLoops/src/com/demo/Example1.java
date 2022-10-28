package com.demo;

import java.util.Scanner;

/// while loop
public class Example1 {
	public static String fruit;

	public static void main(String args[]) {
		/// int i= 0;
		/// while(i<=10) {
		/// System.out.println(i);
		// }

		Scanner sc = new Scanner(System.in);
		boolean ch = true;

		do/// ch==true
		{
			System.out.println("Enter a fruit:");
			fruit = sc.next();
			System.out.println("Do you want to enter more(True/False)");
			ch = sc.nextBoolean();
		} while (ch);
		sc.close();
	}
}
