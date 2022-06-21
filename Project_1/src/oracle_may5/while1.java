package oracle_may5;

import java.util.Scanner;

public class while1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter end point Numbers");
		int a=sc.nextInt();
		
		int i=1;
		
		while(i<=a)
		{
			System.out.println(i+ " ");
			i++;
		}
		System.out.println("Done");
		
		
	}

}
