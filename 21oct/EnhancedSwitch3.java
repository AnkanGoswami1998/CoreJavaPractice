
////WAp to emplement enhance switch case
////import packages
import java.util.Scanner;
////Declaring a class
class EnhancedSwitch3


{    ////Method to print TagLine
	static void printTag(String tag)
	{
		
	switch(tag)   ////Switch case
	{
		//// Expression Level
		case "APPLE" -> System.out.println("Think Different");
	
		case "ACCENTURE" -> System.out.println("Ideate,innovate,change the world,repeat");

		case "IBM" -> System.out.println("Think");      ////-> by this symbol dont have to write break
		
		case "TCS" -> System.out.println("Building on Belief");
		
		case "INFOSYS" -> System.out.println("navigate Your Next");
	
		default-> System.out.println("Wrong Input");
	}
	}
	//// Main Started
	public static void main(String args[])
	
	{
		//// Switch case with string
		String inputTag;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Your Company");  //// input from users
		inputTag = sc.next().toUpperCase();  ////lower to upper case
		
		printTag(inputTag);  //// Calling method
	}
}