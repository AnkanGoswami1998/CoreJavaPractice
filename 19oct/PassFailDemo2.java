/// Write a program to print pass and fail according to the marks without scanner

class PassFailDemo2

{
	public static void main(String args[])
	
	{
		/// To convert float from string using parse
		float marks1 = Float.parseFloat(args[0]);
		float marks2 = Float.parseFloat(args[1]);
		float marks3 = Float.parseFloat(args[2]);
		
		/// Calculation
		float percentage = ((marks1+marks2+marks3)/300)*100 ; 
		
		/// If Else function
		if (percentage>=40)
			System.out.println("Congratulations!! You have clared the test");
		else
			System.out.println("Sorry!! You have failed the test");
	}
}