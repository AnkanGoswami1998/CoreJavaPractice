//// Abstract Class Example 
//// 7th November

package com.demo;

public abstract class GameConsole { //// abstract class

	int score;

	void displayScore() {
		System.out.println("The displayScore Method..");
	}

	abstract void computeScore();

	abstract void playGame();
}
