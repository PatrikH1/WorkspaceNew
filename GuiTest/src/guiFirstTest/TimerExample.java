package guiFirstTest;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class TimerExample extends JFrame {

   final JLabel label;
   // Timer countdownTimer;
   Timer countUpTimer;
   int timeRemaining = 10;
   int timeCountsUp = 0;
   int timeStop = 10;

   public TimerExample() {
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setSize(200, 200);
      label = new JLabel(String.valueOf(timeCountsUp), JLabel.CENTER);
      getContentPane().add(label);

      countUpTimer = new Timer(1000, new CountUpTimerListener());
      setVisible(true);
      countUpTimer.start();
   }

   class CountUpTimerListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         if (timeCountsUp <= timeStop) {
            label.setText(String.valueOf(timeCountsUp));
            timeCountsUp++;
         } else {
            // label.setText("Time's up!");
            countUpTimer.stop();
         }
      }
   }
   
   class CountdownTimerListener implements ActionListener {
	      public void actionPerformed(ActionEvent e) {
	         if (--timeRemaining > 0) {
	            label.setText(String.valueOf(timeRemaining));
	         } else {
	            label.setText("Time's up!");
	            countUpTimer.stop();
	         }
	      }
	   }   

   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            new TimerExample();
         }
      });
   }

}