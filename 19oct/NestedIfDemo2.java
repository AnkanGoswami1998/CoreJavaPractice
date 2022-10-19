//// Programme to see if you are eligible to donate blood or not

///importing scanner
import java.util.Scanner;
//Starting of class
class NestedIfdemo2
{ 
///starting of main
	public static void main(String args[])
	
	{
		
		Scanner sc = new Scanner(System.in);
		 /// declearing variables 
		int age;
		float weight;
		char gender;
		
		 /// taking inputs
		System.out.println("Enter Your Age :");
		age = sc.nextInt();
		 
		/// checking age & weight criteria
		if(age>=18)
		{
			System.out.println("Enter Your Gender(m/f) :");
			gender = sc.next().charAt(0);
			
			System.out.println("Enter Your Weight :");
			weight = sc.nextFloat();
			
			if (((gender=='m')&&(weight>=60))||((gender=='f')&&(weight>=50)))
				System.out.println("You can donate blood....");
			else
				System.out.println("You cannot doante blood....better luck next time");
		}
		else
			System.out.println("You are underaged....please wait");
	} ////end of main
}/// end of class
				
			