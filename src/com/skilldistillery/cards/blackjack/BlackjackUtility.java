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
		
		int bustedPlayerValue = 0;
		int pushPlayerValue = 0;

		if (userInput1.equals("y")) {

			do {

				System.out.println("Deal? (y/n)");
				userInput2 = sc.next();

				if (userInput2.equals("y")) {

					playerHand = new ArrayList<>();
					dealerHand = new ArrayList<>();

					playerHand.add(dealer.dealCard());
					// int a = dealerHand.get(0).getValue();

					dealerHand.add(dealer.dealCard());
					// int b = dealerHand.get(1).getValue();
					// int c = a + b;

					playerHand.add(dealer.dealCard());

					dealerHand.add(dealer.dealCard());

					System.out.println("Player's first card: " + playerHand.get(0));
					System.out.println("Player's second card: " + playerHand.get(1));
					int a1 = playerHand.get(0).getValue();
					int b1 = playerHand.get(1).getValue();
					int c1 = a1 + b1;
					

					System.out.println("Hand value: " + c1);
					System.out.println(" ");
					
					if (c1 == 21) {
						pushPlayerValue = c1;
						hand.isBlackJack();
						//break;
					}
					
					System.out.println("Dealer's first card: Hidden ");
					System.out.println("Dealer's second card: " + dealerHand.get(1));
					int a2 = dealerHand.get(0).getValue();
					int b2 = dealerHand.get(1).getValue();
					int c2 = a2 + b2;
					
					if (c2 == 21) {
						//pushPlayerValue = c1;
						hand.isBlackJack();
						System.out.println("Dealer's second card: " + dealerHand.get(0));
						System.out.println("Dealer's second card: " + dealerHand.get(1));
						break;
					}

					System.out.println("Hand value: " + "Hidden + " + b2 );
					System.out.println(" ");
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
							bustedPlayerValue = playerHandValue;
							hand.isBust();
							System.out.println("\nDealer wins!");
							break;
						} else if (playerHandValue == 21) {
							pushPlayerValue = playerHandValue;
							//hand.isBlackJack();
							break;
						}

						System.out.println("\nPlease enter 'h' for hit, 's' for stand: ");
						userInput3 = sc.next();
					} while (!userInput3.equals("s"));

					// System.out.println(bustedPlayerValue);

					int dealerHandValue = 0;
					do {
						// if (hand.isBust()) {
						// break;
						// }
						// if (hand.isBlackJack()) {
						// break;
						// }

						System.out.println("\nDealer's first card: " + dealerHand.get(0));
						System.out.println("Dealer's second card: " + dealerHand.get(1));
						int a3 = dealerHand.get(0).getValue();
						int b3 = dealerHand.get(1).getValue();
						int c3 = a3 + b3;

						System.out.println("Hand value: " + c3 );
						System.out.println(" ");
						

						if (bustedPlayerValue > 21) {
							// hand.isBust();
							break;
							// }else if (bustedPlayerValue == 21) {
							// hand.isBlackJack();
							// System.out.println("Dealer wins!");
							// break;
						}

						int a = dealerHand.get(0).getValue();
						int b = dealerHand.get(1).getValue();

						int c = a + b;

						if (c >= 17) {
							System.out.println("");
							break;

						} else {

							System.out.println("Adding a dealer card... ");
							// System.out.println("\nPlease enter 'h' for hit, 's' for stand: ");
							// userInput4 = sc.next();

							dealerHand.add(dealer.dealCard());

							System.out.println("Dealer's hand: " + dealerHand);
							System.out.println("Deck size: " + dealer.deckSize());
							dealerHandValue = 0;
							for (Card dealtCard : dealerHand) {
								dealerHandValue += dealtCard.getValue();
							}
							System.out.println("Hand value: " + dealerHandValue);

							// System.out.println("\nPlease enter 'h' for hit, 's' for stand: ");
							// userInput4 = sc.next();
							if (dealerHandValue > 21) {
								hand.isBust();
								System.out.println("Player wins!");
								break;
							} else if (dealerHandValue == 21 && pushPlayerValue == 21) {
								System.out.println("Push!");
								//hand.isBlackJack();
								break;
							}else if (dealerHandValue == 21 && pushPlayerValue < 21){
								//hand.isBlackJack();
								System.out.println("Dealer wins!");
								break;
							}else if (dealerHandValue < 21 && pushPlayerValue == 21) {
								//hand.isBlackJack();
								System.out.println("Player wins!");
								break;
							}else if (dealerHandValue < 21 && pushPlayerValue < 21){
								//hand.isBlackJack();
								//System.out.println("Dealer wins!");
								
								if (dealerHandValue > pushPlayerValue) {
									System.out.println("Dealer wins!");
								}else if (dealerHandValue < pushPlayerValue) {
									System.out.println("Dealer wins!");
								}else {
									System.out.println("Push!");
								}
								break;
							}
							
						}

					} while (dealerHandValue < 17);

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
