package HuiCert;

public class MainClass {

	public MainClass() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirstTestHui huiClass = new FirstTestHui();
		FirstTestHui huiClass1 = new FirstTestHui();
		
		huiClass.publicInt = 1;  // Public member, it works!
		// Row does not work, private member huiClass.myInt = 2;  
		huiClass.setMyInt(2);  // Workaround, solution for above.
		
		
		System.out.println("Hello Jonas! How are you?");
		System.out.println("This is vey funny, isn´t it?");
		
		System.out.println("toString from class: " + huiClass.toString());
		System.out.println("toString from class1: " + huiClass1.toString());		// TODO Auto-generated method stub

	}

}
