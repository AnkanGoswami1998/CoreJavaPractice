//// TYPECASTING

import java.util.Scanner;

class CastingDemo  
 {
	 public static void main(String args[]) 
	 {
		 // short is of 2 bytes -32768 to 32767
		 short s1=56;
		 short s2=98;
		 
		 short sum = (short)(s1+s2); ///by default it will give arithmatic output so we have to wring short before calculating for typecasting
		 
		 System.out.println("The sum is:" + sum); 
		 
		 // byte range -128 to 127
		 byte b1=78;
		 byte b2=14;
		 
		 byte cal = (byte)(b1+b2);
		 
		 System.out.println("The cal is:" + cal);
		 
		 double f1 = 56.36;
		 double f2 = 89.36;
		 
		 float dd = (float)(f1+f2); ///to convert Double to float we use float
		 
		 System.out.println("The dd is:" + dd);
		 
		 byte b3 = 65;
		 byte b4 = 45;
		 
		 b3+=b4;  /// auto type casting b3 = b3 + b4
		 
		System.out.println("b3 is:" + b3);
	 }
 }