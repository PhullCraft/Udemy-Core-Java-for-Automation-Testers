package section_2;

public class UsageOfMethodInJava {
	
	static int a =10;
	
	public void getData() {
		System.out.println("I am in method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//below is code to create object
		UsageOfMethodInJava umj = new UsageOfMethodInJava();
		SecondClass sc = new SecondClass();
		
		//below code is of calling method of the same class
		umj.getData();
		//below code is of calling method of the another class.
		sc.setData();
		
		System.out.println("Hello World");
		System.out.println("Value of a is "+a);

	}

}
