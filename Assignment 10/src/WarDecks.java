
public class WarDecks {
	
	private Deck playerDeck, enemyDeck;
	
	public WarDecks() {
		
		Deck fullDeck = new Deck();
		final int HIGH_RANK = 13,
				DECK_SIZE = 52;
		
		for (int x = 1; x <= HIGH_RANK; x++) {
			WarCard spade = new WarCard(14, x);
			fullDeck.addCard(spade);
			WarCard club = new WarCard(15, x);
			fullDeck.addCard(club);
			WarCard heart = new WarCard(16, x);
			fullDeck.addCard(heart);
			WarCard diamond = new WarCard(17, x);
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
		playerDeck = new Deck(yourDeck);
		theirDeck.shuffle();
		enemyDeck = new Deck(theirDeck);
	}
	
	public Deck getYourDeck() {
		return playerDeck;
	}
	
	public Deck getTheirDeck() {
		return enemyDeck;
	}
}
