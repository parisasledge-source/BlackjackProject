package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class BlackjackHand extends Hand{
	
	//Deck deck = new Deck();
	
	public BlackjackHand() {
	}
	
	//public void addCard(Card card) {
	//}
	
	public int getHandValue() {
		int handValue = 0;
		
		for (Card dealtCard : this.cards) {
			//cards.add(deck.dealCard());
			int cardValue = dealtCard.getValue();
			//System.out.println(dealtCard + " (value:" + dealtCard.getValue() +")");		
			handValue += cardValue;
		}
		return handValue;
		
	}
	
	public boolean isBlackJack() {
		System.out.println("Black Jack! Yohooo!");
		return false;
		
	}
	
	public boolean isBust() {
		System.out.println("Busted! Too Bad!");
		return false;
		
	}
	
//	List<Card> hand = new ArrayList<>();
//	for (int i = 0; i < howManyCards; i++) {
//		hand.add(deck.dealCard());
//	}
	


	
//	public int getHandValue() {
//	
//	int handValue = 0;
//	for (Card dealtCard : cards) {
//		int cardValue = dealtCard.getValue();
//		//System.out.println(dealtCard + " (value:" + dealtCard.getValue() +")");		
//		handValue += cardValue;
//	}
//	
//	return handValue;
//	
//}
//	
//	@Override
//	public String toString() {
//		return " (Hand Value: " + cards + ")" + getHandValue();
//	}

}
