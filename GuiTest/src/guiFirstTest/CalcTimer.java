package guiFirstTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.Timer;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


/**

*/
public class CalcTimer extends javax.swing.JFrame {
	private JButton jButtonStartTime;
	private JButton jButtonStopTime;
	private JButton jButtonResetTime;
	private JLabel jLabelSecondDigits;
	private JLabel jLabelSeconds;
	private JLabel jLabelMinutes;
	private JLabel jLabelMinuteDigits;
	
	Timer countUpTimer;
	int timeCountsUp = 0;
	int minCountsUp = 0;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				CalcTimer inst = new CalcTimer();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
				
			}
		});
	}
	
	public CalcTimer() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
		    countUpTimer = new Timer(1000, new CountUpTimerListener());
		    int sizeOfCounter = 32;
			{
				jButtonStartTime = new JButton();
				getContentPane().add(jButtonStartTime);
				jButtonStartTime.setText("<html><center>Start<br/>Time</center></html>");
				jButtonStartTime.setBounds(48, 188, 85, 50);
				jButtonStartTime.addActionListener(new StartButtonListener());
			}
			{
				jButtonStopTime = new JButton();
				getContentPane().add(jButtonStopTime);
				jButtonStopTime.setText("<html><center>Stop<br/>Time</center></html>");
				jButtonStopTime.setBounds(156, 188, 85, 50);
				jButtonStopTime.addActionListener(new StopButtonListener());
			}
			{
				jButtonResetTime = new JButton();
				getContentPane().add(jButtonResetTime);
				jButtonResetTime.setText("<html><center>Reset<br/>Time</center></html>");
				jButtonResetTime.setBounds(265, 188, 85, 50);
				jButtonResetTime.addActionListener(new ResetButtonListener());
			}			
			{
				jLabelMinuteDigits = new JLabel("", JLabel.RIGHT);
				getContentPane().add(jLabelMinuteDigits);
				jLabelMinuteDigits.setText("0");
				jLabelMinuteDigits.setBounds(103, 53, 21, 30);
				jLabelMinuteDigits.setFont(new java.awt.Font("Times New Roman",0,sizeOfCounter));
			}
			{
				jLabelMinutes = new JLabel();
				getContentPane().add(jLabelMinutes);
				jLabelMinutes.setText("min");
				jLabelMinutes.setBounds(139, 58, 49, 21);
				jLabelMinutes.setFont(new java.awt.Font("Times New Roman",0,sizeOfCounter));
			}
			{
				jLabelSecondDigits = new JLabel();
				getContentPane().add(jLabelSecondDigits);
				jLabelSecondDigits.setText("0");
				jLabelSecondDigits.setHorizontalAlignment(JLabel.RIGHT);
				jLabelSecondDigits.setBounds(194, 53, 43, 30);
				jLabelSecondDigits.setFont(new java.awt.Font("Times New Roman",0,sizeOfCounter));
			}			
			{
				jLabelSeconds = new JLabel();
				getContentPane().add(jLabelSeconds);
				jLabelSeconds.setText("sec");
				jLabelSeconds.setBounds(252, 58, 49, 21);
				jLabelSeconds.setFont(new java.awt.Font("Times New Roman",0,sizeOfCounter));
			}


			pack();
			setSize(400, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	class CountUpTimerListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (timeCountsUp == 59) {
				timeCountsUp = 0;
				minCountsUp++;
			}
			else
			{
				timeCountsUp++;	
			}
			jLabelSecondDigits.setText(String.valueOf(timeCountsUp));
			jLabelMinuteDigits.setText(String.valueOf(minCountsUp));
		}
	}	
	
	class StartButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			countUpTimer = new Timer(1000, new CountUpTimerListener());
			countUpTimer.start();	
		}
	}	
	
	class StopButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {				
			countUpTimer.stop();	
		}
	}		
	
	class ResetButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {				
			countUpTimer.stop();	
			timeCountsUp = 0;
			minCountsUp = 0;
			jLabelSecondDigits.setText(String.valueOf(timeCountsUp));
			jLabelMinuteDigits.setText(String.valueOf(minCountsUp));		
		}
	}			

}
