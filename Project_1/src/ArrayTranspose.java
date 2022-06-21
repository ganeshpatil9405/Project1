import java.util.Scanner;

public class ArrayTranspose {
	public static void main(String[] args) {
		int r, c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Row and Column");
		r=sc.nextInt();
		c=sc.nextInt();
		int a[][]=new int[r][c];
		int arr[][]=new int[c][r];
		
		System.out.println("Enter "+(r*c)+"Elemets");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("Transpose of matrix");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=a[j][i];
				System.out.print(arr[i][j]+"  \t");
			}
		}System.out.println();
		
	}
	

}
