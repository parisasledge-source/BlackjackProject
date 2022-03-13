package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public abstract class Hand{
	private Deck deck = new Deck();
	protected List<Card> cards;

	public Hand() {	
		this.cards = new ArrayList<>();
	}
	
	public void addCard(Card card) {
		cards.add(deck.dealCard());
		
	}
	
	public void clear(){
		
	}

	public int getHandValue() {
		
		int handValue = 0;
		for (Card dealtCard : cards) {
			//System.out.println(dealtCard + " (value:" + dealtCard.getValue() + ")");
			handValue += dealtCard.getValue();
		}
		//System.out.println("Hand value: " + handValue);
		return handValue;
	}

	@Override
	public String toString() {
		return "Hand [cards=" + cards + "]";
	}
	
	
	
	
	
	
	

}
