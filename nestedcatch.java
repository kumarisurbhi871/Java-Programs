package exceptionhandle;

public class nestedcatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println(e);
			try {
				String s=null;
				System.out.println(s.toUpperCase());
			}
			catch(NullPointerException n)
			{
				System.out.println("null value can't converted");
			}
			
		}
		System.out.println("main method ended");

	}

}
