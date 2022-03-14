package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

public class BlackjackHand extends Hand {

	public BlackjackHand() {
	}

	int handValue = 0;
	int value = 0;

	public int getHandValue() {

		for (Card dealtCard : cards) {
			int cardValue = dealtCard.getValue();
			System.out.println(dealtCard + " (value:" + dealtCard.getValue() + ")");

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

}
