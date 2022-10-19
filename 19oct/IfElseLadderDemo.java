
/// Write a program to see greater of three numbers
  
import java.util.Scanner;

class IfElseLadderDemo
{
	public static void main(String args[])
	
	{
		Scanner sc = new Scanner(System.in);
		
		float num1,num2,num3;
		
		System.out.println("Enter First number: ");
		num1 = sc.nextFloat();
		System.out.println("Enter Second number: ");
		num2 = sc.nextFloat();
		System.out.println("Enter Third number: ");
		num3 = sc.nextFloat();
		
		if ((num1>num2)&&(num1>num3))
			System.out.println("Enter greatest number is: " + num1);
		else if (num2>num3)
			System.out.println("Enter greatest number is: " + num2);
		else
			System.out.println("Enter greatest number is: " + num3);
	}
}
		
	