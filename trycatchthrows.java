package exceptionhandle;
/*class Demo{
     void wait1() throws InterruptedException
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
}
public class trycatchthrows {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Demo d=new Demo();
		d.wait1();
		System.out.println("main method ended");

	}

}*/

//or(by try catch)
class Demo{
    void wait1() throws InterruptedException
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
}
public class trycatchthrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		try {
		  d.wait1();
		  System.out.println(10/0);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("main method ended");

	}

}
