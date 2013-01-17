package guiFirstTest;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

/**
*
*/
public class NewJFrameTestMultiVec extends javax.swing.JFrame {
	private int multiTable;

	/**
	 *  Class to hold coordinates.
	 */
	public class Coordinates {
		private int x1;
		private int y1;
		private int x2;
		private int y2;
		
		public Coordinates(int x1, int y1, int x2, int y2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}

		public int getX1() {
			return x1;
		}

		public void setX1(int x1) {
			this.x1 = x1;
		}

		public int getY1() {
			return y1;
		}

		public void setY1(int y1) {
			this.y1 = y1;
		}

		public int getX2() {
			return x2;
		}

		public void setX2(int x2) {
			this.x2 = x2;
		}

		public int getY2() {
			return y2;
		}

		public void setY2(int y2) {
			this.y2 = y2;
		}
	}
	
	/**
	 *  Class to hold two jLabel and one jTextField and also coordinates for the labels and
	 *  the fields.
	 */
	public class MultiLabelTextField {
        // The multi number
		private int num1;
		private int num2;
		
		// Labels and textfields
		private JLabel jLabel;
		private JTextField jTextField;
		private JLabel jLabelResult;	
		
		// Coordinates
		private Coordinates coordJLabel;
		private Coordinates coordJTextField;
		private Coordinates coordJLabelResult;		
		
		// Getters
		public int getNum1() {
			return num1;
		}
		
		public int getNum2() {
			return num2;
		}		

		public JTextField getjTextField() {
			return jTextField;
		}

		public JLabel getjLabelResult() {
			return jLabelResult;
		}		
		
		/**
		 *  Constructor for multiLabelTextField.
		 */		
		public MultiLabelTextField(int num1, int num2,
				Coordinates coordJLabel, 
				Coordinates coordJTextField, 
				Coordinates coordJLabelResult) {
			this.num1 = num1;
			this.num2 = num2;
			this.jLabel = new JLabel();
			this.jTextField = new JTextField();
			this.jLabelResult = new JLabel();
			this.coordJLabel = coordJLabel;
			this.coordJTextField = coordJTextField;
			this.coordJLabelResult = coordJLabelResult;
		} 	
		
		/**
		 *  
		 */			
		public void createLabelAndFields() {
			{
				getContentPane().add(jLabel);
				jLabel.setText(num1 + " x " + num2 + " = ");
				jLabel.setBounds(coordJLabel.getX1(), coordJLabel.getY1(), 
						coordJLabel.getX2(), coordJLabel.getY2());
			}
			{
				getContentPane().add(jTextField);
				jTextField.setText("");
				jTextField.setBounds(coordJTextField.getX1(), coordJTextField.getY1(), 
						coordJTextField.getX2(), coordJTextField.getY2());
			}		
			{
				getContentPane().add(jLabelResult);
				jLabelResult.setBounds(coordJLabelResult.getX1(), coordJLabelResult.getY1(), 
						coordJLabelResult.getX2(), coordJLabelResult.getY2());
				jLabelResult.setText("");
				jLabelResult.setFont(new java.awt.Font("Times New Roman",0,12));
			}			
		}		
	}
	
	private MultiLabelTextField multiLabelTextField1;
	private MultiLabelTextField multiLabelTextField2;
	private MultiLabelTextField multiLabelTextField6;
	private MultiLabelTextField multiLabelTextField7;
	private MultiLabelTextField multiLabelTextField8;
	
	// jLabels
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel9;
	private JLabel jLabel10;	
	
	// jTextFields
	private JTextField jTextField3;
	private JTextField jTextField4;
	private JTextField jTextField5;
	private JTextField jTextField9;
	private JTextField jTextField10;	
	
	// Result jLabels, OK or Error
	private JLabel jLabelResult3;
	private JLabel jLabelResult4;
	private JLabel jLabelResult5;
	private JLabel jLabelResult9;
	private JLabel jLabelResult10;	
	
	// Buttons
	private JButton jButtonReset;
	private JButton jButtonCheck;	

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
	
	public NewJFrameTestMultiVec() {
		super();
		this.multiTable = 5;
		initGUI();
	}
	
	public NewJFrameTestMultiVec(int multiTable) {
		super();
		this.multiTable = multiTable;
		initGUI();
	}	
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			
			// JLabel coordinates
			int labelX1 = 33;
			int labelY1 = 32;
			int labelX2 = 49;
			int labelY2 = 16;
			
			// JTextField coordinates
			int textFieldX1 = 76;
			int textFieldY1 = 29;
			int textFieldX2 = 62;
			int textFieldY2 = 22;	
			
			// jLabelResult
			int resultX1 = 142;
			int resultY1 = 34;
			int resultX2 = 31;
			int resultY2 = 10;			
			
