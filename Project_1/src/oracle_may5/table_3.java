package oracle_may5;

import java.util.Scanner;

public class table_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		
		int num=sc.nextInt();
		
		int i=1;
		
		while(i<=10)
		{
			System.out.println(num+"X"+i+"="+num*i);
			i++;
		}
	}
}
