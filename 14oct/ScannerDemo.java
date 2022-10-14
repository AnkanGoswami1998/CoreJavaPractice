//Importing util package for scanner class
import java.util.Scanner;

//Declearing a class
class ScannerDemo
{
	//Main method
	public static void main(String args[])
	{
		//Creating an object in scanner class
		Scanner sc = new Scanner(System.in);
		
		//declearing and initializing variables
		System.out.println("Enter your name:");
		String name=sc.next();
		
		System.out.println("Enter your Age:");
		int age=sc.nextInt();
		
		System.out.println("Enter your Marks:");
		int marks=sc.nextInt();
		
		System.out.println("Enter your adress:");
		String adress=sc.next();
		
		System.out.println("Enter you gender(M/F):");
		char gender=sc.next().charAt(0);
		
		System.out.println("Are you passed the test:");
		boolean pass=sc.nextBoolean();
		
		//printing the whole details
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Your Details are:");
		System.out.println("Name:"+ name);
		System.out.println("Age:"+ age);
		System.out.println("Marks:"+ marks);
		System.out.println("Adress:"+ adress);
		System.out.println("Enter your name:");
		System.out.println("Gender:"+gender);
		System.out.println("Pass?Fail:"+ pass);
	}
}
		
		