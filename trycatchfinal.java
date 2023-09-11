package exceptionhandle;

public class trycatchfinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("learn coding");
			int a=20,b=0,c;
			c=a/b;
			System.out.println(c);
			System.out.println("Like share");
		}
		catch(ArithmeticException a)
		{
			System.out.println("can't divide by zero");
			
		}
		/*catch(ArithmeticException a)
		{
			int d=20,e=0,f;
			f=d/e;
			System.out.println("can't divide by zero");
			
		}
		*/
		finally
		{
			/*int g=20,h=0,i;
			i=g/h;*/
			System.out.println("subscribe");
		}
		System.out.println("main method ended");

	}

}
