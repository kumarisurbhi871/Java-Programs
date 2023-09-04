/*defining an array(1)

type[] arrayName=new type[size];
int[] marks=new int[3];
marks[0]=97;//zero indexed
marks[1]=98;
marks[2]=95;
*/
package surbhi;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] marks=new int[3];
		//2method int marks[]={97,98,95};
		int marks[]=new int[3];
		marks[0]=97;//phy
		marks[1]=98;//chem
		marks[2]=95;//eng
//		System.out.println(marks[0]);
//		System.out.println(marks[1]);
//		System.out.println(marks[2]);
		for(int i=0;i<3;i++)
		{
			System.out.println(marks[i]);
		}

	}

}
