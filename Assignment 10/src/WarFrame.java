/**
 * @author Braden McKallagat
 * GUI frame for War card game.
 */

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class WarFrame extends JFrame {
	
	private JButton playCard, quit;
	private JLabel actionInfo, clickToChange, enemyCard,
	enemyPlayed, cardPlayed, yourCard;
	private ImageIcon backCard, enemyCardPlayed, yourCardPlayed;
	private Deck yourDeck, theirDeck;
	private War war;
	private final int YOU_WIN = 1,
			THEY_WIN = 2,
			TIE = 0;
	
	public WarFrame(Deck playerDeck, Deck enemyDeck, War warGame) {
		String backOfCard = "back.jpg";
		
		war = warGame;
		yourDeck = playerDeck;
		theirDeck = enemyDeck;
		
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
		backCard = new ImageIcon(backOfCard);
		yourCard = new JLabel(backCard);
		panelHolder[3][1].add(yourCard);
		
		// Create enemy panel and add items,
		// add to northern area
		enemyCard = new JLabel(backCard);
		panelHolder[0][1].add(enemyCard);
		
		// Add label for what to do, add to western area
		actionInfo = new JLabel("Press 'Play card' to play a card");
		panelHolder[2][2].add(actionInfo);
		
		// Add center items to show card
		enemyPlayed = new JLabel();
		panelHolder[1][1].add(enemyPlayed);
		cardPlayed = new JLabel();
		panelHolder[2][1].add(cardPlayed);
	}

	// handle button events
	public class PlayListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				ImageIcon cardImage = yourDeck.showTop().getCardImg();
				cardPlayed.setIcon(cardImage);
				ImageIcon enemyImage = theirDeck.showTop().getCardImg();
				enemyPlayed.setIcon(enemyImage);
				if ((war.matchWin(yourDeck, theirDeck)) == YOU_WIN) {
					if (war.winner(yourDeck, theirDeck) == YOU_WIN) {
						actionInfo.setText("The oppenent is out of cards...");
						Thread.sleep(4000);
						actionInfo.setText("YOU WIN! Thanks for playing!");
						Thread.sleep(4000);
					}
					else if (war.winner(yourDeck, theirDeck) == THEY_WIN) {
						actionInfo.setText("You are out of cards...");
						Thread.sleep(4000);
						actionInfo.setText("YOU LOSE! Play again!");
						Thread.sleep(4000);
					}
					actionInfo.setText("You win the round. Play another card.");
				}
				else if ((war.matchWin(yourDeck, theirDeck)) == THEY_WIN) {
					actionInfo.setText("Enemy wins the round. Play another card."); 
				}
				else if ((war.matchWin(yourDeck, theirDeck)) == TIE) {
					actionInfo.setText("WAR!");
					war.warPlay(yourDeck, theirDeck);
				}
			} // end try
			catch (Exception f) {
				System.exit(0);
			} // end catch
		} // end method
	} // end class
	
	public class QuitListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				quit.setEnabled(false);
				playCard.setEnabled(false);
				actionInfo.setText("GAME OVER");
				Thread.sleep(4000);
				System.exit(0);
			}
			catch (Exception f) {
				System.exit(0);
			}
		}
	}
}