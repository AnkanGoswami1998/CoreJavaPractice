//Importing util package for scanner class
import java.util.Scanner;

//Declearing a class
class AverageDemo
{
	//Main method
	public static void main(String args[])
	{
		//Creating an object in scanner class
		Scanner sc = new Scanner(System.in);
		
		//declearing and initializing variables
		System.out.println("Enter First Number:");
		float number1=sc.nextFloat();
		
		System.out.println("Enter Second Number:");
		float number2=sc.nextFloat();
		
		System.out.println("Enter Third Number:");
		float number3=sc.nextFloat();
		
		//calculating the average
		float average = (number1+number2+number3)/3;
		
		//printing the result
		System.out.println("The average is:"+ average);
	}
}
		
		