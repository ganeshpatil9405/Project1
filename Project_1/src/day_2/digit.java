package day_2;

import java.util.Scanner;

public class digit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int a=sc.nextInt();
		
		if(a>=10 && a<=99)
		{
			System.out.println("Number is two digit");
		}
		else
		{
			System.out.println("Number is Three Digit");
		}
	}

}
