package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

public class BlackjackHand extends Hand{
	
	public BlackjackHand() {
		super();
	}
	
	public void addCard(Card card) {
	}
	
//	public int getHandValue() {
//		
//		for (Card card : cards) {	
//		}
//		return 0;
//		
//	}
	
	public boolean isBlackJack() {
		return false;
		
	}
	
	public boolean isBust() {
		return false;
		
	}
	
	public int getHandValue() {
	
	int handValue = 0;
	for (Card dealtCard : cards) {
		//System.out.println(dealtCard + " (value:" + dealtCard.getValue() +")");		
		handValue += dealtCard.getValue();
	}
	
	return handValue;
	
}

//	public String showCard() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public String showCard2() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	

}