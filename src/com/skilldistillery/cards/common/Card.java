package com.skilldistillery.cards.common;

import java.util.Objects;

public class Card {
	
	private Suit suit;
	private Rank rank;
	
	//TODO ... everything else 
	public Card(Suit suit, Rank rank) {
		super();
		this.suit = suit;
		this.rank = rank;
	}

	@Override
	public int hashCode() {
		return Objects.hash(rank, suit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return rank == other.rank && suit == other.suit;
	}


	@Override
	public String toString() {
	    StringBuilder builder = new StringBuilder();
	    builder.append(rank).append(" of ").append(suit);
	    return builder.toString();
	}
	
	  public int getValue() {
		    return rank.getValue();
		  }
	
	

}
