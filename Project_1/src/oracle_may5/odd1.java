package oracle_may5;

import java.util.Scanner;

public class odd1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a limit ");
		int a=sc.nextInt();
		
		int i=1;
		
		while(i<=a)
		{
			System.out.println(i+"");
			i=i+2;
		}
	}

}
