////Program: WAP to print number of days in a month
//import packages 
import java.util.Scanner;
//declaring a class
class MonthDays


{   
    //method to print ftype of language
	static void printNoDays(String month)
	{
		
	switch(month)    // start of switch
	{
		case "january" :
		case "march" :
	    case "may" :
		case "july" :
		case "august" :
		case "october" :
		case "december" : System.out.println("No of days in "+month+ " are 30 days");
		break;
		
		case "april" :
		case "june" :
		case "september" :
		case "november" : System.out.println("No of days in "+month+ " are 31 days");
		break;
		
		case "february" : System.out.println("Enter the Year");
		                  Scanner sc = new Scanner(System.in);
						  
						  int year = sc.nextInt();
						  
						  if(((year%4==0)&&(year%100!=0))||(year%100 ==0))
							 System.out.println("No of days in "+month+ " are 29 days");
						 else
							 System.out.println("No of days in "+month+ " are 28 days");
						 break;
						 default : System.out.println("Month doesnt exits");
		
	} //end of switch
	}
	 //main started
	public static void main(String args[])
	
	{  // switch case with string
		String inputMonth;
		
		//declaring the object of scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Month:");
		inputMonth = sc.next().toLowerCase();   // converting the input to lowercase
		
		printNoDays(inputMonth);   //calling method
	}
	
	// end of main
}
// end of class 
