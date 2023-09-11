package exceptionhandle;

public class NumberFormatException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="surbhi";
		try {
			int a=Integer.parseInt(str);
		}
		catch(Exception n)//NumberFormatException
		{
			System.out.println(n);
			System.out.println("String"+ str+"can't be converted to Integer");
		}
		System.out.println("normal execute");

	}

}
