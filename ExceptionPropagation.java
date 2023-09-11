package exceptionhandle;

public class ExceptionPropagation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			m1();
		}
		catch(ArithmeticException a)
		{
			System.out.println("exception handled");
		}

	}
	public static void m1()
	{
		m2();
	}
	public static void m2()
	{
		System.out.println(10/0);	}

}
