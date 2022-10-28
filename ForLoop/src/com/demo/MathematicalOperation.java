package com.demo;

import java.util.Scanner;

public class MathematicalOperation {

	private static void printFactorial(int num) {

		long fact = 1;
		for (int i = 1; i <= num; i++) { /// factorial of the number given
			fact = fact * i;
			System.out.print(fact + " ");
		}
		System.out.println("The Factorial is: " + fact); /// printing the factorial of any number
	}

	private static void checkPrime(int num) { /// Chcking the number is prime or not
		boolean flag = false;
		if (num == 0 || num == 1) {
			System.out.println(num + " is not a prime number");
		}

		else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					System.out.println(num + " is not a prime number");
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println(num + " is a prime number"); /// print check of the prime numbers
			}

		}
	}

	public static void main(String args[]) {
		// TODO Auto generated method stub
		Scanner sc = new Scanner(System.in); /// Scanner package
		System.out.println("Enter any number"); /// input by users
		int number = sc.nextInt();
		printFactorial(number); /// Calling the method of factorial
		checkPrime(number); /// Calling the method of checking prime numbers
	}
}
