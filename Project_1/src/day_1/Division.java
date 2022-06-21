package day_1;

import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 Numbers For Division");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int div=a/b;
		System.out.println("Division is " + div);
	}

}
