package surbhi;
import java.util.*;
public class addFun {
	public static int sumFun(int a,int b)
	{
		int sum=a+b;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the value of a:");
		int a=sc.nextInt();
		//System.out.println();
		System.out.print("enter the value of b:");
		int b=sc.nextInt();
		int sum = sumFun(a,b);
		System.out.println();
		System.out.print("sum of a and b is :"+sum);

	}

}
