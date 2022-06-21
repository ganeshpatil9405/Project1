package day_2;

import java.util.Scanner;

public class armstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int number=sc.nextInt();
		
		if(number>99 && number<1000)
		{
			System.out.println("The number is three digit number");
			int third=number%10;
			int second=number/10;
			int first=second/10;
			int a=second%10;
			
			int add=first*first*first+second*second*second+third*third*third;
			if(number==add)
			{
				System.out.println("Number is Armstrong Number"+number);
			}
			else
			{
				System.out.println("Number is not Armstrong Number");
			}
		}
		
		else
			{
				System.out.println("Given Number is not Three digit number");
			}
				
		
	}

}