			int deltaY1 = 33;			
			
			multiLabelTextField1 = new MultiLabelTextField(1, multiTable,
					new Coordinates(labelX1, labelY1, labelX2, labelY2), 
					new Coordinates(textFieldX1, textFieldY1, textFieldX2, textFieldY2), 
					new Coordinates(resultX1, resultY1, resultX2, resultY2));
			multiLabelTextField1.createLabelAndFields();
			
			labelY1 += deltaY1;
			textFieldY1 += deltaY1;
			resultY1+= deltaY1;
			multiLabelTextField2 = new MultiLabelTextField(2, multiTable,
					new Coordinates(labelX1, labelY1, labelX2, labelY2), 
					new Coordinates(textFieldX1, textFieldY1, textFieldX2, textFieldY2), 
					new Coordinates(resultX1, resultY1, resultX2, resultY2));
			multiLabelTextField2.createLabelAndFields();			
			
			// Text 1
			/*{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("1 x " + multiTable + " = ");
				jLabel1.setBounds(33, 32, 49, 16);
			}
			{
				jTextField1 = new JTextField();
				getContentPane().add(jTextField1);
				jTextField1.setText("");
				jTextField1.setBounds(76, 29, 62, 22);
			}		
			{
				jLabelResult1 = new JLabel();
				getContentPane().add(jLabelResult1);
				jLabelResult1.setBounds(142, 34, 31, 10);
				jLabelResult1.setText("");
				jLabelResult1.setFont(new java.awt.Font("Times New Roman",0,12));
			}	*/		
			
			// Text 2
			/*
			{		jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("2 x " + multiTable + " = ");
				jLabel2.setBounds(33, 65, 49, 16);
			}
			{
				jTextField2 = new JTextField();
				getContentPane().add(jTextField2);
				jTextField2.setText("");
				jTextField2.setBounds(76, 62, 62, 22);
			}
			{
				jLabelResult2 = new JLabel();
				getContentPane().add(jLabelResult2);
				jLabelResult2.setBounds(142, 67, 31, 10);
				jLabelResult2.setText("");
				jLabelResult2.setFont(new java.awt.Font("Times New Roman",0,12));
			}	
			*/		
			
			// Text 3
			{
				jLabel3 = new JLabel();
				getContentPane().add(jLabel3);
				jLabel3.setText("3 x " + multiTable + " = ");
				jLabel3.setBounds(33, 98, 49, 16);
			}
			{
				jTextField3 = new JTextField();
				getContentPane().add(jTextField3);
				jTextField3.setText("");
				jTextField3.setBounds(76, 95, 62, 22);
			}
			{
				jLabelResult3 = new JLabel();
				getContentPane().add(jLabelResult3);
				jLabelResult3.setBounds(142, 100, 31, 10);
				jLabelResult3.setText("");
				jLabelResult3.setFont(new java.awt.Font("Times New Roman",0,12));
			}						
			
			// Text 4
			{
				jLabel4 = new JLabel();
				getContentPane().add(jLabel4);
				jLabel4.setText("4 x " + multiTable + " = ");
				jLabel4.setBounds(33, 131, 49, 16);
			}
			{
				jTextField4 = new JTextField();
				getContentPane().add(jTextField4);
				jTextField4.setText("");
				jTextField4.setBounds(76, 128, 62, 22);
			}		
			{
				jLabelResult4 = new JLabel();
				getContentPane().add(jLabelResult4);
				jLabelResult4.setBounds(142, 133, 31, 10);
				jLabelResult4.setText("");
				jLabelResult4.setFont(new java.awt.Font("Times New Roman",0,12));
			}								
			
			// Text 5
			{
				jLabel5 = new JLabel();
				getContentPane().add(jLabel5);
				jLabel5.setText("5 x " + multiTable + " = ");
				jLabel5.setBounds(33, 164, 49, 16);
			}
			{
				jTextField5 = new JTextField();
				getContentPane().add(jTextField5);
				jTextField5.setText("");
				jTextField5.setBounds(76, 161, 62, 22);
			}			
			{
				jLabelResult5 = new JLabel();
				getContentPane().add(jLabelResult5);
				jLabelResult5.setBounds(142, 166, 31, 10);
				jLabelResult5.setText("");
				jLabelResult5.setFont(new java.awt.Font("Times New Roman",0,12));
			}	
			
			// New column
			
			// JLabel coordinates
			labelX1 = 179;
			labelY1 = 32;
			labelX2 = 49;
			labelY2 = 16;
			
			// JTextField coordinates
			textFieldX1 = 222;
			textFieldY1 = 29;
			textFieldX2 = 62;
			textFieldY2 = 22;	
			
