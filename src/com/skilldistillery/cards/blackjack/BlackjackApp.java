package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

import com.skilldistillery.cards.common.Deck;

public class BlackjackApp {

	private BlackjackHand hand = new BlackjackHand();
	private Deck deck = new Deck();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BlackjackApp app = new BlackjackApp();
		
		app.start();
		
		input.close();
	}

	private void start() {
		
		hand.addCard(deck.dealCard());

	}

}