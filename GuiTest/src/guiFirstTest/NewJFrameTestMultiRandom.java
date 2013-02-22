package guiFirstTest;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import java.util.Iterator;
import java.util.Vector;

import guiFirstTest.RandomNumbers;
import guiFirstTest.Coordinates;
import guiFirstTest.MultiLabelTextField;

/**
*  This class displays a window where you can write answers to the multiplication table.
*  One button checks your answers and another on resets all values.
*/
public class NewJFrameTestMultiRandom extends JFrame {
	private int multiTable;
	
	// Indicates if an error has been found or not.
	private boolean errorFound;
	
    //  Vector containing name and inputfield of all numbers to calculate.
	private Vector<MultiLabelTextField> multiTextsAndFileldsVec;  
	
	// Buttons
	private JButton jButtonReset;
	private JButton jButtonCheck;	
	private JButton jButtonNewNumbers;
	
	// JLabel to hold OK or Error
	private JLabel jLabelOkOrError;
		
	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				NewJFrameTestMultiVec inst = new NewJFrameTestMultiVec();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	/**
	* Constructor that gives you the default multiplication table 5.
	*/	
	public NewJFrameTestMultiRandom() {
		super();
		this.multiTable = 5;
		this.multiTextsAndFileldsVec = new Vector<MultiLabelTextField>();
		initGUI();
	}
	
	/**
	 * Constructor that gives you the multiplication table that is given as inparameter.
	 * 
	 * @param multiTable int gives you the multiplication table that should be calculated.
	 */
	public NewJFrameTestMultiRandom(int multiTable) {
		super();
		this.multiTable = multiTable;
		this.multiTextsAndFileldsVec = new Vector<MultiLabelTextField>();
		initGUI();
	}	

	/**
	* Method to initiate all labels and all textfields on the window.
	*   
	*/	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			
			RandomNumbers generator = new RandomNumbers();

			// Init of all values the first time.
			//-----------------------------------
			// Start values
			int startLabelY1 = 32;
			int startTextFieldY1 = 29;
			int startResultY1 = 34;
			
			// JLabel coordinates
			int labelX1 = 22;
			int labelY1 = startLabelY1;
			int labelX2 = 55;
			int labelY2 = 16;
			
			// JTextField coordinates
			int textFieldX1 = 76;
			int textFieldY1 = startTextFieldY1;
			int textFieldX2 = 62;
			int textFieldY2 = 22;	
			
			// jLabelResult
			int resultX1 = 142;
			int resultY1 = startResultY1;
			int resultX2 = 31;
			int resultY2 = 10;			
			
			// Delta
			int deltaY1 = 33;
			int deltaX1 = 146;
			
			// Number of rows and columns.
			int numOfRows = 10;
			int numOfColumns = 4;			
			
			// Loop to create all columns and rows.
			// *******************************************
			
			// The columns are created,
			for (int j = 0; j < numOfColumns; j++) {
				
				// The rows are created.
				for (int i = 0; i < numOfRows; i++) {
					if (i > 0) {
						labelY1 += deltaY1;
						textFieldY1 += deltaY1;
						resultY1+= deltaY1;					
					}
					
					// Generate the random numbers.
					int num1 = generator.getNextRandomInt();
					int num2 = generator.getNextRandomInt();

					multiTextsAndFileldsVec.add(new MultiLabelTextField(num1, num2,
							new Coordinates(labelX1, labelY1, labelX2, labelY2),
							new Coordinates(textFieldX1, textFieldY1, textFieldX2, textFieldY2), 
							new Coordinates(resultX1, resultY1, resultX2, resultY2)));
				}

				// Init all values
				// ---------------
				// JLabel coordinates				
				labelX1 += deltaX1;
				labelY1 = startLabelY1;
				
				// JTextField coordinates
				textFieldX1 += deltaX1;
				textFieldY1 = startTextFieldY1;
				
				// jLabelResult
				resultX1 += deltaX1;
				resultY1 = startResultY1;							
			}
				
			// All labels and text fields are created.
			Iterator<MultiLabelTextField> iter = multiTextsAndFileldsVec.iterator();
			while (iter.hasNext()) {
				((MultiLabelTextField) iter.next()).createLabelAndFields(this);
			}			
			
