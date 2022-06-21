package day_1;

import java.util.Scanner;

public class triangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Base of Triangle");
		int be=sc.nextInt();
		System.out.println("Enter height of Triangle");
		int he=sc.nextInt();
		int area=be*he/2;
		System.out.println("Area of Triangle " + area);
	}

}
