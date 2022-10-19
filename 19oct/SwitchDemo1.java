//// WAP to print the day according to the numbers

//// import packages
import java.util.Scanner;
//// Declaring class
class SwitchDemo1
{
	//// Method to print day
	static void printDay(int d)
	{
		//// Switch case
		switch(d)
		{
			case 1: System.out.println("Monday");
			break;
			case 2: System.out.println("Tuesday");
			break;
			case 3: System.out.println("Wednesday");
			break;
			case 4: System.out.println("Thursday");
			break;
			case 5: System.out.println("Friday");
			break;
			case 6: System.out.println("Saturday");
			break;
			case 7: System.out.println("Sunday");
			break;
			default: System.out.println("Wrong input...");
		}
	}
	
	////Starting of main
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		int day;
		
		System.out.println("Your day number: ");
		day = sc.nextInt();
		
		printDay(day);
	}//// end of main
}//// end of class