///Declearing a class

import java.util.Scanner;

class Car 
 {
	public static void main(String args[])
	{
	    ///Declearing Car class
		Car BMWCar = new Car();
		Car Audi = null;
		
		System.out.println(BMWCar instanceof Car);
		System.out.println(Audi instanceof Car);
	}
 }