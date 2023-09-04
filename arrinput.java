package surbhi;
import java.util.*;
public class arrinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	System.out.println(arr[i]);
        }
        System.out.println("enter the array element :");
        for(int i=0;i<n;i++)
        {
        	arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
        	System.out.println(arr[i]);
        }
	}

}
