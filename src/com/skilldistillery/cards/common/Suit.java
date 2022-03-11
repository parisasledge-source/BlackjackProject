package com.skilldistillery.cards.common;

public enum Suit {
	
	
	HEARTS("Queen of hearts"), SPADES("Mother of spades"), CLUBS("King of clubs"), DIAMONDS("Legend of diamonds");
	
	private String name;
	
	private Suit(String suitName) {
		name = suitName;	
	}
	
	public void setName(String name) {
		this.name = name;
	}

//	@Override
//	  public String toString() {
//	    return this.name;
//	  }

	  public String getName() {
	    return name;
	  }
	
}
