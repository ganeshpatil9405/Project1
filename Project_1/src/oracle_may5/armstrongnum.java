package oracle_may5;

import java.util.Scanner;

public class armstrongnum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		int temp,cnt=0,sum=0;
		temp=num;
		
		while(temp!=0)
		{
			cnt++;
			temp=temp/10;
		}
		
		temp=num;
		
		while(temp!=0)
		{
			int r=temp%10;
			int pow=1;
			for(int i=1;i<=cnt;i++)
			{
				pow=pow*r;
			}
			temp=temp/10;
			sum=sum+pow;
			
		}
		if(sum==num)
		{
			System.out.println("It is Armstrong Number");
		}
		else
		{
			System.out.println("It is not ArmStrong Number");
		}
		
	}

}
