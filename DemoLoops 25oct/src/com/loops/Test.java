/// This is demo to class package

package com.loops;

import com.loops.Demo;


public class Test {
	
	
	///Main Method
	public static void main(String args[]) {
		
		///creating a object of Demo class
		Demo obj1 = new Demo();
		
		///Calling the method
		/// all method should be public
		
		Demo.printMessage(); ///Calling method directly with name of class : no object required
		
		
		obj1.printAge();
		
		
	} /// End of main method

}
