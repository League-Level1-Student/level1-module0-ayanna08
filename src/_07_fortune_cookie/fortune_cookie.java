package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortune_cookie implements ActionListener {
	JFrame frame = new JFrame();
	
	public void showButton() {
		System.out.println("Button Clicked");
		
		   frame.setVisible(true);
		    JButton button = new JButton();
		    frame.add(button);
		    frame.pack();
		    button.addActionListener(this);
		    
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, "WOOHOO!");
	   int randy = new Random().nextInt(5);
	   if(randy == 0) {
		   JOptionPane.showMessageDialog(null, "You are going to move house and live in Texas in the next 3 years");
	   }
	   if(randy == 1) {
		   JOptionPane.showMessageDialog(null, "You will find your true love in the next year");
	   }
	   if(randy == 2) {
		   JOptionPane.showMessageDialog(null, "You are going to die at age 92");
	   }
	   if(randy == 3) {
		   JOptionPane.showMessageDialog(null, "You will get a D on a test next week");
	   }
	   if(randy == 4) {
		   JOptionPane.showMessageDialog(null, "Your life is going to change DRAMATICALLY in the next year");
	   }
	}
}
