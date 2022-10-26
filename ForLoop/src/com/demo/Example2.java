package com.demo;

public class Example2 {

	static void printEven() {
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

	public static void main(String[] args) {

		printEven();
	}
}
