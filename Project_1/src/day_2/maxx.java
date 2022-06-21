package day_2;

import java.util.Scanner;

public class maxx {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 Numbers to check max");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b && a> c )
		{
			System.out.println("Largest Number is "+a);
		}
		else if(b>c)
		{
			System.out.println("Largest Number is "+b);
			
		}
		else
		{
			System.out.println("Largest Number is "+c);
		}
			
	}

}