			// The check button is created.
			{
				jButtonCheck = new JButton();
				getContentPane().add(jButtonCheck);
				jButtonCheck.setText("Check");
				jButtonCheck.setBounds(60, 400, 120, 26);
				jButtonCheck.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButtonCheckActionPerformed(evt);
					}
				});
			}
			
			// The reset button is added.
			{
				jButtonReset = new JButton();
				getContentPane().add(jButtonReset);
				jButtonReset.setText("Reset");
				 jButtonReset.setBounds(190, 400, 120, 26);
				jButtonReset.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButtonResetActionPerformed(evt);
					}
				});
			}
			
			// The New Numbers button is added.
			{
				jButtonNewNumbers = new JButton();
				getContentPane().add(jButtonNewNumbers);
				jButtonNewNumbers.setText("New Numbers");
				jButtonNewNumbers.setBounds(320, 400, 120, 26);
				jButtonNewNumbers.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButtonNewNumbersActionPerformed(evt);
					}
				});
			}			
			
			// The jLabel holding the OK and Error text.
			jLabelOkOrError = new JLabel();
			getContentPane().add(jLabelOkOrError);
			jLabelOkOrError.setText("");
			jLabelOkOrError.setBounds(470, 365, 121, 92);
			jLabelOkOrError.setFont(new java.awt.Font("Times New Roman",0,48));
			
			pack();
			this.setSize(650, 580);
		} 
		catch (Exception e) 
		{
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	/**
	* Action method called when check button is pushed.
	*/	
	private void jButtonCheckActionPerformed(ActionEvent evt) 
	{
		// The values in all fields are checked by this iterator for the vector.
		Iterator<MultiLabelTextField> iter = multiTextsAndFileldsVec.iterator();
		errorFound = false;  // Reset the errorFound variable, no errors found before checking is started.
		while (iter.hasNext()) {
			MultiLabelTextField currField = ((MultiLabelTextField) iter.next());
			printOKorError(currField.getjLabelResult(), currField.getjTextField(), 
					currField.getNum1(), currField.getNum2());
		}	
		if (errorFound == true)
		{
			// Error
			jLabelOkOrError.setForeground(new java.awt.Color(255,0,0));	
			jLabelOkOrError.setText("Error");			
		}
		else
		{
			// OK
			jLabelOkOrError.setForeground(new java.awt.Color(28,210,23));
			jLabelOkOrError.setText("OK");
		}
	}
	
	/**
	* Action method called when reset button is pushed.
	*/	
	private void jButtonResetActionPerformed(ActionEvent evt) 
	{
		resetAllValues();
	}
	
	/**
	* Action method called when NewNumbers button is pushed.
	*/	
	private void jButtonNewNumbersActionPerformed(ActionEvent evt) 
	{
		resetAllValues();
		RandomNumbers generator = new RandomNumbers();
		Iterator<MultiLabelTextField> iter = multiTextsAndFileldsVec.iterator();
		while (iter.hasNext()) {
			((MultiLabelTextField) iter.next()).genNewNumber(
					generator.getNextRandomInt(), generator.getNextRandomInt());
		}					
	}
	
	/**
	* Method to reset all values.
	*/	
	private void resetAllValues() 
	{
		// The values in all fields are checked by this iterator for the vector.
		Iterator<MultiLabelTextField> iter = multiTextsAndFileldsVec.iterator();
		while (iter.hasNext()) {
			MultiLabelTextField currField = ((MultiLabelTextField) iter.next());
			currField.getjTextField().setText("");
			currField.getjLabelResult().setText("");
		}		
		jLabelOkOrError.setText("");
	}	
	
	
	
	/**
	* Action method called when reset button is pushed. Resets all fields.
	*/		
	private void printOKorError(JLabel jLabel, JTextField jTextField, int num1, int num2)
	{
		try
		{		
		   Integer tmpInteger = new Integer(jTextField.getText());
		   if (tmpInteger == (num1 * num2))
		   {
			   jLabel.setForeground(new java.awt.Color(28,210,23));
			   jLabel.setText("OK");	
		   }
		   else
		   {	
			   jLabel.setForeground(new java.awt.Color(255,0,0));
			   jLabel.setText("Error");		
			   errorFound = true;
		   }		
		}
		catch (NumberFormatException ex)
		{
			jLabel.setForeground(new java.awt.Color(255,0,0));			
			jLabel.setText("Error");
			errorFound = true;
		}		
	}
}
