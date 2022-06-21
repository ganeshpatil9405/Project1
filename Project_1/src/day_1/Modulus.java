package day_1;

import java.util.Scanner;

public class Modulus {
		
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 Numbers For Mod");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int mod=a%b;
		System.out.println("Mod is " + mod);
	}

}

