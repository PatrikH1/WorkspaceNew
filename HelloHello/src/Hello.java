/**
 * 
 */

/**
 * @author Patrik
 *
 */
public class Hello {

	/**
	 * 
	 */
	public Hello() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello world!!!");
		
		Class2 class2 = new Class2();
		Class2 class2_instans2 = new Class2();
		
		class2.messageFromClass2();
		class2_instans2.messageFromClass2();
		class2_instans2.anotherMessageFromClass2();

	};

}
