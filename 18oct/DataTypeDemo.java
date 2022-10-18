

import java.util.Scanner;

class DataTypeDemo
 {
	 public static void main(String args[]) 
	 {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter a Character:");
		 
		 char charValue = sc.next().charAt(0);  /// to take any character by user
		 int asciiValue = charValue;        /// to get ascii value of any character
		 
		 System.out.println("The ascii Value of "+ charValue +" is " + asciiValue); /// print the ascii value
	 }
 }