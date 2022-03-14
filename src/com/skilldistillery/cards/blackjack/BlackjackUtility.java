package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;
import com.skilldistillery.cards.entities.Dealer;

public class BlackjackUtility {

	private static BlackjackHand hand = new BlackjackHand();

	static Scanner sc = new Scanner(System.in);

	static void run() {

		Deck deck = new Deck();
		Dealer dealer = new Dealer();

		dealer.shuffle();

		hand.addCard(dealer.dealCard());

		List<Card> playerHand = null;
		List<Card> dealerHand;

		String userInput1, userInput2, userInput3 = "", userInput4 = "";

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
					//int a = dealerHand.get(0).getValue();
					
					dealerHand.add(dealer.dealCard());
					System.out.println("Dealer's first card: Hidden ");
					//int b = dealerHand.get(1).getValue();
					//int c = a + b;
					
					playerHand.add(dealer.dealCard());
					System.out.println("Player's second card: " + playerHand.get(1));

					dealerHand.add(dealer.dealCard());
					System.out.println("Dealer's second card: " + dealerHand.get(1));
					
//					if (c == 21) {
//						
//						System.out.println("Dealer's first card: " + dealerHand.get(0));
//						System.out.println("Dealer's second card: " + dealerHand.get(1));
//						hand.isBlackJack();
//						System.out.println("Dealer wins!");
//						//break;	
//					}

					System.out.println("Deck size: " + dealer.deckSize());

					System.out.println("\nPlease enter 'h' for hit, 's' for stand: ");
					userInput3 = sc.next();

					do {
						playerHand.add(dealer.dealCard());

						System.out.println("Player's hand: " + playerHand);
						System.out.println("Deck size: " + dealer.deckSize());
						int playerHandValue = 0;
						for (Card dealtCard : playerHand) {
							playerHandValue += dealtCard.getValue();
						}
						System.out.println("Hand value: " + playerHandValue);
						
						if (playerHandValue > 21) {
							hand.isBust();
							break;
						}else if (playerHandValue == 21) {
							hand.isBlackJack();
							break;
						}

						System.out.println("\nPlease enter 'h' for hit, 's' for stand: ");
						userInput3 = sc.next();
					} while (!userInput3.equals("s"));

					while (!userInput4.equals("s")) {
						//if (hand.isBust()) {
							//break;
						//}
						//if (hand.isBlackJack()) {
							//break;
						//}
						
						System.out.println("Dealer's first card: " + dealerHand.get(0));
						System.out.println("Dealer's second card: " + dealerHand.get(1));
						
						
						
						System.out.println("\nPlease enter 'h' for hit, 's' for stand: ");
						userInput4 = sc.next();
						
						dealerHand.add(dealer.dealCard());

						System.out.println("Dealer's hand: " + dealerHand);
						System.out.println("Deck size: " + dealer.deckSize());
						int dealerHandValue = 0;
						for (Card dealtCard : dealerHand) {
							dealerHandValue += dealtCard.getValue();
						}
						System.out.println("Hand value: " + dealerHandValue);

						System.out.println("\nPlease enter 'h' for hit, 's' for stand: ");
						userInput4 = sc.next();

					} ;

				} else if (userInput2 == "n") {
					System.out.println("You have chosen to quit the game.\nHave a nice day!");
					break;
				}
			} while ((deck.checkDeckSize() > 10));

		} else if (userInput1 == "n") {
			System.out.println("See you later!");
		}
	}

}
