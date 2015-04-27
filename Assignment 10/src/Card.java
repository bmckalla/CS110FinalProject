/**
 * @author Braden McKallagat
 * Creates a card object. 
 */

import javax.swing.*;

public class Card {
	
	// Constants for suits and special ranks of cards
	public final int ACE = 1,
			JACK = 11,
			QUEEN = 12,
			KING = 13,
			SPADES = 14,
			CLUBS = 15,
			HEARTS = 16,
			DIAMONDS = 17;
	
	private int rank; // Rank for card
	private int suit; // Suit of card
	private ImageIcon cardIcon;
	
	public Card(int suitType, int rankType) {
		suit = suitType;
		rank = rankType;
		if (suit == 14) {
			if (rank == 1) 
				cardIcon = new ImageIcon("/Card_Pics/aces.jpg");
			else if (rank == 2)
				cardIcon = new ImageIcon("/Card_Pics/2s.jpg");
			else if (rank == 3)
				cardIcon = new ImageIcon("/Card_Pics/3s.jpg");
			else if (rank == 4)
				cardIcon = new ImageIcon("/Card_Pics/4s.jpg");
			else if (rank == 5)
				cardIcon = new ImageIcon("/Card_Pics/5s.jpg");
			else if (rank == 6)
				cardIcon = new ImageIcon("/Card_Pics/6s.jpg");
			else if (rank == 7)
				cardIcon = new ImageIcon("/Card_Pics/7s.jpg");
			else if (rank == 8)
				cardIcon = new ImageIcon("/Card_Pics/8s.jpg");
			else if (rank == 9)
				cardIcon = new ImageIcon("/Card_Pics/9s.jpg");
			else if (rank == 10)
				cardIcon = new ImageIcon("/Card_Pics/10s.jpg");
			else if (rank == 11)
				cardIcon = new ImageIcon("/Card_Pics/jackss.jpg");
			else if (rank == 12)
				cardIcon = new ImageIcon("/Card_Pics/queens.jpg");
			else if (rank == 13)
				cardIcon = new ImageIcon("/Card_Pics/kings.jpg");
		} else if (suit == 15) {
			if (rank == 1) 
				cardIcon = new ImageIcon("/Card_Pics/acec.jpg");
			else if (rank == 2)
				cardIcon = new ImageIcon("/Card_Pics/2c.jpg");
			else if (rank == 3)
				cardIcon = new ImageIcon("/Card_Pics/3c.jpg");
			else if (rank == 4)
				cardIcon = new ImageIcon("/Card_Pics/4c.jpg");
			else if (rank == 5)
				cardIcon = new ImageIcon("/Card_Pics/5c.jpg");
			else if (rank == 6)
				cardIcon = new ImageIcon("/Card_Pics/6c.jpg");
			else if (rank == 7)
				cardIcon = new ImageIcon("/Card_Pics/7c.jpg");
			else if (rank == 8)
				cardIcon = new ImageIcon("/Card_Pics/8c.jpg");
			else if (rank == 9)
				cardIcon = new ImageIcon("/Card_Pics/9c.jpg");
			else if (rank == 10)
				cardIcon = new ImageIcon("/Card_Pics/10c.jpg");
			else if (rank == 11)
				cardIcon = new ImageIcon("/Card_Pics/jackc.jpg");
			else if (rank == 12)
				cardIcon = new ImageIcon("/Card_Pics/queenc.jpg");
			else if (rank == 13)
				cardIcon = new ImageIcon("/Card_Pics/kingc.jpg");
		} else if (suit == 16) {
			if (rank == 1) 
				cardIcon = new ImageIcon("/Card_Pics/aceh.jpg");
			else if (rank == 2)
				cardIcon = new ImageIcon("/Card_Pics/2h.jpg");
			else if (rank == 3)
				cardIcon = new ImageIcon("/Card_Pics/3h.jpg");
			else if (rank == 4)
				cardIcon = new ImageIcon("/Card_Pics/4h.jpg");
			else if (rank == 5)
				cardIcon = new ImageIcon("/Card_Pics/5h.jpg");
			else if (rank == 6)
				cardIcon = new ImageIcon("/Card_Pics/6h.jpg");
			else if (rank == 7)
				cardIcon = new ImageIcon("/Card_Pics/7h.jpg");
			else if (rank == 8)
				cardIcon = new ImageIcon("/Card_Pics/8h.jpg");
			else if (rank == 9)
				cardIcon = new ImageIcon("/Card_Pics/9h.jpg");
			else if (rank == 10)
				cardIcon = new ImageIcon("/Card_Pics/10h.jpg");
			else if (rank == 11)
				cardIcon = new ImageIcon("/Card_Pics/jackh.jpg");
			else if (rank == 12)
				cardIcon = new ImageIcon("/Card_Pics/queenh.jpg");
			else if (rank == 13)
				cardIcon = new ImageIcon("/Card_Pics/kingh.jpg");
		} else if (suit == 17) {
			if (rank == 1) 
				cardIcon = new ImageIcon("/Card_Pics/aced.jpg");
			else if (rank == 2)
				cardIcon = new ImageIcon("/Card_Pics/2d.jpg");
			else if (rank == 3)
				cardIcon = new ImageIcon("/Card_Pics/3d.jpg");
			else if (rank == 4)
				cardIcon = new ImageIcon("/Card_Pics/4d.jpg");
			else if (rank == 5)
				cardIcon = new ImageIcon("/Card_Pics/5d.jpg");
			else if (rank == 6)
				cardIcon = new ImageIcon("/Card_Pics/6d.jpg");
			else if (rank == 7)
				cardIcon = new ImageIcon("/Card_Pics/7d.jpg");
			else if (rank == 8)
				cardIcon = new ImageIcon("/Card_Pics/8d.jpg");
			else if (rank == 9)
				cardIcon = new ImageIcon("/Card_Pics/9d.jpg");
			else if (rank == 10)
				cardIcon = new ImageIcon("/Card_Pics/10d.jpg");
			else if (rank == 11)
				cardIcon = new ImageIcon("/Card_Pics/jackd.jpg");
			else if (rank == 12)
				cardIcon = new ImageIcon("/Card_Pics/queend.jpg");
			else if (rank == 13)
				cardIcon = new ImageIcon("/Card_Pics/kingd.jpg");
		}
	}
	
	public int getSuit() {
		return suit;
	}
	
	public int getRank() {
		return rank;
	}
	
	public ImageIcon getCardImg() {
		return cardIcon;
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
