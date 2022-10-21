////WAp to emplement enhance switch case
////import packages
import java.util.Scanner;
////Declaring a class
class EnhancedSwitch


{    ////Method to print abbreviation
	static void printAbbr(String abbr)
	{
		
	switch(abbr)
	{
		//// Expression Level
		case "lol" : System.out.println("Laughing out loud");
		break;
		case "asap" : System.out.println("As soon as possible");
		break;
		case "ttyl" : System.out.println("talking to you later");
		break;
		default: System.out.println("Wrong Input");
	}
	}
	//// Main Started
	public static void main(String args[])
	
	{
		//// Switch case with string
		String inputAbbr;
		
		//declaring the object of scanner
		Scanner sc = new Scanner(System.in); 
		
		
		System.out.println("Enter you abbrebiation(lol,asap,ttyl)");
		inputAbbr = sc.next().toLowerCase();  // converting the input to lowercase
		
		printAbbr(inputAbbr);
	}
	
	// end of main
}
// end of class
		
		