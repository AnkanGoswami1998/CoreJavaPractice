//// 7th November
//// Inheriting a Class in other by keyward 'extends'

package com.demo;

public class PaperBook extends Books {

	private int shipping_Charges = 50;

	@Override
	public void display() {
		super.display();
		System.out.println("Overrided");
	}

	void print() {
		display();
		System.out.println("Shipping Charges: " + shipping_Charges);

	}

	public static void main(String args[]) {

		PaperBook p = new PaperBook();
		p.print();
	}

}
