//print factorial of a number n.
package surbhi;

public class factorial4 {
	public static int print(int n)
	{
		if(n==0||n==1)
		{
			return 1;
		}
		int cal_n=print(n-1);
		int calnm=n*cal_n;
		return calnm;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int fact=print(n);
		System.out.println(fact);

	}

}
