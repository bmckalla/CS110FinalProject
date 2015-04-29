
public class War {
	
	private final int YOU_WIN = 1,
					THEY_WIN = 2,
					TIE = 0;
	private int warCard = 1,
			times = 2,
			winner = TIE;
	private Deck yourDeck, theirDeck;
	
	public War(Deck playerDeck, Deck enemyDeck) {
		yourDeck = new Deck(playerDeck);
		theirDeck = new Deck(enemyDeck);
	}
	
	public int winner() {
		if (yourDeck.getSize() == 0)
			winner = THEY_WIN;
		else if (theirDeck.getSize() == 0) 
			winner = YOU_WIN;
		
		return winner;
	}
	
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
	
	public Deck getYourDeck() {
		return yourDeck;
	}
	
	public Deck getTheirDeck() {
		return theirDeck;
	}
}
