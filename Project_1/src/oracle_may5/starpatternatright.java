package oracle_may5;

import java.util.Scanner;

public class starpatternatright {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Nuumber");
		int r=sc.nextInt();
		int i,j;
		for(i=1;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(i=2;i<=r;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		
		
	}

}
