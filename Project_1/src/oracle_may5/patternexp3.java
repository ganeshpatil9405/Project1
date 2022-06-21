package oracle_may5;

import java.util.Scanner;

public class patternexp3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number of rows");
		int r=sc.nextInt();
		
		char ch='a';
		
		for(int i=r;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(ch+" ");
			}
			System.out.println();
			ch++;
		}
		for(int i=0;i<=r;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(ch+" ");
			}
			System.out.println();
			ch++;
		}
	}

}
