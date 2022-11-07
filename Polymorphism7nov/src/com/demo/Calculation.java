////7th November
////Static Polymorphism

package com.demo;

public class Calculation { //// Class Started

	public void add(int a) { //// Creating the method add

		a++;
		System.out.println(a);
	}

	public void add(int a, int b) { //// taking the same method again with different parameters

		System.out.println(a + b);

	}

	public void add(char ch) { //// taking the same method again with different parameters

		System.out.println((int) ch);
	}

	public void add(float x, float y) { //// taking the same method again with different parameters

		System.out.println(x + y);
	}

	public static void main(String args[]) { //// main Started

		Calculation cal = new Calculation();

		cal.add('a');
		cal.add(9); //// Calcutaing the values
		cal.add(2, 3);
		cal.add(9.4f, 8.7f);
	} //// End of main

} //// End of class
