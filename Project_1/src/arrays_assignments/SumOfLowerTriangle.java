package arrays_assignments;

import java.util.Scanner;

public class SumOfLowerTriangle {
	public static void main(String[] args) {
		int i,j,r,c,sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rows and columns ");
		r=sc.nextInt();
		c=sc.nextInt();
		int a[][]=new int [r][c];
		
		System.out.println("Enter Elements");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				if(i>j)
				{
					sum=sum+a[i][j];
				}
			}
		}
		System.out.println("The sum of lower Triangle Matrix "+sum);
	}

}
