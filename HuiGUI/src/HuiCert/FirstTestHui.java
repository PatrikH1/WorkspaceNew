package HuiCert;

public class FirstTestHui {  

	public FirstTestHui() {
		// TODO Auto-generated constructor stub
	}
	
	private int myInt;
	
	public int publicInt;
	
	public void setMyInt(int myInt) {
		this.myInt = myInt;
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int il = 3;
		float f1 = il;
		short s1 = (short) f1;
		int i2 = s1;
		float f2 = 3.14f;
		Hui2 hui2 = new Hui2();
		
		hui2.writeInsideHui2();
		
		FirstTestHui huiClass = new FirstTestHui();
		FirstTestHui huiClass1 = new FirstTestHui();
		
		huiClass.publicInt = 1;
		huiClass.myInt = 2;
		
		System.out.println("Hello Jonas! How are you?");
		System.out.println("This is vey funny, isn´t it?");
		
		System.out.println("toString from class: " + huiClass.toString());
		System.out.println("toString from class1: " + huiClass1.toString());
	}	
}

class Hui2
{
	public void writeInsideHui2()
	{
		System.out.println("Hello inside Hui2");
	}
}

