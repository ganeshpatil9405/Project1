package oracle_may5;

import java.util.Scanner;

public class Pattern_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the Number");
		int num=sc.nextInt();
		int i,j;
		
		for(i=num;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();

		}
		
	}

}
