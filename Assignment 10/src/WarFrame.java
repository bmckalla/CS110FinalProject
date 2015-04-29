/**
 * @author Braden McKallagat
 * GUI frame for War card game.
 */

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class WarFrame extends JFrame {
	
	private JButton playCard, quit;
	private JLabel actionInfo, enemyCard,
	enemyPlayed, cardPlayed, yourCard, yourLabel, theirLabel;
	private final ImageIcon BACK_OF_CARD = new ImageIcon("back.jpg");
	private Deck yourDeck, theirDeck;
	private War war;
	private final int YOU_WIN = 1,
			THEY_WIN = 2,
			TIE = 0;
	private int yourScore, theirScore, 
			warCard = 1;
	
	/**
	 * Accepts the game as a parameter
	 * @param warGame
	 */
	public WarFrame(War warGame) {
		
		war = warGame;
		yourDeck = warGame.getYourDeck();
		theirDeck = warGame.getTheirDeck();
		
		// Create a panel array with the same layout
		// as the GridLayout, thus creates empty frames
		// for each grid. Later, can access specific
		// grids directly, making for an easier approach
		// to layout.
		final int I = 4;
		final int J = 3;
		JPanel[][] panelHolder = new JPanel[I][J];
		setTitle("A Game of War");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(I,J));
		
		for (int m = 0; m < I; m++) {
			for (int n = 0; n < J; n++) {
				panelHolder[m][n] = new JPanel();
				add(panelHolder[m][n]);
			}
		}
		
		// Create control panel with buttons,
		// add to western area
		quit = new JButton("Quit");
		panelHolder[2][0].add(quit);
		quit.addActionListener(new QuitListener());
		
		// Create play card panel with button,
		// add to eastern area
		playCard = new JButton("Play card");
		panelHolder[3][2].add(playCard);
		playCard.addActionListener(new PlayListener());
		
		// Create player panel and add items,
		// add to southern area
		yourCard = new JLabel(BACK_OF_CARD);
		panelHolder[3][1].add(yourCard);
		
		// Create enemy panel and add items,
		// add to northern area
		enemyCard = new JLabel(BACK_OF_CARD);
		panelHolder[0][1].add(enemyCard);
		
		// Add label for what to do, add to western area
		actionInfo = new JLabel("Press 'Play card' to play a card");
		panelHolder[2][2].add(actionInfo);
		
		// Add label for your number of cards and opponents number of cards
		yourDeck.setSize();
		yourScore = yourDeck.getSize();
		theirDeck.setSize();
		theirScore = theirDeck.getSize();
		yourLabel = new JLabel("Cards left: " + yourScore);
		panelHolder[3][0].add(yourLabel);
		theirLabel = new JLabel("Cards left: " + theirScore);
		panelHolder[0][0].add(theirLabel);
		
		// Add center items to show card
		enemyPlayed = new JLabel();
		panelHolder[1][1].add(enemyPlayed);
		cardPlayed = new JLabel();
		panelHolder[2][1].add(cardPlayed);
	}

	// handle button events
	public class PlayListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
				ImageIcon cardImage = yourDeck.showTop().getCardImg();
				cardPlayed.setIcon(cardImage);
				ImageIcon enemyImage = theirDeck.showTop().getCardImg();
				enemyPlayed.setIcon(enemyImage);
				try {
					matchWin();
				}
				catch (InterruptedException f) {
					System.exit(0);
				}
		} // end method
	} // end class
	
	/**
	 * Button quits the game, disables all buttons
	 */
	public class QuitListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
				quit.setEnabled(false);
				playCard.setEnabled(false);
				actionInfo.setText("GAME OVER");
		}
	}
	
	/**
	 * Determines the winner of the hand
	 * @throws InterruptedException
	 */
	public void matchWin() throws InterruptedException {
		if ((war.matchWin()) == YOU_WIN) {
			resetDeck();
			winner();
			actionInfo.setText("You win the round. Play another card.");
			resetGUI();
		}
		else if ((war.matchWin()) == THEY_WIN) {
			resetDeck();
			winner();
			actionInfo.setText("The enemy wins the round. Play another card."); 
			resetGUI();
		}
		else if ((war.matchWin()) == TIE) {
			actionInfo.setText("WAR!");
			war();
			resetGUI();
		} 
	}
	
	/**
	 * Determines the winner of the game
	 * @throws InterruptedException
	 */
	public void winner() throws InterruptedException {
		if (war.winner() == YOU_WIN) {
			actionInfo.setText("The enemy is out of cards...");
			actionInfo.setText("YOU WIN! Thanks for playing!");
		}
		else if (war.winner() == THEY_WIN) {
			actionInfo.setText("You are out of cards...");
			actionInfo.setText("YOU LOSE! Play again!");
		}
	}
	
	/**
	 * If hand is a tie, executes this method
	 * @throws InterruptedException
	 */
	public void war() throws InterruptedException {
		ImageIcon cardImage = yourDeck.showCard(warCard).getCardImg();
		cardPlayed.setIcon(cardImage);
		ImageIcon enemyImage = theirDeck.showCard(warCard).getCardImg();
		enemyPlayed.setIcon(enemyImage);
		if (war.warPlay() == YOU_WIN) {
			warCard = 1;
			resetDeck();
			winner();
			actionInfo.setText("You win the war! Play another card.");
		}
		else if (war.warPlay() == THEY_WIN) {
			warCard = 1;
			resetDeck();
			winner();
			actionInfo.setText("The enemy wins the war! Play another card.");
		}
		else if (war.warPlay() == TIE) {
			actionInfo.setText("ANOTHER WAR!");
			warCard += 2;
			war();
		}
	}
	
	/**
	 * Updates the number of cards in each deck
	 */
	public void resetGUI() {
		yourDeck.setSize();
		yourScore = yourDeck.getSize();
		yourLabel.setText("Cards left: " + yourScore);
		theirDeck.setSize();
		theirScore = theirDeck.getSize();
		theirLabel.setText("Cards left: " + theirScore);
	}
	
	/**
	 * Resets the decks so that they reflect what has 
	 * occured in the war class
	 */
	public void resetDeck() {
		yourDeck = new Deck(war.getYourDeck());
		theirDeck = new Deck(war.getTheirDeck());
	}
}