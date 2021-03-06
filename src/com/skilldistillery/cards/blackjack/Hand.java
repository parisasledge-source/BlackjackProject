package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.common.Card;

public abstract class Hand {

	protected List<Card> cards;

	public Hand() {
		super();
		this.cards = new ArrayList<>(52);
	}

	public void addCard(Card card) {
		this.cards.add(card);
	}

	public void clear() {
		clear();
	}

	public abstract int getHandValue();

	@Override
	public String toString() {

		String output = "Hand Value: " + getHandValue();
		return output;
	}

}