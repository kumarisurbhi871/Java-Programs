package exceptionhandle;

public class nestedtryblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				//System.out.println(10/0);
				int a[]= {10,20,30};
				System.out.println(a[7]);
				}
			catch(ArrayIndexOutOfBoundsException a)
			{
				System.out.println(a);
			}
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("Learn coding");

	}

}
