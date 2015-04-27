
public class War {
	
	private final int YOU_WIN = 1,
					THEY_WIN = 2,
					TIE = 0;
	private int warCard = 1, 
			times = 2,
			winner = TIE;
	
	public int Winner(Deck yourDeck, Deck theirDeck) {
		if (yourDeck.getSize() == 0)
			winner = THEY_WIN;
		else if (theirDeck.getSize() == 0) 
			winner = YOU_WIN;
		
		return winner;
	}
	
	public int matchWin(Deck yourDeck, Deck theirDeck) {
		if (yourDeck.showTop().getRank() == 1 && theirDeck.showTop().getRank() > 1) {
			yourDeck.addCard(theirDeck.removeTop());
			winner = YOU_WIN;
		}
		else if (theirDeck.showTop().getRank() == 1 && yourDeck.showTop().getRank() > 1) {
			theirDeck.addCard(yourDeck.removeTop());
			winner = THEY_WIN;
		}
		else if (theirDeck.showTop().getRank() > yourDeck.showTop().getRank()) {
			theirDeck.addCard(yourDeck.removeTop());
			winner = THEY_WIN;
		}
		else if (yourDeck.showTop().getRank() > theirDeck.showTop().getRank()) {
			yourDeck.addCard(theirDeck.removeTop());
			winner = YOU_WIN;
		}
		else if (yourDeck.showTop().getRank() == 1 && theirDeck.showTop().getRank() == 1)
			winner = TIE;
		else if (yourDeck.showTop().getRank() == theirDeck.showTop().getRank())
			winner = TIE;
		
		return winner;
	}
	
	public void warPlay(Deck yourDeck, Deck theirDeck) {
		if (theirDeck.showCard(warCard).getRank() > yourDeck.showCard(warCard).getRank()) {
			for (int x = 0; x < times; x++) 
				theirDeck.addCard(yourDeck.removeTop());
			warCard = 1;
			times = 2;
		}
		else if (yourDeck.showCard(warCard).getRank() == theirDeck.showCard(warCard).getRank()) {
			times += 2;
			warCard += 2;
			warPlay(yourDeck, theirDeck);
		}
		else {
			for (int x = 0; x < times; x++)
				yourDeck.addCard(theirDeck.removeTop());
			warCard = 1;
			times = 2;
		}
	}
}