			// jLabelResult
			resultX1 = 288;
			resultY1 = 34;
			resultX2 = 31;
			resultY2 = 10;		
			
			multiLabelTextField6 = new MultiLabelTextField(6, multiTable,
					new Coordinates(labelX1, labelY1, labelX2, labelY2), 
					new Coordinates(textFieldX1, textFieldY1, textFieldX2, textFieldY2), 
					new Coordinates(resultX1, resultY1, resultX2, resultY2));
			multiLabelTextField6.createLabelAndFields();
			
			labelY1 += deltaY1;
			textFieldY1 += deltaY1;
			resultY1+= deltaY1;
			multiLabelTextField7 = new MultiLabelTextField(7, multiTable,
					new Coordinates(labelX1, labelY1, labelX2, labelY2), 
					new Coordinates(textFieldX1, textFieldY1, textFieldX2, textFieldY2), 
					new Coordinates(resultX1, resultY1, resultX2, resultY2));
			multiLabelTextField7.createLabelAndFields();		
			
			labelY1 += deltaY1;
			textFieldY1 += deltaY1;
			resultY1+= deltaY1;
			multiLabelTextField8 = new MultiLabelTextField(8, multiTable,
					new Coordinates(labelX1, labelY1, labelX2, labelY2), 
					new Coordinates(textFieldX1, textFieldY1, textFieldX2, textFieldY2), 
					new Coordinates(resultX1, resultY1, resultX2, resultY2));
			multiLabelTextField8.createLabelAndFields();						
			
			// Text6
//			{
//				jLabel6 = new JLabel();
//				getContentPane().add(jLabel6);
//				jLabel6.setText("6 x " + multiTable + " = ");
//				jLabel6.setBounds(179, 32, 49, 16);
//			}						
//			{
//				jTextField6 = new JTextField();
//				getContentPane().add(jTextField6);
//				jTextField6.setText("");
//				jTextField6.setBounds(222, 29, 62, 22);
//			}
//			{
//				jLabelResult6 = new JLabel();
//				getContentPane().add(jLabelResult6);
//				jLabelResult6.setBounds(288, 34, 31, 10);
//				jLabelResult6.setText("");
//				jLabelResult6.setFont(new java.awt.Font("Times New Roman",0,12));
//			}							
//			
			// Text7
//			{
//				jLabel7 = new JLabel();
//				getContentPane().add(jLabel7);
//				jLabel7.setText("7 x " + multiTable + " = ");
//				jLabel7.setBounds(179, 65, 49, 16);
//			}						
//			{
//				jTextField7 = new JTextField();
//				getContentPane().add(jTextField7);
//				jTextField7.setText("");
//				jTextField7.setBounds(222, 62, 62, 22);
//			}			
//			{
//				jLabelResult7 = new JLabel();
//				getContentPane().add(jLabelResult7);
//				jLabelResult7.setBounds(288, 67, 31, 10);
//				jLabelResult7.setText("");
//				jLabelResult7.setFont(new java.awt.Font("Times New Roman",0,12));
//			}										
			
			// Text8
//			{
//				jLabel8 = new JLabel();
//				getContentPane().add(jLabel8);
//				jLabel8.setText("8 x " + multiTable + " = ");
//				jLabel8.setBounds(179, 98, 49, 16);
//			}						
//			{
//				jTextField8 = new JTextField();
//				getContentPane().add(jTextField8);
//				jTextField8.setText("");
//				jTextField8.setBounds(222, 95, 62, 22);
//			}	
//			{
//				jLabelResult8 = new JLabel();
//				getContentPane().add(jLabelResult8);
//				jLabelResult8.setBounds(288, 100, 31, 10);
//				jLabelResult8.setText("");
//				jLabelResult8.setFont(new java.awt.Font("Times New Roman",0,12));
//			}										
			
			// Text 9
			{
				jLabel9 = new JLabel();
				getContentPane().add(jLabel9);
				jLabel9.setText("9 x " + multiTable + " = ");
				jLabel9.setBounds(179, 131, 49, 16);
			}
			{
				jTextField9 = new JTextField();
				getContentPane().add(jTextField9);
				jTextField9.setText("");
				jTextField9.setBounds(222, 128, 62, 22);
			}
			{
				jLabelResult9 = new JLabel();
				getContentPane().add(jLabelResult9);
				jLabelResult9.setBounds(288, 133, 31, 10);
				jLabelResult9.setText("");
				jLabelResult9.setFont(new java.awt.Font("Times New Roman",0,12));
			}			
						
