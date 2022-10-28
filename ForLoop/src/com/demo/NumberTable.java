/// Number Table Class

package com.demo;

import java.util.Scanner; //Declaring Scanner package

public class NumberTable {
	static void printTable() {

		Scanner sc = new Scanner(System.in);
		int num; /// Declaring variables

		System.out.println("Enter the number"); /// input by users
		num = sc.nextInt();

		for (int i = 1; i <= 10; i++) { /// For loop
			System.out.println(num + "X" + i + "=" + (num * i)); /// Printing the table

		}
	}

	public static void main(String[] args) { /// Starting of main

		printTable(); /// Calling the method

	} //// End of main

} //// End of class
