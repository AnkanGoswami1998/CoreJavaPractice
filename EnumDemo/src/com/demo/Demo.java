//// Example on enum
//// 8th November

package com.demo;

public class Demo {
	enum day {
		Sun(5), Mon(10), Tue(30);

		int i; //// Declaring Variable

		day(int i) { //// Constructor
			this.i = i;
			// TODO Auto-generated constructor stub
		}
	};

	public static void main(String args[]) {

		for (day d : day.values()) {
			//// System.out.println(d); //// Printing the Day
			System.out.println(d + "---" + d.i); //// Printing the number given
		}
	}

}
