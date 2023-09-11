package exceptionhandle;
class test3{
	void vote(int age)throws InvalidAgeException{
		if(age<18)
		{
			throw new InvalidAgeException("not eligible for voting");
		}
		else {
			System.out.println("Eligible for voting");
		}
	}
}
public class userdefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test3 t3=new test3();
		try {
			t3.vote(12);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
class InvalidAgeException extends Exception
{
     InvalidAgeException(String msg)
     {
    	 System.out.println(msg);
     }
}
