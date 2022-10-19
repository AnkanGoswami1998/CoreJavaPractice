/// Write a program to print pass and fail according to the marks
  
import java.util.Scanner;

class PassFailDemo
{
	public static void main(String args[])
	
	{
		Scanner sc = new Scanner(System.in);
		
		/// putting marks by users
		System.out.println("Enter First marks: ");
		float marks1 = sc.nextFloat();
		System.out.println("Enter Second marks: ");
		float marks2 = sc.nextFloat();
		System.out.println("Enter Third marks: ");
		float marks3 = sc.nextFloat();
		
		/// Calculation
		float total = marks1+marks2+marks3;
		float percentage = (total/300)*100;
		
		System.out.println("You got " + percentage +" percent ");
		
		 /// if Else fumction
		if (percentage>=40)
			System.out.println("Congratulations!! You have cleared the test");
		else
			System.out.println("Sorry!! You have failed the test");
	}
}