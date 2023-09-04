package surbhi;
import java.util.*;

public class function {
	public static void printMyname(String name)
	{
		System.out.print(name);
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your name:");
        Scanner sc= new Scanner(System.in);
        String name=sc.nextLine();
        printMyname(name);
	}

}
