package day_1;

import java.util.Scanner;

public class Marksheet {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marks of Math");
		int math=sc.nextInt();
		System.out.println("Enter Marks of English");
		int eng=sc.nextInt();
		System.out.println("Enter Marks of Hindi");
		int hin=sc.nextInt();
		System.out.println("Enter Marks of Marathi");
		int mar=sc.nextInt();
		System.out.println("Enter Marks of History");
		int his=sc.nextInt();
		
		int total=math+eng+hin+mar+his;
		System.out.println("Total Marks = "+ total);
		float avg=total/5f;
		System.out.println("Average is "+ avg);
	}

}
