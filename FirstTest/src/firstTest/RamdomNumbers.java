/**
 * 
 */
package firstTest;
import java.util.Random;

/**
 * @author Patrik
 *
 * Class to generate Random numbers.
 */
public class RamdomNumbers {
	
	private int maxNumber;
	private Random generator;

	/**
	 *  Constructor for class RandomNumbers.
	 */
	public RamdomNumbers() {
		maxNumber = 10;
		generator = new Random();
	}

	/**
	 *  Constructor for class RandomNumbers.
	 *  
	 *  @args maxNumber The maximum random number
	 */
	public RamdomNumbers(int maxNumber) {
		this.maxNumber = maxNumber;
		generator = new Random();
	}

	/**
	 *  Constructor for class RandomNumbers.
	 *  
	 *  @args maxNumber The maximum random number
	 */
	public int getNextRandomInt() {
		return generator.nextInt(maxNumber) + 1;
	}
		
	/**
	 * Main method for class RandomNumbers.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		RamdomNumbers generator = new RamdomNumbers();
		
		for (int i = 0; i < 10; i++) {
			System.out.print(generator.getNextRandomInt() + " ");
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print(generator.getNextRandomInt() + " ");
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print(generator.getNextRandomInt() + " ");
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print(generator.getNextRandomInt() + " ");
		}
		System.out.println();		

	}

}
