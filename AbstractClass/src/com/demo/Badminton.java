package com.demo;

public class Badminton extends GameConsole { //// Inheriting the GamConsole class by keyward extends

	@Override
	void playGame() {
		System.out.println("Starting the Badminton Game....");
	}

	@Override
	void computeScore() {
		System.out.println("Implementing the abtract method of the GameConsole Class....");
	}
}
