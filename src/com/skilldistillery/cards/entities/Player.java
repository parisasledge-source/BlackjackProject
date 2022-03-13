package com.skilldistillery.cards.entities;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.blackjack.BlackjackHand;
import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class Player {
	
	//private Deck deck = new Deck();
	protected List<Card> cards = new ArrayList<>();
	private BlackjackHand hand = new BlackjackHand();
	
	public int getHandValue() {
		return hand.getHandValue();
	}
	
	public void shuffle() {
		//deck.shuffle();
	}
	
	public String displayCards() {
		return hand.toString();
	}

	
}
