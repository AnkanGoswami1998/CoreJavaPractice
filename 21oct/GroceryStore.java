////Program: WAP to make a vegetable store
//import packages 
import java.util.Scanner;
//declaring a class

class GroceryStore
{
	//menu method
	static void menu()
	{
		System.out.println("--------------Grocery Store--------------");
		System.out.println("1. Apples:Rs 20/kg");
	    System.out.println("2. Biscuits :Rs 50/Packet");
	    System.out.println("3. Chips:Rs 200/paket");
		System.out.println("4. Cheese:Rs 60/Packet");
		System.out.println("5. Juice:Rs 250/Box");
	}
	// method to buy item
	
	static void buyItem()
	
	{
		 //declaring the object of scanner
		Scanner sc = new Scanner(System.in);
		//calling menu method
		menu();
		
		//declaring variables
		int choice;
		float qty,totalBill=0.0f,discountedBill=0.0f;
		
		// taking input
		System.out.println("Enter Your choice ");
		choice = sc.nextInt();
		
		//switch case
		switch(choice)
		{
			
			//calculating total bill
			case 1 : System.out.println("Enter the quantity of Apples: ");
			qty = sc.nextFloat();
			totalBill = 20*qty;
			break;
			case 2 : System.out.println("Enter the Packets of Biscuits: ");
			qty = sc.nextFloat();
			totalBill = 50*qty;
			break;
			case 3 : System.out.println("Enter the Packets of Chips: ");
			qty = sc.nextFloat();
			totalBill = 200*qty;
			break;
			case 4 : System.out.println("Enter the Packets of Cheese: ");
			qty = sc.nextFloat();
			totalBill = 60*qty;
			break;
			case 5 : System.out.println("Enter the Boxes of Juice: ");
			qty = sc.nextFloat();
			totalBill = 250*qty;
			break;
			default : System.out.println("Wrong Input");
			
		}
		
		
		float discount = calculateDiscount(totalBill);
		System.out.println("-----Total Bill-------"+totalBill);
		discountedBill = totalBill - discount ;
		if(discount >0)
			System.out.println("-----Discounted Bill-------"+discountedBill);
		else
			System.out.println("_____");
		
		
	}
	
	    
	     //method to calculate discoun
		static float calculateDiscount(float amount)
		{
			//variable to store discount
			float disc;
			if(amount>2000)
				disc = 0.2f*amount;
			else if(amount>500)
				disc = 0.1f*amount;
			else if(amount>250)
				disc = 0.05f*amount;
			else
				disc = 0.0f;
			
			return disc;
			
		}
	
	     //main started
		public static void main(String args[])
		{
		buyItem();
		
		}  // end of main

	
}  // end of class 
			
		