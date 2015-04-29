/**
 * @author Braden McKallagat
 * Instantiates a Deck, which is an array of WarCards.
 * Has a method for shuffling the deck, and 
 * appropriate getters and setters.
 */

import java.util.Random;
import java.util.ArrayList;

public class Deck {
	
	private final int SIZE = 52;
	private final ArrayList<WarCard> deck;
	private int deckSize;
	
	/**
	 * Instantiates a Deck of size 52 and 
	 * sets deck size.
	 */
	public Deck() {
		deck = new ArrayList<WarCard>(SIZE);
		deckSize = deck.size();
	}
	
	/**
	 * Alternate copy constructor
	 * @param newDeck
	 */
	public Deck(Deck newDeck) {
		deckSize = newDeck.getSize();
		deck = new ArrayList<WarCard>(deckSize);
		for (int x = 0; x < deckSize; x++)
			deck.add(newDeck.showCard(x));
		this.setSize();
	}
	
	/**
	 * Randomize deck
	 */
	public void shuffle() {
		int size = deck.size();
		for (int x = 0; x < size; x++) {
			Random rand = new Random();
			int random = rand.nextInt(size);
			WarCard temp = deck.remove(random);
			deck.add(temp);
		}
	}
	
	/**
	 * Adds a card
	 * @param card
	 */
	public void addCard(WarCard card) {
		deck.add(card);
		this.setSize();
	}
	
	/**
	 * Adds a card at a specific index
	 * @param index
	 * @param card
	 */
	public void addCard(int index, WarCard card) {
		deck.add(index, card);
		this.setSize();
	}
	
	/**
	 * Removes the top card
	 * @return
	 */
	public WarCard removeTop() {
		WarCard top = deck.remove(0);
		this.setSize();
		return top;
	}
	
	/**
	 * Shows the top card
	 * @return
	 */
	public WarCard showTop() {
		WarCard top = deck.get(0);
		return top;
	}
	
	/**
	 * Removes card at specific index
	 * @param x
	 * @return
	 */
	public WarCard removeCard(int x) {
		WarCard card = deck.remove(x);
		this.setSize();
		return card;
	}
	
	/**
	 * Shows card at specific index
	 * @param x
	 * @return
	 */
	public WarCard showCard(int x) {
		WarCard card = deck.get(x);
		return card;
	}
	
	/**
	 * Sets the size of the deck
	 */
	public void setSize() {
		deckSize = deck.size();
	}

	/**
	 * Returns the size of the deck
	 * @return
	 */
	public int getSize() {
		return deckSize;
	}
}
