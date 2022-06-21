package oracle_may5;

import java.util.Scanner;

public class patternexp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number of rows");
		int r=sc.nextInt();
		
		for(int i=0;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j%2==0)
				{
					System.out.print(0);
				}
				else
				{
					System.out.print(1);
				}
			}
			System.out.println();
		}
	}

}
