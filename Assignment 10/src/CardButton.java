import javax.swing.*;

public class CardButton extends JButton {
	private int value;
	private ImageIcon card;
	private Deck deck = new Deck();
	
	public CardButton() {
		deck.shuffle();
		
	}
}
