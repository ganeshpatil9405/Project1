import java.util.Scanner;

public class Array2DExmp {
	
	void displayArray(int a[][], int r, int c)
	{
		System.out.println("Elements of array :");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" \t");
			}
			System.out.println();
		}
		
	}
	void sumOfArray(int a[][],int r,int c)
	{
		int sum=0;
		
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<r;j++)
				{
					sum=sum+a[i][j];
				}
			}
			System.out.println("Addition of Elements of Array "+sum);
		
	}
	
	void sumOfRow(int a[][],int r,int c)
	{
		int sumRow=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				sumRow=sumRow+a[i][j];
			}
			System.out.println("Sum of "+(i+1)+" Row "+sumRow);
		}
	}
	
	public static void main(String[] args) {
		
		int r,c;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Row and Column");
		r=sc.nextInt();
		c=sc.nextInt();
		int arr[][]=new int[r][c];
		
		System.out.println("Enter "+(r*c)+"Elemets");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		Array2DExmp s=new Array2DExmp();
		s.displayArray(arr, r, c);
		s.sumOfArray(arr,r,c);
		s.sumOfRow(arr, r, c);
	}

}
