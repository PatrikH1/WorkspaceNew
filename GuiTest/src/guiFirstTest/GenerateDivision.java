package guiFirstTest;

import guiFirstTest.RandomNumbers;

public class GenerateDivision {

	public GenerateDivision() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RandomNumbers generator = new RandomNumbers();
		
		int firstNumber = generator.getNextRandomInt();
		int secondNumber = generator.getNextRandomInt();
		
		int numerator= firstNumber * secondNumber;
		
		for (int i = 0; i < 10; i++) {
			firstNumber = generator.getNextRandomInt();
			secondNumber = generator.getNextRandomInt();
			numerator= firstNumber * secondNumber;
			
			System.out.println("What is " + numerator + "/" + firstNumber + " ?");
		}
		
		

	}

}
