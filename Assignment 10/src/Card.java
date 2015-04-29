/**
 * @author Braden McKallagat
 * Creates a card object. 
 */


public class Card {
	
	// Constants for suits and special ranks of cards
	public static final int ACE = 1,
			JACK = 11,
			QUEEN = 12,
			KING = 13,
			SPADES = 14,
			CLUBS = 15,
			HEARTS = 16,
			DIAMONDS = 17;
	
	private int rank; // Rank for card
	private int suit; // Suit of card
	
	public Card(int suitType, int rankType) {
		suit = suitType;
		rank = rankType;
	}
	
	public int getSuit() {
		return suit;
	}
	
	public int getRank() {
		return rank;
	}
	
	public boolean equals(Card otherCard) {
		if (this.equals(otherCard)) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
