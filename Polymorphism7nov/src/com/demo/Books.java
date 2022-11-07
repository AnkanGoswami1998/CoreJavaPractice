//// 7th November
//// Example of Inheritance

package com.demo;

public abstract class Books {

	private int Book_ID;
	private String Book_Name, Auther_Name;
	private float price;

	public Books() {

		Book_ID = 101;
		Book_Name = "Half Gilfriend";
		Auther_Name = "Chetan Bhagat";
		price = 2000f;
	}

	public void display() {

		System.out.println("Book ID: " + Book_ID);
		System.out.println("Book Name: " + Book_Name);
		System.out.println("Author Name: " + Auther_Name);
		System.out.println("Author Name: " + price);

	}

}
