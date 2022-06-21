package oracle_may5;

import java.util.Scanner;

public class charpattern1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows");
		int r=sc.nextInt();
		char ch='a';
		
		for(int i=1;i<=r;i++)
		{
			for(int  j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
			}
			System.out.println();
			ch++;
		}
	}

}
