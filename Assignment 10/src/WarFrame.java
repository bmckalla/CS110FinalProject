/**
 * @author Braden McKallagat
 * GUI frame for War card game.
 * Includes a start and play card button, 
 * a frame for a card, and a 
 * 
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WarFrame extends JFrame {
	private JPanel playerPanel, enemyPanel, controlPanel, 
	centerPanel, playCardPanel;
	private JButton start, playCard, quit;
	private JLabel actionInfo, clickToChange, enemyCard,
	enemyPlayed, cardPlayed;
	private CardButton cardButton;
	private ImageIcon alwaysEnemy, enemyCardPlayed, yourCardPlayed;
	
	public WarFrame() {
		String backOfCard = "back.jpg";
		
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
		// add to west area
		start = new JButton("Start");
		panelHolder[1][0].add(start);
		quit = new JButton("Quit");
		panelHolder[2][0].add(quit);
		// start.addActionListener();
		// quit.addActionListener();
		
		// Create play card panel with button,
		// add to east area
		playCard = new JButton("Play card");
		panelHolder[3][2].add(playCard);
		// playCard.addActionListener();
		
		// Create player panel and add items,
		// add to south area
		cardButton = new CardButton();
		panelHolder[3][1].add(cardButton);
		clickToChange = new JLabel("Click card to see others in your deck.");
		panelHolder[3][1].add(clickToChange);
		
		// Create enemy panel and add items,
		// add to north area
		alwaysEnemy = new ImageIcon(backOfCard);
		enemyCard = new JLabel(alwaysEnemy);
		panelHolder[0][1].add(enemyCard);
		
		// Add label for what to do
		actionInfo = new JLabel("Click button to play a card");
		panelHolder[2][2].add(actionInfo);
		
		// Add center items to show cards
		enemyCardPlayed = new ImageIcon(backOfCard);
		enemyPlayed = new JLabel(enemyCardPlayed);
		panelHolder[1][1].add(enemyPlayed);
		yourCardPlayed = new ImageIcon(backOfCard);
		cardPlayed = new JLabel(yourCardPlayed);
		panelHolder[2][1].add(cardPlayed);
	}
	
	/* 
	public void setAction(ActionEvent e) {
		if(e.getSource().equals()) {
			// Play the specified card using War class
		}
	} 
	*/
	
}
