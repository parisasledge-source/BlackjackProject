package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;
import com.skilldistillery.cards.entities.Dealer;

public class BlackjackApp {

	static Scanner sc = new Scanner(System.in);

	private BlackjackHand hand = new BlackjackHand();
	//private Deck deck = new Deck();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BlackjackApp app = new BlackjackApp();

		app.start();

		input.close();
	}

	private void start() {
		Deck deck = new Deck();
		Dealer dealer = new Dealer();
		
		dealer.shuffle();

		hand.addCard(dealer.dealCard());

		List<Card> playerHand = new ArrayList<>();

		String userInput = "";
		//System.out.println("This hand: " + hand);
		
		
		
		do {
			
			playerHand.add(dealer.dealCard());
			
			
			System.out.println("Players hand: " + playerHand);
			System.out.println("Deck size: " + dealer.deckSize());
		
			System.out.println("\nPlease enter 'h' for hit, 's' for stand: ");
			userInput = sc.next();
			
			//System.out.println("This hand: " + hand);
			
			
			
		} while ((!userInput.equals("s")) && (deck.checkDeckSize() > 10));
		
//		do {
//			
//			hand.add(deck.dealCard());
//			System.out.println("This hand: " + hand);
//			System.out.println("Deck size: " + deck.checkDeckSize());
//			
//		
//		} while (deck.checkDeckSize() > 10);
		
		// while (deck.checkDeckSize() > 10 );


		/*
		 * int handValue = 0; for (Card dealtCard : hand) { System.out.println(dealtCard
		 * + " (value:" + dealtCard.getValue() + ")"); handValue +=
		 * dealtCard.getValue(); } System.out.println("Hand value: " + handValue);
		 */
	}
}