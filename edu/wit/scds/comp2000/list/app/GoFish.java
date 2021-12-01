package edu.wit.scds.comp2000.list.app;

import java.util.ArrayList;
import java.util.Scanner;

public class GoFish {
	Scanner scan = new Scanner(System.in);
	public Deck goFishDeck;
	private int totalPoints;
	private Player player1 = new Player(1);
	private Player player2 = new Player(2);
	private Player player3 = new Player(3);
	private Player player4 = new Player(4);
	private Player[] playerArray = {player1, player2, player3, player4};

	
	public GoFish() {
		setup();
	}
	public void run() {
		System.out.printf("***** Welcome to Go Fish ******%n");
		while(this.totalPoints != 13) {
			for(int i = 0; i < 4; i++) {
				System.out.println("Who would you like to ask for a card?");
				int selectedPlayer = scan.nextInt();
				Hand checkingHand = playerArray[selectedPlayer].getHand();
				System.out.println("What Card are you looking for");
				String cardRank = scan.next();
				if(checkingHand.contains(cardRank)) {
					System.out.print("they have the Card");
				}
			}
		}
		
	}
	public void setup() {
		totalPoints = 0;
		this.goFishDeck = new Deck();
		//give each player 4 cards
		for(int i = 0; i < playerArray.length; i++) {
			for(int j = 0; j < 4; j++) {
				playerArray[i].addCard(goFishDeck.pickRandomCard());
			}
		}
		System.out.println(player1.toString());
	}

	public static void main(String[] args) {
		GoFish theGame = new GoFish();
		theGame.run();
	}
}
