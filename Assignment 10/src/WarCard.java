import javax.swing.ImageIcon;

/**
 * @author Braden McKallagat
 * Class extends the card class and adds 
 * and a field for the card's image. 
 */
public class WarCard extends Card {
	
	private ImageIcon cardIcon;
	
	/**
	 * Constructor takes in a suit and rank
	 * and calls the super to create those fields.
	 * It then determines which card picture to use
	 * and sets that to the appopriate field.
	 * @param suit
	 * @param rank
	 */
	public WarCard(int suit, int rank) {
		super(suit, rank);
		
		if (suit == SPADES) {
			switch(this.getRank()) {
				case ACE: 
					cardIcon = new ImageIcon("CardPics/aces.jpg");
					break;
				case 2: 
					cardIcon = new ImageIcon("CardPics/2s.jpg");
					break;
				case 3:
					cardIcon = new ImageIcon("CardPics/3s.jpg");
					break;
				case 4:
					cardIcon = new ImageIcon("CardPics/4s.jpg");
					break;
				case 5:
					cardIcon = new ImageIcon("CardPics/5s.jpg");
					break;
				case 6:
					cardIcon = new ImageIcon("CardPics/6s.jpg");
					break;
				case 7:
					cardIcon = new ImageIcon("CardPics/7s.jpg");
					break;
				case 8:
					cardIcon = new ImageIcon("CardPics/8s.jpg");
					break;
				case 9:
					cardIcon = new ImageIcon("CardPics/9s.jpg");
					break;
				case 10:
					cardIcon = new ImageIcon("CardPics/10s.jpg");
					break;
				case JACK:
					cardIcon = new ImageIcon("CardPics/jacks.jpg");
					break;
				case QUEEN:
					cardIcon = new ImageIcon("CardPics/queens.jpg");
					break;
				case KING:
					cardIcon = new ImageIcon("CardPics/kings.jpg");
					break;
			} 
		} else if (suit == CLUBS) {
			switch(this.getRank()) {
				case ACE: 
					cardIcon = new ImageIcon("CardPics/acec.jpg");
					break;
				case 2: 
					cardIcon = new ImageIcon("CardPics/2c.jpg");
					break;
				case 3:
					cardIcon = new ImageIcon("CardPics/3c.jpg");
					break;
				case 4:
					cardIcon = new ImageIcon("CardPics/4c.jpg");
					break;
				case 5:
					cardIcon = new ImageIcon("CardPics/5c.jpg");
					break;
				case 6:
					cardIcon = new ImageIcon("CardPics/6c.jpg");
					break;
				case 7:
					cardIcon = new ImageIcon("CardPics/7c.jpg");
					break;
				case 8:
					cardIcon = new ImageIcon("CardPics/8c.jpg");
					break;
				case 9:
					cardIcon = new ImageIcon("CardPics/9c.jpg");
					break;
				case 10:
					cardIcon = new ImageIcon("CardPics/10c.jpg");
					break;
				case JACK:
					cardIcon = new ImageIcon("CardPics/jackc.jpg");
					break;
				case QUEEN:
					cardIcon = new ImageIcon("CardPics/queenc.jpg");
					break;
				case KING:
					cardIcon = new ImageIcon("CardPics/kingc.jpg");
					break;
			}
		} else if (suit == HEARTS) {
			switch(this.getRank()) {
				case ACE: 
					cardIcon = new ImageIcon("CardPics/aceh.jpg");
					break;
				case 2: 
					cardIcon = new ImageIcon("CardPics/2h.jpg");
					break;
				case 3:
					cardIcon = new ImageIcon("CardPics/3h.jpg");
					break;
				case 4:
					cardIcon = new ImageIcon("CardPics/4h.jpg");
					break;
				case 5:
					cardIcon = new ImageIcon("CardPics/5h.jpg");
					break;
				case 6:
					cardIcon = new ImageIcon("CardPics/6h.jpg");
					break;
				case 7:
					cardIcon = new ImageIcon("CardPics/7h.jpg");
					break;
				case 8:
					cardIcon = new ImageIcon("CardPics/8h.jpg");
					break;
				case 9:
					cardIcon = new ImageIcon("CardPics/9h.jpg");
					break;
				case 10:
					cardIcon = new ImageIcon("CardPics/10h.jpg");
					break;
				case JACK:
					cardIcon = new ImageIcon("CardPics/jackh.jpg");
					break;
				case QUEEN:
					cardIcon = new ImageIcon("CardPics/queenh.jpg");
					break;
				case KING:
					cardIcon = new ImageIcon("CardPics/kingh.jpg");
					break;
			}
		} else if (suit == DIAMONDS) {
			switch(this.getRank()) {
				case ACE: 
					cardIcon = new ImageIcon("CardPics/aced.jpg");
					break;
				case 2: 
					cardIcon = new ImageIcon("CardPics/2d.jpg");
					break;
				case 3:
					cardIcon = new ImageIcon("CardPics/3d.jpg");
					break;
				case 4:
					cardIcon = new ImageIcon("CardPics/4d.jpg");
					break;
				case 5:
					cardIcon = new ImageIcon("CardPics/5d.jpg");
					break;
				case 6:
					cardIcon = new ImageIcon("CardPics/6d.jpg");
					break;
				case 7:
					cardIcon = new ImageIcon("CardPics/7d.jpg");
					break;
				case 8:
					cardIcon = new ImageIcon("CardPics/8d.jpg");
					break;
				case 9:
					cardIcon = new ImageIcon("CardPics/9d.jpg");
					break;
				case 10:
					cardIcon = new ImageIcon("CardPics/10d.jpg");
					break;
				case JACK:
					cardIcon = new ImageIcon("CardPics/jackd.jpg");
					break;
				case QUEEN:
					cardIcon = new ImageIcon("CardPics/queend.jpg");
					break;
				case KING:
					cardIcon = new ImageIcon("CardPics/kingd.jpg");
					break;
			}
		}
	}
	
	/**
	 * Returns the card's image.
	 * @return
	 */
	public ImageIcon getCardImg() {
		return cardIcon;
	}
	
	/**
	 * Compares WarCards
	 * @param card
	 * @return
	 */
	public boolean equals(WarCard card) {
		if (this.equals(card)) {
			return true;
		}
		else {
			return false;
		}
	}
}
