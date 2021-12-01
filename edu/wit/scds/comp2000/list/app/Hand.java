package edu.wit.scds.comp2000.list.app;

import java.util.ArrayList;

public class Hand {
	
	private ArrayList<Card> Cards;
	
	public Hand(){
		this.Cards = new ArrayList<>();
	}
	public void addCard(Card card) {
		this.Cards.add(card);
	}
	public void checkForPoints() {
		
	}
	public int getSize() {
		return this.Cards.size();
	}
	public boolean contains(String s){
		System.out.print(s);
		System.out.print(Cards);
		return Cards.contains(s);
	}
}
