package day_2;

import java.util.Scanner;

public class Demotion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount in RS");
		int amt=sc.nextInt();
		
		int n2000=amt/2000;
		amt=amt%2000;
		
		int n500=amt/500;
		amt=amt%500;
		
		int n200=amt/200;
		amt=amt%200;
		
		int n100=amt/100;
		amt=amt%100;
		
		
		System.out.println("number of notes of 2000 RS "+ n2000 );
		System.out.println("Number of Noted of 500 RS "+ n500);
		System.out.println("Number of Notes of 200 Rs "+ n200);
		System.out.println("Number of Notes of 100 Rs "+ n100);
		System.out.println("Number of Remaining Amount "+ amt);
	}

}
