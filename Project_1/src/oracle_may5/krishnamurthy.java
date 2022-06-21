package oracle_may5;

import java.util.Scanner;

public class krishnamurthy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number ");
		int num=sc.nextInt();
		int temp,rem,sum=0,fact=1;
		temp=num;
		
		while(temp!=0)
		{
			rem=temp%10;
			fact=1;
			for(int i=1; i<=rem;i++)
			{
				fact=fact*i;
				
			}
			sum=sum+fact;
			temp=temp/10;
			
			if(sum==num)
			{
				System.out.println("The Number is Krishnamurthy");
			}
			else
			{
				System.out.println("The number is not Krishnamurthy");
				
			}
		}

	}

}
