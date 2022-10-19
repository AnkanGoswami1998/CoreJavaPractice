
/// Write a program to print grade according to the marks
  
import java.util.Scanner;

class GradingDemo
{
	public static void main(String args[])
	
	{
		Scanner sc = new Scanner(System.in);
		
		float percentage;
		char grade;
		
		System.out.println("Enter Your Percentage: ");
		percentage = sc.nextFloat();
		
		if(percentage>85)
			grade = 'A';
		  else if( percentage>70)
			  grade = 'B';
		    else if( percentage>55)
				grade = 'C';
			   else if( percentage>40)
			       grade = 'D';
			    else 
					grade = 'F';
	
	if (grade=='F')
		System.out.println("Sorry!! You have failed....work harder");
	else
		System.out.println("You have cleared the test with grade " + grade);
	}
}