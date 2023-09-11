package exceptionhandle;
class test{
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
public class throwkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t=new test();
		t.div(20, 0);

	}

}
