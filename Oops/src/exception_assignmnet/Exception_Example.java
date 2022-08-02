package exception_assignmnet;

import java.util.Scanner;

public class Exception_Example {
	void NumberException(int a,int b) throws NumberException
	{
		if(a==b)
		{
			throw new NumberException("a is equal to b");
		}
		else if(a<b)
		{
			throw new NumberException("a is less than b");
		}
		else
		{
			System.out.println("a is grater than b");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a & b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Exception_Example m=new Exception_Example();
		
		try
		{
			m.NumberException(a, b);
		}
		catch(NumberException e)
		{
			e.printStackTrace();
		}
		System.out.println("Successfull");
		sc.close();
	}

}