			// Text 10
			{
				jLabel10 = new JLabel();
				getContentPane().add(jLabel10);
				jLabel10.setText("10 x " + multiTable + " = ");
				if (multiTable == 10)
				{
			       jLabel10.setBounds(170, 164, 60, 16);
				}
				else
				{
				   jLabel10.setBounds(173, 164, 49, 16);
				}
			
			}
			{
				jTextField10 = new JTextField();
				getContentPane().add(jTextField10);
				jTextField10.setText("");
				jTextField10.setBounds(222, 161, 62, 22);
			}
			{
				jLabelResult10 = new JLabel();
				getContentPane().add(jLabelResult10);
				jLabelResult10.setBounds(288, 166, 31, 10);
				jLabelResult10.setText("");
				jLabelResult10.setFont(new java.awt.Font("Times New Roman",0,12));
			}										
						
			{
				jButtonCheck = new JButton();
				getContentPane().add(jButtonCheck);
				jButtonCheck.setText("Check");
				jButtonCheck.setBounds(64, 206, 81, 26);
				jButtonCheck.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButtonCheckActionPerformed(evt);
					}
				});
			}
			{
				jButtonReset = new JButton();
				getContentPane().add(jButtonReset);
				jButtonReset.setText("Reset");
				jButtonReset.setBounds(175, 206, 81, 26);
				jButtonReset.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButtonResetActionPerformed(evt);
					}
				});
			}

			pack();
			this.setSize(345, 291);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void jButtonCheckActionPerformed(ActionEvent evt) 
	{
        // Check of text 1
		printOKorError(multiLabelTextField1.getjLabelResult(), multiLabelTextField1.getjTextField(), 
				multiLabelTextField1.getNum1(), multiLabelTextField1.getNum2());
		
        // Check of text 2
		printOKorError(multiLabelTextField2.getjLabelResult(), multiLabelTextField2.getjTextField(), 
				multiLabelTextField2.getNum1(), multiLabelTextField2.getNum2());
		
	    // Check of text 3
	    printOKorError( jLabelResult3, jTextField3, 3, multiTable);
	    
	    // Check of text 4
	    printOKorError( jLabelResult4, jTextField4, 4, multiTable);
	    
	    // Check of text 5
	    printOKorError( jLabelResult5, jTextField5, 5, multiTable);		

       // Check of text 6
		printOKorError(multiLabelTextField6.getjLabelResult(), multiLabelTextField6.getjTextField(), 
				multiLabelTextField6.getNum1(), multiLabelTextField6.getNum2());
		
        // Check of text 7
		printOKorError(multiLabelTextField7.getjLabelResult(), multiLabelTextField7.getjTextField(), 
				multiLabelTextField7.getNum1(), multiLabelTextField7.getNum2());	   
		
        // Check of text 8
		printOKorError(multiLabelTextField8.getjLabelResult(), multiLabelTextField8.getjTextField(), 
				multiLabelTextField8.getNum1(), multiLabelTextField8.getNum2());	    		   	
	    
	    // Check of text 9
	    printOKorError( jLabelResult9, jTextField9, 9, multiTable);
	    
	    // Check of text 10
	    printOKorError( jLabelResult10, jTextField10, 10, multiTable);		    	    
	}
	
	private void jButtonResetActionPerformed(ActionEvent evt) 
	{
		// Reset 1
		multiLabelTextField1.getjTextField().setText("");
		multiLabelTextField1.getjLabelResult().setText("");
		
		// Reset 2
		multiLabelTextField2.getjTextField().setText("");
		multiLabelTextField2.getjLabelResult().setText("");
		
		// Reset 3
		jTextField3.setText("");
		jLabelResult3.setText("");
		
		// Reset 4
		jTextField4.setText("");
		jLabelResult4.setText("");
		
		// Reset 5
		jTextField5.setText("");
		jLabelResult5.setText("");	
				
		// Reset 6
		multiLabelTextField6.getjTextField().setText("");
		multiLabelTextField6.getjLabelResult().setText("");
		
		// Reset 7
		multiLabelTextField7.getjTextField().setText("");
		multiLabelTextField7.getjLabelResult().setText("");		
				
		// Reset 8
		multiLabelTextField8.getjTextField().setText("");
		multiLabelTextField8.getjLabelResult().setText("");		
		
		// Reset 9
		jTextField9.setText("");
		jLabelResult9.setText("");
		
		// Reset 10
		jTextField10.setText("");
		jLabelResult10.setText("");					
	}
	
	private void printOKorError(JLabel jLabel, JTextField jTextField, int num1, int num2)
	{
		try
		{		
		   Integer tmpInteger = new Integer(jTextField.getText());
		   if (tmpInteger == (num1 * num2))
		   {
			   jLabel.setText("OK");
		   }
		   else
		   {
			   jLabel.setText("Error");			
		   }		
		}
		catch (NumberFormatException ex)
		{
			jLabel.setText("Error");	
		}		
	}

}
