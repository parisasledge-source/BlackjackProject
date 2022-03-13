package com.skilldistillery.cards.entities;

import com.skilldistillery.cards.blackjack.BlackjackHand;
import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class Dealer extends Player{
	
	private BlackjackHand hand = new BlackjackHand();
	private Deck deck = new Deck();
	
	public int deckSize() {
		return deck.checkDeckSize();
	}
	
	public void shuffle() {
		deck.shuffle();
	}
	
	public Card dealCard() {
		return deck.dealCard();
		
	}
	
	

	
	

}
