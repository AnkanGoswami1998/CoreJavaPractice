
import java.util.Scanner;

class EvenOddDemo
 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The number :");
		int num = sc.nextInt();
		
		
		if(num%2==0)   ///using reminder sign because even numbers wont give any reminder so it equal to will be zero,not zot will be odd number
			System.out.println(" The number " +num+ " is a even number ");
		else
			System.out.println(" The number " +num+ " is a odd number ");
	}
 }