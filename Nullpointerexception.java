package exceptionhandle;

public class Nullpointerexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=null;
		try {
			System.out.println(str.toUpperCase());
		}
		catch(NullPointerException n)
		{
			System.out.println(n);
		}

	}

}
