package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

public class BlackjackHand extends Hand{
	
	public BlackjackHand() {
	}
	
	public void addCard(Card card) {
	}
	
//	public int getHandValue() {
//		
//		for (Card card : cards) {	
//		}
//		return 0;
		
	//}
	
	public boolean isBlackJack() {
		System.out.println("Black Jack! Yohooo!");
		return false;
		
	}
	
	public boolean isBust() {
		System.out.println("Busted! Too Bad!");
		return false;
		
	}
	
	public int getHandValue() {
	
	int handValue = 0;
	for (Card dealtCard : cards) {
		int cardValue = dealtCard.getValue();
		//System.out.println(dealtCard + " (value:" + dealtCard.getValue() +")");		
		handValue += cardValue;
	}
	
	return handValue;
	
}
	
	@Override
	public String toString() {
		
		String output = "Hand Value: " + getHandValue();
		return output;
	}

}
