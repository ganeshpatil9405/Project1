package exception_assignmnet;

import java.util.Scanner;

public class Finally_Block {
	
	int mul(int a,int b)
	{
		System.out.println("Multiplication  is "+(a*b));
		return (a*b);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a& b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		Finally_Block f=new Finally_Block();
		try {
			f.mul(a, b);
			
		}
		finally
		{
			f.mul(a,b);
		}
		System.out.println("Successfull");
		sc.close();
	}
	

}
