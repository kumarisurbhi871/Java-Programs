package exceptionhandle;

public class abnormalexecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="surbhi";
		try {
			int a=Integer.parseInt(str);
		}
		catch(ArithmeticException n)//NumberFormatException
		{
			System.out.println(n);
		}
		System.out.println("Abnormal execute");

	}

}
