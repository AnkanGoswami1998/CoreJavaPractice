
class DataTypeDemo3
{
	public static void main(String args[])
	{
		///int x=8,y=5;
		
		///a=3 : output assigning the value to the variable a:
		///a==3 : compare the value of a to 3 : true/false 
		///a!3 : a is not equal to 3
		
		boolean x=true,y=false;
		System.out.println( " And :"+ (x&y));
		System.out.println( " OR :"+ (x|y));
		System.out.println( " Not :"+ (!x));
		System.out.println( " XOR :"+ (x^y));
		
		int a=8,b=6;
		boolean status;
		System.out.println( status = (true&&false));
		System.out.println((a<=5)&&(b>=8));
		
		System.out.println(20>>3); /// right Shift formula = 20/2^3
		System.out.println(20<<3); /// left shift formula = 20*2^3
	}
}