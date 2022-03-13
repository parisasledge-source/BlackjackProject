package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;
import com.skilldistillery.cards.entities.Player;

public class BlackjackApp {

	static Scanner sc = new Scanner(System.in);

	private BlackjackHand hand = new BlackjackHand();
	private Deck deck = new Deck();
	private Player player = new Player();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BlackjackApp app = new BlackjackApp();

		app.start();

		input.close();
	}

	private void start() {
		Deck deck = new Deck();
		deck.shuffle();


		List<Card> cardList = new ArrayList<>();

		String userInput = "";
		//System.out.println("This hand: " + hand);
		
		do {
			

			hand.addCard(deck.dealCard());
			//cardList.add(deck.dealCard());
			
			//System.out.println("This hand: " + hand.addCard(cardList));
			player.hit();
		
			System.out.println("\nPlease enter 'h' for hit, 's' for stand: ");
			userInput = sc.next();
		} while (!userInput.equals("s"));
		
		do {
			
			cardList.add(deck.dealCard());
			System.out.println("This hand: " + cardList);
			
			
		
		} while (deck.checkDeckSize() > 10);
		
		// while (deck.checkDeckSize() > 10 );
		System.out.println("=============");
		System.out.println(hand.getHandValue());
		//hand.getHandValue();
//		int handValue = 0;
//		for (Card dealtCard : hand) {
//			System.out.println(dealtCard + " (value:" + dealtCard.getValue() + ")");
//			handValue += dealtCard.getValue();
//		}
//		System.out.println("Hand value: " + handValue);
	}
}