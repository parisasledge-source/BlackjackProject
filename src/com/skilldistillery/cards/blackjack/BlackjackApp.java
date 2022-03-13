package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;
//import com.skilldistillery.enums.solutions.cards.Card;

public class BlackjackApp {

	static Scanner sc = new Scanner(System.in);
	
	private BlackjackHand hand = new BlackjackHand();
	private Deck deck = new Deck();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BlackjackApp app = new BlackjackApp();
		
		app.start();
		
		input.close();
	}

	private void start() {
		//Deck deck = new Deck();
		deck.shuffle();
		
		hand.addCard(deck.dealCard());
		
		List<Card> hand = new ArrayList<>();
		
		String userInput = "";
		do{
			System.out.println("h for hit, s for stand");
			
			userInput = sc.next();
			
			if (userInput == "h") {
				
				hand.add(deck.dealCard());
				System.out.println(deck.dealCard());
			}
			
			
		}while (deck.checkDeckSize() > 10);
		
		for (int i = 0; i < 5; i++) {
		}
		
		int handValue = 0;
		for (Card dealtCard : hand) {
			System.out.println(dealtCard + " (value:" + dealtCard.getValue() +")");
			handValue += dealtCard.getValue();
		}
		System.out.println("Hand value: " + handValue);
	}
}