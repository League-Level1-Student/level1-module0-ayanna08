package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class cuteness_tv implements ActionListener {
	JFrame frame;
	JPanel panel;
	JLabel label;
	JButton button1;
	JButton button2;
	JButton button3;

	public void run() {
		System.out.println("Program Started");

		frame = new JFrame();
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		panel = new JPanel();
		frame.setVisible(true);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		button1.setText("Duck");
		button2.setText("Frog");
		button3.setText("Unicorn");
		frame.add(panel);
		frame.pack();
	}

	void showDucks() {
		playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
		playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
		playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {

		// Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
		// work on some Linux implementations
		try {
			if (System.getProperty("os.name").toLowerCase().contains("linux")) {
				
				System.out.println("1. playing video");
				
				if (Runtime.getRuntime().exec(new String[] { "which", "xdg- open" }).getInputStream().read() != -1) {
					
					System.out.println("2. executing video");
					
					Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
				}
			} else {
				URI uri = new URI(videoID);
				java.awt.Desktop.getDesktop().browse(uri);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();

		if (buttonPressed == button1) {
			showDucks();
		}
		if (buttonPressed == button2) {
			showFrog();
		}
		if (buttonPressed == button3) {
			showFluffyUnicorns();
		}

	}
}
