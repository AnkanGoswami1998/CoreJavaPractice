
class DataTypeDemo2
{
	public static void main(String args[])
	{
		///num++ // post increament : value is used and the incremented
		///++num // pre increament : value is first increamented and then used 
		int num1 = 67;
		int sum = ++num1;
		///Decrement
		///num--
		///--num
		int num2 = 45;
		int minus = --num2;
		///~ tilde : negetive of each numbers
		/// as negetive of 0 is -1 
		int num3 = 6;
		int negetive = ~num3;
		
		int num4 = 104;
		int d = 7;
		
	
	/// printing the values
	System.out.println("value of sum using ++num1 :" + sum);
	System.out.println("value of minus using --num1 :" + minus);
	System.out.println("value of negetive using ~num1 :" + negetive);
	System.out.println("value of divsion1 :" + num4/d);
	System.out.println("value of reminder :" + num4%d);
	System.out.println(num1>92);
	}
}
 