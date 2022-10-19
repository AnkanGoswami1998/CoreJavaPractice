//// Programme to see if you are eligible to donate blood or not 
///importing scanner
import java.util.Scanner;
//Starting of class
class NestedIfdemo 
{
	///starting of main
	public static void main(String args[])
	
	{
		
		Scanner sc = new Scanner(System.in);
		/// declearing variables 
		int age;
		float weight;
		/// taking inputs
		System.out.println("Enter Your Age :");
		age = sc.nextInt();
		/// checking age & weight criteria
		if (age>=18)
		{
			System.out.println("Enter Your weight :");
		    weight = sc.nextFloat();
			
			if(weight>=50)
				System.out.println("You can donate bood.....");
			else
				System.out.println("You are underweight.....");
		}
		else
			System.out.println("You are underaged.....");
	}////end of main
}/// end of class
			
		
		