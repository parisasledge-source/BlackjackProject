package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.common.Card;

public abstract class Hand{
	
	protected List<Card> cards;

	public Hand() {	
		this.cards = new ArrayList<>();
	}
	
	public void addCard(Card card) {
		cards.add(card);
		
	}
	
	public void clear(){
		clear();
	}

	public int getHandValue() {
		 int handValue = 0; 
		 for (Card dealtCard : cards) { 
			 System.out.println(dealtCard
		 + " (value:" + dealtCard.getValue() + ")"); 
			 handValue += dealtCard.getValue(); 
			 } 
		 System.out.println("Hand value: " + handValue);
		return 0;
	}

	@Override
	public String toString() {
		return "Hand [cards=" + cards + "]";
	}

}