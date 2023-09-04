//Qs.Print the fibonacci sequence till nth term by recursion.
package surbhi;

public class fibonacci {
	 static int n1=0,n2=1,n3=0;
	
    public static  void display(int count)
    {
    	if(count>0)
    	{
    		n3=n1+n2;
    		n1=n2;
    		n2=n3;
    		System.out.print(" "+n3);
    		display(count-1);
    	}
    	
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=10;
		System.out.print(n1+" "+n2);
		display(count-2);

	}

}
