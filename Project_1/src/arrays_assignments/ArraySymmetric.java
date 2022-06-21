package arrays_assignments;

import java.util.Scanner;

public class ArraySymmetric {
		public static void main(String[] args) {
			int i,j,r,c,count=1;
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter rows and Column");
			r=sc.nextInt();
			c=sc.nextInt();
			
			int a[][]=new int[r][c];
			int arr[][]=new int[r][c];
			System.out.println("Enter the Elements");
			
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			
			for(i=0;i<a.length;i++)
			{
				for(j=0;j<a[0].length;j++)
				{
					arr[j][i]=a[i][j];
				}
				
			}
			for(i=0;i<a.length;i++)
			{
				for(j=0;j<a[0].length;j++)
				{
					if(a[i][j]!=arr[i][j])
					{
						count++;
						break;
					}
				}
				if(count==1)
				{
					System.out.println("It is symmetric");
					break;
				}
				else
				{
					System.out.println("It is not Symmetric");
				}
				
			}
	}
			
}

