package exceptionhandle;
class Bank extends Thread
{
	static int bal=5000;
	static int withdraw;
	Bank(int withdraw)
	{
		this.withdraw=withdraw;
	}
	public static synchronized void withdraw()
	{
		String name=Thread.currentThread().getName();
		if(withdraw<=bal)
		{
			System.out.println(name+"  withdrawn money");
			bal=bal-withdraw;
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
	public void run()
	{
		withdraw();
	}
}
public class staticsynchronization {//bank has one block

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank obj=new Bank(5000);
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		t1.setName("Raju");
		t2.setName("Sunita");
		Bank obj2=new Bank(5000);//obj has one lock
		Thread t3=new Thread(obj2);
		Thread t4=new Thread(obj2);
		t3.setName("Rahul");
		t4.setName("Anita");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
         
	}

}
