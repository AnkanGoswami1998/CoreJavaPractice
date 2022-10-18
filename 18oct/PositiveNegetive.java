
import java.util.Scanner;

class PositiveNegetive
 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The number :");
		int num = sc.nextInt();
		
		
		if(num>=0) /// numbers less than are negetive
			System.out.println(" The number " +num+ " is a positive number ");
		else
			System.out.println(" The number " +num+ " is a negetive number ");
	}
 }