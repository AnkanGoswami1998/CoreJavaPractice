
import java.util.Scanner;

class IFElseDemo
 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Fisrt number :");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second number :");
		int num2 = sc.nextInt();
		
		if(num1>num2)
			System.out.println("The greater number is :" + num1);
		else
			System.out.println("The greater number is :" + num2);
	}
 }
		
		
		