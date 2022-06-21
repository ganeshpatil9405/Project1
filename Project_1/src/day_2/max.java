package day_2;

import java.util.Scanner;

public class max {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int a=sc.nextInt();

		if(a>0) {
			
			int digit1=a%10;
			int digit2=a/10;
		
			System.out.println(digit1+digit2);
			
		}

	}

}
