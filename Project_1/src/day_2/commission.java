package day_2;

import java.util.Scanner;

public class commission {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the sells Amount");
	int amt=sc.nextInt();
	
	if(amt>=10000)
	{
		double a=amt*20/100;
		System.out.println("The Discount is  "+a);
		System.out.println("Net payable amount is "+(amt-a));
	}
	else
	{
		double b=amt*10/100;
		System.out.println("The Discount is "+b);
		System.out.println("Net paybale amount is "+(amt-b));
	}
}
}
