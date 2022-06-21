package oracle_may5;

import java.util.Scanner;

public class starexample2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of row");
		int r=sc.nextInt();
		
		for(int i=1;i<r;i++)
		{
			for(int j=2*(r-i);j>=0;j--)
			{
				System.out.println(" ");
			}
			for(int j=0;j>=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
