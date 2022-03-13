package com.skilldistillery.cards.entities;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.common.Card;

public class Player {
	List<Card> hand = new ArrayList<>();
	
	public Player() {
	}
	
	public void hit() {
		
//		int handValue = 0;
//		for (Card dealtCard : hand) {
//			System.out.println(dealtCard + " (value:" + dealtCard.getValue() + ")");
//			handValue += dealtCard.getValue();
//		}
//		System.out.println("Hand value: " + handValue);
	}
	
	public void stand() {
		
	}

}
