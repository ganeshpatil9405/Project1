package day_2;

import java.util.Scanner;

public class sumofdigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 3 digit Number");
		int a=sc.nextInt();
		int sum=0;
		
			if(a>0)
			{
				int digit=a%10;
				sum=sum+digit;
				a=a/10;
				
			}
		System.out.println("Sum of digit "+ sum);
	}

}
