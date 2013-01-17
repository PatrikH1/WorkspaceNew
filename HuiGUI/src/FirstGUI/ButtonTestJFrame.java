package FirstGUI;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class ButtonTestJFrame extends JPanel {	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Flow Layout Manager, default
		JFrame frame = new JFrame();
		
		JButton yellowButton = new JButton("yellow"); // create a instance of JButton, yellow is construct inparameter
		JButton blueButton =new JButton ("Blue");
		JButton redButton = new JButton("Red");
		JButton orangeButton = new JButton("Orange");
		JButton brownButton = new JButton("Brown");	
		
		frame.getContentPane().add(yellowButton); // add button inside frame
		frame.getContentPane().add(blueButton);
		frame.getContentPane().add(redButton);
		frame.getContentPane().add(orangeButton);
		frame.getContentPane().add(brownButton);			

		frame.pack();		
		frame.setSize(300, 300);
		
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		frame.setVisible(true);		

	}
}
	



