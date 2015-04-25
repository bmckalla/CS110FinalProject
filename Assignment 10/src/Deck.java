/**
 * @author Braden McKallagat
 * Instantiates a Deck, which is an array of cards.
 * Has a method for shuffling the deck, and 
 * appropriate getters and setters.
 */

import java.util.Random;
import java.util.ArrayList;

public class Deck {
	
	private final int HIGH_RANK = 13,
			SIZE = 52;
	private final ArrayList<Card> deck;
	private int deckSize;
	
	/**
	 * !NOTE DOES NOT HAVE CORRECT RANK YET
	 * ASK ABOUT PUBLIC CONSTANTS!
	 * Instantiates a Deck of size 52 and 
	 * creates cards to fill it. 
	 */
	public Deck() {
		deck = new ArrayList<Card>(SIZE);
		for (int x = 1; x <= HIGH_RANK; x++) {
			Card spade = new Card(14, x);
			deck.add(spade);
			Card club = new Card(15, x);
			deck.add(club);
			Card heart = new Card(16, x);
			deck.add(heart);
			Card diamond = new Card(17, x);
			deck.add(diamond);
		}
		deckSize = deck.size();
	}
	
	public void shuffle() {
		int size = deck.size();
		for (int x = 0; x < size; x++) {
			Random rand = new Random();
			int random = rand.nextInt(deck.size());
			Card temp = deck.remove(random);
			deck.add(temp);
		}
	}
	
	public void addCard(Card card) {
		deck.add(card);
	}
	
	public Card getTop() {
		Card top = deck.remove(0);
		return top;
	}
	
	public int getSize() {
		return deckSize;
	}
}
