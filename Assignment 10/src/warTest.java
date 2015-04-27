import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class warTest {
	
	public static void main(String[] args) {
		WarDecks deck = new WarDecks();
		Deck yourDeck = deck.getYourDeck();
		Deck theirDeck = deck.getTheirDeck();
		War war = new War();

		JFrame frame = new WarFrame(yourDeck, theirDeck, war);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
