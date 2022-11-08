package com.demo;

public class Override {

	public static void main(String args[]) {

		Person P = new Person();
		Employee E = new Employee();
		Student S = new Student();

		P.showDetails(); //// Calls the showDetails method of the Person class

		S.showDetails(); //// Calls the showDetails method of the Student class

		E.showDetails(); //// Calls the showDetails method of the Employee class
	}

}
