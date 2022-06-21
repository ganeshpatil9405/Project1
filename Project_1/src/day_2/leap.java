package day_2;

import java.util.Scanner;

public class leap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year to check leap year or not");
		int a=sc.nextInt();
		
		if(a%4==0)
		{
			System.out.println("This is leap year");
		}
		else
		{
			System.out.println("This is not leap year");
		}
	}

}
