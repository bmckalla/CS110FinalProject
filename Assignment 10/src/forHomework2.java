import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class forHomework2 extends JFrame {
	private JButton button;
	private JLabel pic;
	private ImageIcon back, front;
	
	public forHomework2(String s) {	
		super(s);
		setLayout(new FlowLayout());
		button = new JButton("Flip");
		
		back = new ImageIcon("back.jpg");
		front = new ImageIcon("aces.jpg");
		pic = new JLabel(front);
		add(pic);
	}
	
	class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (pic.getIcon() == back) 
				pic.setIcon(front);
			else
				pic.setIcon(back);
		}
	}
	

}
