/**
 * @author Braden McKallagat
 * Instantiates a Deck, which is an array of cards.
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
	
	public Deck(Deck newDeck) {
		deckSize = newDeck.getSize();
		deck = new ArrayList<WarCard>(deckSize);
		for (int x = 0; x < deckSize; x++)
			deck.add(newDeck.showCard(x));
		this.setSize();
	}
	
	public void shuffle() {
		int size = deck.size();
		for (int x = 0; x < size; x++) {
			Random rand = new Random();
			int random = rand.nextInt(size);
			WarCard temp = deck.remove(random);
			deck.add(temp);
		}
	}
	
	public void addCard(WarCard card) {
		deck.add(card);
		this.setSize();
	}
	public void addCard(int index, WarCard card) {
		deck.add(index, card);
		this.setSize();
	}
	
	public WarCard removeTop() {
		WarCard top = deck.remove(0);
		this.setSize();
		return top;
	}
	
	public WarCard showTop() {
		WarCard top = deck.get(0);
		return top;
	}
	
	public WarCard removeCard(int x) {
		WarCard card = deck.remove(x);
		this.setSize();
		return card;
	}
	
	public WarCard showCard(int x) {
		WarCard card = deck.get(x);
		return card;
	}
	
	public void setSize() {
		deckSize = deck.size();
	}

	public int getSize() {
		return deckSize;
	}
}
