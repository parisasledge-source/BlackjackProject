package com.skilldistillery.cards.entities;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.blackjack.BlackjackHand;
import com.skilldistillery.cards.blackjack.Hand;
import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class Player {
	private Deck deck = new Deck();
	List<Card> list = new ArrayList<>();
	private BlackjackHand hand = new BlackjackHand();
	public Player() {
	}
	
	/*
	 * public Card hit() {
	 * 
	 * 
	 * hand.addCard(deck.dealCard()); return list ;
	 */
		
//		int handValue = 0;
//		for (Card dealtCard : hand) {
//			System.out.println(dealtCard + " (value:" + dealtCard.getValue() + ")");
//			handValue += dealtCard.getValue();
//		}
//		System.out.println("Hand value: " + handValue);
	//}
	
	public void stand() {
		
	}

}
