
import javax.swing.*;

public class warTest {
	
	/**
	 * Driver for the game as a well as the GUI WarFrame
	 * @param args
	 */
	public static void main(String[] args) {
		WarDecks deck = new WarDecks();
		Deck yourDeck = new Deck(deck.getYourDeck());
		Deck theirDeck = new Deck(deck.getTheirDeck());
		War war = new War(yourDeck, theirDeck);

		JFrame frame = new WarFrame(war);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1200, 1000);
		frame.validate();
		frame.setVisible(true);
	}
}
