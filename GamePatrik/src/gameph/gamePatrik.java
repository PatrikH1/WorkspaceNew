package gameph;

import java.util.Scanner;  // needed for Scanner

public class gamePatrik {
	
    // Create a single shared Scanner for keyboard input
    private static Scanner scanner = new Scanner( System.in );
    
    private static char charArray[];
    
    
    
    private static final String[] dictionary = {
    		"hello", 
    		"world",
    		"monday",
    		"month",
    		"dictionary",
    		"mummy",
    		"brother"};

	public gamePatrik() {
		// TODO Auto-generated constructor stub
	}
	
	static private void printOutDictionary() {
		for (int i = 0; i < dictionary.length; i++) {
			System.out.println(i + ": " + dictionary[i]);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Prompt the user
        System.out.print( "Type some data for the program: " );

        // Read a line of text from the user.
        String input = scanner.nextLine();

        // Display the input back to the user.
        System.out.println( "input = " + input );
        
        for (int i = 0; i < 6; i++) {
        	charArray[i] = 'k';
        }
        
        System.out.println("char array: " +  charArray.toString());
        	     
        printOutDictionary();
	}

}
