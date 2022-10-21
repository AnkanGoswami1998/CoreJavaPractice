////Program: WAP to implement enhanced switch case
//import packages 
import java.util.Scanner;

//declaring a class
class EnhancedSwitch2


{
	//method to print ftype of language
	static void printLang(String lang)
	{
		
	switch(lang)
	{
		case "c","c+","java",".net" -> System.out.println("Programming Language");
		case "sql", "oracle" -> System.out.println("DBMS Language");
	    case "php","javascript","html" -> System.out.println("web based language");
		default-> System.out.println("Wrong Input");
	}
	}
	//main started
	public static void main(String args[])
	
	{ 
	// switch case with string
		String inputLang;
		
		//declaring the object of scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a programing Language:");
		inputLang = sc.next().toLowerCase(); // converting the input to lowercase
		
		printLang(inputLang);   //calling method
	}
	
	// end of main
}
// end of class
		
		