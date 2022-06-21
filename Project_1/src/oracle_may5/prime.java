package oracle_may5;

import java.util.Scanner;

public class prime {
public static void main(String[] args) {
	char ch='n';
	do {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number to check it is prime or not");
	int num=sc.nextInt();
	int i=2;
	int mid=num/2;
	while(i<=mid)
	{
		if(num%i==0)
		{
			
			break;
		}
		i++;
	}
	if(i>mid)
	{
		System.out.println("Prime Number");
	}
	else
	{
		System.out.println("Not Prime Number");
	}
	System.out.println("Do yiu want to continue(Y/N)");
	ch=sc.next().charAt(0);
	
	}while(ch=='y' || ch=='Y');
	System.out.println("Thank you");
	}
}	

