package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> cards = new ArrayList<Card>(52);
//	{
//		//instance initializer
//		this.cards = new ArrayList<Card>(52);
//	}
	public Deck() {
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				Card newCard = new Card(suit, rank);
				cards.add(newCard);	
			}
			
		}
		
	}

	public int checkDeckSize() {
		return cards.size();
	}

	public void shuffle() {
		Collections.shuffle(cards);
		
	}
	
	public Card dealCard() {
		return cards.remove(0);
		
	}
	
}
