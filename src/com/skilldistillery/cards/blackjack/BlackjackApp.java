package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;
import com.skilldistillery.cards.entities.Dealer;
import com.skilldistillery.cards.entities.Player;

public class BlackjackApp {

	static Scanner sc = new Scanner(System.in);

	private BlackjackHand hand = new BlackjackHand();
	// private Deck deck = new Deck();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BlackjackApp app = new BlackjackApp();

		app.start();

		input.close();
	}

	private void start() {
		Deck deck = new Deck();
		Dealer dealer = new Dealer();
		Player player = new Player();

		dealer.shuffle();

		hand.addCard(dealer.dealCard());

		List<Card> playerHand;
		List<Card> dealerHand;

		String userInput1, userInput2, userInput3 = "", userInput4 = "";
		// System.out.println("This hand: " + hand);

		System.out.println("Are you ready to play blackjack? (y/n)");
		userInput1 = sc.next();

		if (userInput1.equals("y")) {

			do {
				
				System.out.println("Deal? (y/n)");
				userInput2 = sc.next();

				if (userInput2.equals("y")) {

				playerHand = new ArrayList<>();
				dealerHand = new ArrayList<>();

				playerHand.add(dealer.dealCard());
				System.out.println("Player's first card: " + playerHand.get(0));
				
				dealerHand.add(dealer.dealCard());
				System.out.println("Dealer's first card: Hidden ");
				
				playerHand.add(dealer.dealCard());
				System.out.println("Player's second card: " + playerHand.get(1));

				dealerHand.add(dealer.dealCard());
				System.out.println("Dealer's second card: " + dealerHand.get(1));
				
				System.out.println("Deck size: " + dealer.deckSize());
				
				while (!userInput3.equals("s")) {
					playerHand.add(dealer.dealCard());

					
					System.out.println("\nPlease enter 'h' for hit, 's' for stand: ");
					userInput3 = sc.next();
					
					System.out.println("Player's hand: " + playerHand);
					System.out.println("Deck size: " + dealer.deckSize());
					System.out.println("Hand value: " + player.displayValue());

					// System.out.println("This hand: " + hand);
				} ;


				do {
					dealerHand.add(dealer.dealCard());

					System.out.println("Dealer's hand: " + dealerHand);
					System.out.println("Deck size: " + dealer.deckSize());

					System.out.println("\nPlease enter 'h' for hit, 's' for stand: ");
					userInput4 = sc.next();

					// System.out.println("This hand: " + hand);
				} while (!userInput4.equals("s"));

				}else if(userInput2 == "n"){
					System.out.println("You have chosen to quit the game.\nHave a nice day!");
					break;
				}
			} while ((deck.checkDeckSize() > 10));
			
		}else if(userInput1 == "n"){
			System.out.println("See you later!");
		}
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