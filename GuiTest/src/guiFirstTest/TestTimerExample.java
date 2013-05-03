package guiFirstTest;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class TestTimerExample extends javax.swing.JFrame {
	private JButton jButtonStartTime;
	private JButton jButtonStopTime;
	private JLabel jLabelSecondDigits;
	private JLabel jLabelSeconds;
	private JLabel jLabelMinutes;
	private JLabel jLabelMinuteDigits;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				TestTimerExample inst = new TestTimerExample();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public TestTimerExample() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jButtonStartTime = new JButton();
				getContentPane().add(jButtonStartTime);
				jButtonStartTime.setText("Start");
				jButtonStartTime.setBounds(56, 188, 86, 23);
				jButtonStartTime.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("jButtonStartTime.actionPerformed, event="+evt);
						//TODO add your code for jButtonStartTime.actionPerformed
					}
				});
			}
			{
				jButtonStopTime = new JButton();
				getContentPane().add(jButtonStopTime);
				jButtonStopTime.setText("Stop");
				jButtonStopTime.setBounds(222, 188, 85, 23);
				jButtonStopTime.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("jButtonStopTime.actionPerformed, event="+evt);
						//TODO add your code for jButtonStopTime.actionPerformed
					}
				});
			}
			{
				jLabelMinuteDigits = new JLabel("", JLabel.RIGHT);
				getContentPane().add(jLabelMinuteDigits);
				jLabelMinuteDigits.setText("0");
				jLabelMinuteDigits.setBounds(122, 66, 20, 15);
			}
			{
				jLabelMinutes = new JLabel();
				getContentPane().add(jLabelMinutes);
				jLabelMinutes.setText("min");
				jLabelMinutes.setBounds(158, 66, 37, 15);
			}
			{
				jLabelSeconds = new JLabel();
				getContentPane().add(jLabelSeconds);
				jLabelSeconds.setText("sec");
				jLabelSeconds.setBounds(237, 68, 20, 15);
			}
			{
				jLabelSecondDigits = new JLabel();
				getContentPane().add(jLabelSecondDigits);
				jLabelSecondDigits.setText("0");
				jLabelSecondDigits.setHorizontalAlignment(JLabel.RIGHT);
				jLabelSecondDigits.setBounds(201, 68, 20, 15);
			}
			pack();
			setSize(400, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
