package edu.wit.scds.comp2000.list.app;

public class Player 
{
	private Hand hand;
	private static int nextId = 1;
	private final int id;
	public Player(int playerNum)
	{	
		this.id = playerNum;
		this.hand = new Hand();
	}
	public void addCard(Card c) {
		this.hand.addCard(c);
	}
	public String toString() {
		return String.format("Player %,d has cards %,d", this.id, this.hand.getSize());
	}
	public Hand getHand() {
		return this.hand;
	}

}
