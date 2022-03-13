package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.skilldistillery.cards.blackjack.Hand;

public class Deck {

	private List<Card> cards;

	public Deck() {
		cards = new ArrayList<Card>(52);
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				Card newCard = new Card(suit, rank);
				cards.add(newCard);	
			}
			
		}
		
	}

	public int checkDeckSize() {
		return cards.size() + 1;
	}

	public void shuffle() {
		Collections.shuffle(cards);
		
	}
	
	public Card dealCard() {
		return cards.remove(0);
		
	}
	
	public void dealCard(Hand hand) {
		
		
	}
	
	
	
}
