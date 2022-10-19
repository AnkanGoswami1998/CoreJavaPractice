 //// WAP to print the grade according to the percentage
 //import packages
import java.util.Scanner;
//declaring a class
class StaticGrading

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
		
		
	}//end of method printGrade
	
	//main started
	public static void main(String args[])
	{
		//declaring the object of scanner
		Scanner sc = new Scanner(System.in);
		
		//declaring variables
		float percentage;
		
		//taking input
		System.out.println("Enter your percentage: ");
		percentage = sc.nextFloat();
		
		//calling method 
		printGrade(percentage);
		
	}// end of main
}// end of class 
		
		
		
		
	
	

