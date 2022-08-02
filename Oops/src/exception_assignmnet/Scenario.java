package exception_assignmnet;

import java.util.Scanner;

public class Scenario {
	void arrayOutOfBound(int a[],int b)
	{
		System.out.println("Index of array = "+a[b]);
	}
	void stringOutOfBound(String s,int c)
	{
		System.out.println("Index of String "+s.charAt(c));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]= {1,2,3,4,5};
		String s="Programming";
		System.out.println("Enter value of B & c");
		int b=sc.nextInt();
		int c=sc.nextInt();
		Scenario z=new Scenario();
		try
		{
			try
			{
			z.arrayOutOfBound(a, b);
			}
		
			catch(ArrayIndexOutOfBoundsException e)
			{
				e.printStackTrace();
			}
			
			z.stringOutOfBound(s, c);
		}
			catch(StringIndexOutOfBoundsException e)
			{
				e.printStackTrace();
			}
		System.out.println("Exception Handling");
			sc.close();
		

	}

}
