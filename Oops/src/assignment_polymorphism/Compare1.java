package assignment_polymorphism;

import java.util.Scanner;

public class Compare1 {
	public void compare(int a,int b)
	{
		if(a>b)
		{
			System.out.println(a);
		}
		else
		{
			System.out.println(b);
		}
	}
	public void compare(char x, char y)
	{
		int p=(char)x;
		int q=(char)y;
		
		if(p>q)
		{
			System.out.println(x);
		}
		else
		{
			System.out.println(y);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Compare1 c=new Compare1();
		
		System.out.println("Enter 1st Integer & 2nd Integer");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		c.compare(a, b);
		
		System.out.println("Enter 1st Character & 2nd Character");
		char x=sc.next().charAt(0);
		char y=sc.next().charAt(0);
		
		c.compare(x, y);
		
		
		
	}

}
