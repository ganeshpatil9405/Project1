package oracle_may5;

import java.util.Scanner;

public class patternexp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of rows");
		int r=sc.nextInt();
		
		for(int i=1;i<=r;i++)
		{
			for(int j=0;j<r;j++)
			{
				int result=(i+j)%2;
				System.out.print(result+" ");
				
			}
			System.out.println();
		}

	}

}
