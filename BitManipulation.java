package surbhi;
import java.util.*;

public class BitManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;//0101
		int pos=3;
		int ps=1;
		int bitMask=1<<pos;
		if((bitMask & n)==0) {
			System.out.println("bit was Zero");
		}
		else {
			System.out.println("bit was one");
		}
       //set bit
		int btmsk=1<<ps;
		int newNumber=btmsk | n;
		System.out.println(newNumber);
		
		//clear Bit
		int q=5;
		int pt=2;
		int bit=1<<pt;
		int notbit=~(bit);
		int newnum=notbit & q;
		System.out.println(newnum);
		
		//update bit
		Scanner sc=new Scanner(System.in);
		int oper=sc.nextInt();
		//oper=1:set oper=0:clear
		int r=1;
		int bitmasked=1<<r;
		if(oper==1)
		{
			//set
			int newnumbers=bitmasked |n;
			System.out.println(newnumbers);
		}
		else {
			int newbitmasked=~(bitmasked);
			int newnumbers=newbitmasked & r;
			System.out.println(newnumbers);
		}
		
		
	}

}
