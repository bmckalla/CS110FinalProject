/**
 * @author Braden McKallagat
 * Instantiates a Deck, which is an array of cards.
 * Has a method for shuffling the deck, and 
 * appropriate getters and setters.
 */

import java.util.Random;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Deck {
	
	private final int SIZE = 52;
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
	
	public Card removeTop() {
		Card top = deck.remove(0);
		return top;
	}
	
	public Card showTop() {
		Card top = deck.get(0);
		return top;
	}
	
	public Card removeCard(int x) {
		Card card = deck.remove(x);
		return card;
	}
	
	public Card showCard(int x) {
		Card card = deck.get(x);
		return card;
	}
	
	public void setSize() {
		deckSize = deck.size();
	}

	public int getSize() {
		return deckSize;
	}
}
