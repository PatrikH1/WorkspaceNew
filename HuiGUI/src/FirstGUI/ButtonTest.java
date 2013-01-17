package FirstGUI;

import javax.tools.Tool;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.Image;

public class ButtonTest extends JPanel {	
	JButton yellowButton; // declare yellowButton varibel to extend scope to that private class
	JButton blueButton; // medlem class ( memmber class)
	JButton redButton;
   public ButtonTest() {
	  
		yellowButton = new JButton("yellow"); // create a instance of JButton, yellow is construct inparameter
		blueButton =new JButton ("Blue");
		redButton = new JButton("Red");
	    ChangeIt changeIt =new ChangeIt();
		yellowButton.addActionListener(changeIt);  //yellowButton.addActionListener(new ChangeIt);
		add(yellowButton); // add button inside frame
		add(blueButton);
		add(redButton);
		
	
	}
   
   private class ChangeIt implements ActionListener{
		
	   public void actionPerformed(ActionEvent event)
	   {
		   System.out.println("Event: " + event);
		   yellowButton.setText("Being Clicked");
		   
            // We create a new window. Very interesting!		   
			JFrame frameGridLayout = new JFrame();
			frameGridLayout.getContentPane().add(new ButtonTestBorderLayout());
			frameGridLayout.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			frameGridLayout.pack();
			frameGridLayout.setVisible(true);				   
	   }
   }

	/**
	 * @param args
	 */;
	public static void main(String[] args) {
		
		// Flow Layout Manager, default
		JFrame frame = new JFrame();
		frame.setTitle("Patrik");
		Toolkit kit =Toolkit.getDefaultToolkit();
		Image img =kit.getImage("C:\\Users\\Patrik\\Desktop\\huima.jpg");
		frame.setIconImage(img);
		frame.getContentPane().add(new ButtonTest());
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
		// Board Layout Manager
		//JFrame frameGridLayout = new JFrame();
    	//	frameGridLayout.getContentPane().add(new ButtonTestBorderLayout());
	    //	frameGridLayout.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	    //	frameGridLayout.pack();
	    //	frameGridLayout.setVisible(true);		

	}
}
	
class ButtonTestBorderLayout extends JPanel {	
	   public ButtonTestBorderLayout() {
			JButton yellowButton = new JButton("yellow"); // create a instance of JButton, yellow is construct inparameter
			JButton blueButton =new JButton ("Blue");
			JButton redButton = new JButton("Red");
			JButton orangeButton = new JButton("Orange");
			JButton brownButton = new JButton("Brown");
			
			setLayout(new BorderLayout());
			
			add(yellowButton, BorderLayout.NORTH); // add button inside frame
			add(blueButton, BorderLayout.WEST);
			add(redButton, BorderLayout.CENTER);
			add(orangeButton, BorderLayout.EAST);
			add(brownButton, BorderLayout.SOUTH);		
		}
}


