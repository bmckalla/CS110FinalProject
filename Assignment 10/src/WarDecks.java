
public class WarDecks {
	
	private Deck playerDeck, enemyDeck;
	
	public WarDecks() {
		
		Deck fullDeck = new Deck();
		final int HIGH_RANK = 13,
				DECK_SIZE = 52;
		
		for (int x = 1; x <= HIGH_RANK; x++) {
			Card spade = new Card(14, x);
			fullDeck.addCard(spade);
			Card club = new Card(15, x);
			fullDeck.addCard(club);
			Card heart = new Card(16, x);
			fullDeck.addCard(heart);
			Card diamond = new Card(17, x);
			fullDeck.addCard(diamond);
		}
		
		fullDeck.shuffle();
	    Deck yourDeck = new Deck();
	    Deck theirDeck = new Deck();
	    
	    for (int x = 0; x < DECK_SIZE/2; x++) {
	    	yourDeck.addCard(fullDeck.removeTop());
	    	theirDeck.addCard(fullDeck.removeTop());
	    }
	    
	    yourDeck.shuffle();
		playerDeck = yourDeck;
		theirDeck.shuffle();
		enemyDeck = theirDeck;
	}
	
	public Deck getYourDeck() {
		return playerDeck;
	}
	
	public Deck getTheirDeck() {
		return enemyDeck;
	}
}
