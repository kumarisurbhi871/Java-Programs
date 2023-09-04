/*from recurssion write a program to find factorial of a number.
package surbhi;
import java.util.*;
public class factorialnum {
	public static int factorialNumber(int n)
	{
		
		
			if(n==1)
			{
				return 1;
			}
			else
			{
			  return n*factorialNumber(n-1);
			}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number:");
		int n=sc.nextInt();
		System.out.print("factorial of number:"+factorialNumber(n));

	}

}*/

//from normal function write a program to find factorial of a number.
package surbhi;
import java.util.*;
public class factorialnum {
	public static void factorialNumber(int n)
	{
		if(n<0)
		{
			System.out.print("invalid number!");
			return;
		}
		else
		{
			int factorial=1;
			for(int i=1;i<=n;i++)
			{
				factorial=factorial*i;
			}
			System.out.print(factorial);
			
		}
		return;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number:");
		int n=sc.nextInt();
		factorialNumber(n);

	}

}

