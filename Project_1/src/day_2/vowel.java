package day_2;

import java.util.Scanner;

public class vowel {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Character to check vowels");
	char ch=sc.next().charAt(0);
	
	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
	{
		System.out.println("The Character is vowel "+ch );
	}
	else
	{
		System.out.println("The character is not vowel");
	}
}
}
