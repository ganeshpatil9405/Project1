package arrays_assignments;

import java.util.Scanner;

public class SumOfDiagonal {
	public static void main(String[] args) {
		int i,j;
		int r,c,sum=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Rows and colums");
		r=sc.nextInt();
		c=sc.nextInt();
		
		int arr[][]=new int[r][c];
		System.out.println("Enter the Elements");
		
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
				
			}
		}
		
		for(i=0;i<arr.length;i++)
		{
			sum=sum+arr[i][i];
		}
		System.out.println("Sum of Matrix Diagonal is "+sum);
	}

}
