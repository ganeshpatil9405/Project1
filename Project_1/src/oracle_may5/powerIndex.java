package oracle_may5;

import java.util.Scanner;

public class powerIndex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base & index");
		int base=sc.nextInt();
		int index=sc.nextInt();
		
		int result=1;
		while(index!=0)
		{
			result=result*base;
			--index;
		}
		System.out.println("Result is "+result);
	}

}
