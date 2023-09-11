package exceptionhandle;

public class multiplecatchblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=10,b=2,c;
			c=a/b;
			System.out.println(c);
			
			int arr[]= {10,20,30};
			System.out.println(arr[3]);
			
			String str="ankit";
			System.out.println(str.toUpperCase());
		}
		catch(ArithmeticException a)
		{
		   System.out.println("Arithmetic Exception ");	
		}
		catch(ArrayIndexOutOfBoundsException ar)
		{
			System.out.println("number exception");
		}
		catch(Exception e)
		{
			System.out.println("all type exception handled");
		}

	}

}
