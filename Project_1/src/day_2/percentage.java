package day_2;

import java.util.Scanner;

public class percentage {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Percentage");
		int per=sc.nextInt();
		
		if(per>=50) 
		{
			System.out.println("You are pass");
		}
		else 
		{
		System.out.println("You are fail");
		}

	}

}
