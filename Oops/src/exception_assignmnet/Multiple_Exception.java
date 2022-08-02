package exception_assignmnet;

import java.util.Scanner;

public class Multiple_Exception {
	void arrayIndex(int a[],int b)
	{
		System.out.println("Array of Index "+a[b]);
	}
	void stringIndex(String s)
	{
		System.out.println("String length "+s.length());
	}
	void div(int x,int y)
	{
		System.out.println("Division :"+(x/y));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {1,2,3,4,5};
		System.out.println("Enter b, x & y value");
		int b=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		Multiple_Exception m=new Multiple_Exception();
		try {
			try {
				try {
					m.arrayIndex(a, b);
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					e.printStackTrace();
				}
				m.div(x,y);
			}
			catch(ArithmeticException e)
			{
				e.printStackTrace();
			}
			m.stringIndex(null);
		}
			catch(NullPointerException e)
			{
				e.printStackTrace();
			}
			System.out.println("Successfull");
			sc.close();
	}
	
	}


