
//// WAP to print the grade according to the percentage
 //import packages
import java.util.Scanner;
//declaring a class
class StaticGrading2

{
	// method to calculate grade
	static void printGrade(float percentage) // formal/dummy arguments
	{
		char grade;
		//checking percentage to cal grade
		if(percentage>85)
			grade = 'A';
		else if(percentage>70)
			grade = 'B';
		else if(percentage>55)
			grade = 'C';
		else if(percentage>40)
			grade = 'D';
		else
			grade = 'F';
		
		//end of ifelse	
		if(grade=='F')
			System.out.println("Sorry!!! You have failed the test....Work harder");
		else
			System.out.println("Congratulations!!! You have cleared the test with grade  " + grade);
		
		printRemarks(grade);
		
		
	}//end of method printGrade
	
	static void printRemarks(char grade)
	{ 
	//// Switch case
		switch(grade)
		{
			case 'A': System.out.println("Excellent performance....");
			break;
			case 'B': System.out.println("Very Good....");
			break;
			case 'C': System.out.println("Good....Can do better");
			break;
			case 'D': System.out.println("Fair....Need to work very hard.....");
			break;
			case 'E': System.out.println("Fail....Better luck next time....");
			break;
			
		}
	}
	
	//main started
	public static void main(String args[])
	{
		//declaring the object of scanner
		Scanner sc = new Scanner(System.in);
		
		//declaring variables
		float m1,m2,m3;
		
		//taking input
		System.out.println("Enter markas of sub 1: ");
		m1 = sc.nextFloat();
		System.out.println("Enter markas of sub 2: ");
		m2 = sc.nextFloat();
		System.out.println("Enter markas of sub 3: ");
		m3 = sc.nextFloat();
		
		float percentage = ((m1+m2+m3)/300)*100;
		
		
		//calling method 
		printGrade(percentage);
		
	}// end of main
}// end of class 
		