package day_2;

import java.util.Scanner;

public class marksheett {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter percentage");
		int per=sc.nextInt();
		
		if(per>=75)
		{
			System.out.println("You got Distinction");
		}
		else if(per>=60)
		{
			System.out.println("You got first class");
		}
		else if(per>=50)
		{
			System.out.println("you got second class");
		}
		else 
		{
			System.out.println("fail");
		}
	}

}
