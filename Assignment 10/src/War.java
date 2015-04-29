/**
 * @author Braden McKallagat
 * War object for the card game, war
 */
public class War {
	
	private final int YOU_WIN = 1,
					THEY_WIN = 2,
					TIE = 0;
	private int warCard = 1,
			times = 2,
			winner = TIE;
	private Deck yourDeck, theirDeck;
	
	/**
	 * Constructor sets the player deck and enemy deck
	 * @param playerDeck
	 * @param enemyDeck
	 */
	public War(Deck playerDeck, Deck enemyDeck) {
		yourDeck = new Deck(playerDeck);
		theirDeck = new Deck(enemyDeck);
	}
	
	/**
	 * Determines the winner of the game
	 * @return
	 */
	public int winner() {
		if (yourDeck.getSize() == 0)
			winner = THEY_WIN;
		else if (theirDeck.getSize() == 0) 
			winner = YOU_WIN;
		
		return winner;
	}
	
	/**
	 * Determines the winner of the hand,
	 * or if it was a tie (war)
	 * @return
	 */
	public int matchWin() {
		if (yourDeck.showTop().getRank() == 1 && theirDeck.showTop().getRank() > 1) {
			yourDeck.addCard(yourDeck.getSize() - 1, theirDeck.removeTop());
			yourDeck.addCard(yourDeck.getSize() - 1, yourDeck.removeTop());
			winner = YOU_WIN;
		}
		else if (theirDeck.showTop().getRank() == 1 && yourDeck.showTop().getRank() > 1) {
			theirDeck.addCard(theirDeck.getSize() - 1, yourDeck.removeTop());
			theirDeck.addCard(theirDeck.getSize() - 1, theirDeck.removeTop());
			winner = THEY_WIN;
		}
		else if (theirDeck.showTop().getRank() > yourDeck.showTop().getRank()) {
			theirDeck.addCard(theirDeck.getSize() - 1, yourDeck.removeTop());
			theirDeck.addCard(theirDeck.getSize() - 1, theirDeck.removeTop());
			winner = THEY_WIN;
		}
		else if (yourDeck.showTop().getRank() > theirDeck.showTop().getRank()) {
			yourDeck.addCard(yourDeck.getSize() - 1, theirDeck.removeTop());
			yourDeck.addCard(yourDeck.getSize() - 1, yourDeck.removeTop());
			winner = YOU_WIN;
		}
		else if (yourDeck.showTop().getRank() == theirDeck.showTop().getRank())
			winner = TIE;
		
		return winner;
	}
	
	/**
	 * Executes if hand is a tie.
	 * Has a war card field that tells
	 * which card should be compared in 
	 * each deck. Times shows how many times
	 * war has occurred. 
	 * @return
	 */
	public int warPlay() {
		if (theirDeck.showCard(warCard).getRank() > yourDeck.showCard(warCard).getRank()) {
			for (int x = 0; x < times; x++) 
				theirDeck.addCard(theirDeck.getSize() - 1, yourDeck.removeTop());
			times = 2;
			warCard = 1;
			winner = THEY_WIN;
		}
		else if (yourDeck.showCard(warCard).getRank() == theirDeck.showCard(warCard).getRank()) {
			times += 2;
			warCard += 2;
			winner = TIE;
		}
		else if (yourDeck.showCard(warCard).getRank() > theirDeck.showCard(warCard).getRank()) {
			for (int x = 0; x< times; x++)
				yourDeck.addCard(yourDeck.getSize() - 1, theirDeck.removeTop());
			times = 2;
			warCard = 1;
			winner = YOU_WIN;
		}
		return winner;
	}
	
	/**
	 * Getter returns the player deck
	 * @return
	 */
	public Deck getYourDeck() {
		return yourDeck;
	}
	
	/**
	 * Getter returns the enemy deck
	 * @return
	 */
	public Deck getTheirDeck() {
		return theirDeck;
	}
}
