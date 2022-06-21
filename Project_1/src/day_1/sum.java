package day_1;

import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Numbers For Square & Cube");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a*a;
		int d=b*b*b;
		System.out.println("Square is " + c);
		System.out.println("Cube is " + d);
	}

}
