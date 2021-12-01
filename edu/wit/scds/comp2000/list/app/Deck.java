package edu.wit.scds.comp2000.list.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
	final Suit[] suits = Suit.values() ;
	final Rank[] ranks = Rank.values() ;
	final List<Card> cards = new ArrayList<>( suits.length * ranks.length ) ;
		public Deck(){		
		// generate a deck of cards
		for ( final Suit suit : suits )
		    {
		    // skip placeholder suit
		    if ( suit.equals( Suit.NONE ) )
		        {
		        continue ;
		        }
		    
		    for ( final Rank rank : ranks )
		        {
		        // skip non-playing card(s) - Joker
		        if ( rank.equals( Rank.JOKER ) )
		            {
		            continue ;
		            }
		        
		        // build a card
		        Card newCard = new Card( suit, rank ) ;
		        
		        // keep track of it
		        cards.add( newCard ) ;
		        }
		    }
	}
	public Card pickRandomCard() {
		Random random = new Random();
		int i = random.nextInt(cards.size());
		Card randomCard = cards.get(i);
		cards.remove(i);
		return randomCard;
	}
}
