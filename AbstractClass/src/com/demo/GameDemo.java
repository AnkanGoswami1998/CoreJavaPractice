package com.demo;

public abstract class GameDemo {

	public static void main(String args[]) {

		Badminton obj1 = new Badminton();
		obj1.playGame();
		obj1.computeScore();
		obj1.displayScore();

	}

}
