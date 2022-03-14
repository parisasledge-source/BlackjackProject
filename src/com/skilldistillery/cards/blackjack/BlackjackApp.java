package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class BlackjackApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BlackjackApp app = new BlackjackApp();

		app.start();

		input.close();
	}

	private void start() {
		
		
		BlackjackUtility.run();
	
	}
}