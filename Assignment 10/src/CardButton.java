import javax.swing.*;

public class CardButton extends JButton {
	private int value;
	private ImageIcon cardImg;
	
	public CardButton(Deck deck) {
		deck.shuffle();
		cardImg = deck.showTop().getCardImg();
		value = deck.showTop().getRank();
	}
	
	public Card getTop(Deck deck) {
		return deck.removeTop();
	}
	
	public void setImage(Deck deck) {
		cardImg = deck.showTop().getCardImg();
		this.setIcon(cardImg);
	}
	
	public ImageIcon getImage() {
		return cardImg;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(Deck deck) {
		value = deck.showTop().getRank();
	}
}
