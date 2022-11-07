////7th November
//// Constructor Overloading

package com.demo;

public class Constructor { //// Starting of class

	private int a, b; //// Declaring Variables

	public Constructor() {

		System.out.println("Default Construtor");

	}

	public Constructor(int a) {

		a++;
		System.out.println(a);
	}

	public Constructor(int a, int b) {

		System.out.println(a + b);
	}

}
