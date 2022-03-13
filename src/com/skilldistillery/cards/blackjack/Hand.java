package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.common.Card;

public abstract class Hand{
	
	protected List<Card> cards;

	public Hand() {	
		super();
		this.cards = new ArrayList<>();
	}
	
	public void addCard(Card card) {
		this.cards.add(card);
	}
	
	public void clear(){
		clear();
	}

//	public int getHandValue() {
//		
//		int handValue = 0;
//		for (Card dealtCard : cards) {
//			//System.out.println(dealtCard + " (value:" + dealtCard.getValue() +")");
//			handValue += dealtCard.getValue();
//		}
//		
//		return handValue;
//		
//	}
	
	public abstract int getHandValue();

	@Override
	public String toString() {
		return "Hand [cards=" + cards + "]" + getHandValue();
	}

}