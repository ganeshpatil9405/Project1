package day_2;

import java.util.Scanner;

public class equilateral {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Equilateral 3 Size");
		int side1=sc.nextInt();
		int side2=sc.nextInt();
		int side3=sc.nextInt();
		
		if(side1==side2 && side2==side3)
		{
			System.out.println("This is Equilateral Traingle");
		}
		else
		{
			System.out.println("This is not equilateral triangle");
		}
		
		
	}

}
