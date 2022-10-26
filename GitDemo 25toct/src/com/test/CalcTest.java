package com.test;

import java.util.Scanner; ///importing packages

import com.demo.Calculator; /// importing calculator package

public class CalcTest { /// menu of calculator

	static void menu() {
		System.out.println("1: Addition");
		System.out.println("2: Substraction");
		System.out.println("3: Multiplication");
		System.out.println("4: Division");
		System.out.println("5: Exit");
		System.out.println("Enter Your Choice");

	} //// end of menu

	public static void main(String args[]) { /// entering number & choices

		Scanner sc = new Scanner(System.in);

		int choice;
		float num1, num2, result = 0.0f; /// declaring variables

		System.out.println("Enter the first number:");
		num1 = sc.nextFloat();
		System.out.println("Enter the second number:");
		num2 = sc.nextFloat();

		menu(); /// calling menu

		choice = sc.nextInt(); /// entering choice by user

		switch (choice) { /// Starting of switch case
		case 1:
			result = Calculator.add(num1, num2);
			break;
		case 2:
			result = Calculator.sub(num1, num2);
			break;
		case 3:
			result = Calculator.mul(num1, num2);
			break;
		case 4:
			result = Calculator.div(num1, num2);
			break;
		case 5:
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Input");

		} //// end of switch case

		System.out.println("The result is " + result); //// Printing the result
	}
} /// end of class calcTest
