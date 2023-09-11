package exceptionhandle;

public class trycatchfinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String a="surbhi";
			System.out.println(a.toUpperCase());
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		finally {
			try {
				System.out.println(10/0);
			}
			catch(ArithmeticException a)
			{
				System.out.println(a);
			}
			finally {
				System.out.println("learn coding");
			}
		}
        System.out.println("main method ended");
	}

}
