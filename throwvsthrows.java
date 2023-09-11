package exceptionhandle;
class test1{
	void div(int a,int b) throws ArithmeticException
	{
		if(b==0)
		{
		   throw new ArithmeticException();
		}
		else {
			int c=a/b;
			System.out.println(c);
		}
	}
}
public class throwvsthrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 t1=new test1();
		try {
			t1.div(20, 0);
		}
		catch(ArithmeticException a)
		{
			System.out.println("The value of b is zero");
		}

	}

}
