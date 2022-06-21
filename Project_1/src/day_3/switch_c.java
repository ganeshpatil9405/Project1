package day_3;

import java.util.Scanner;

public class switch_c {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 Numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("press 1=Addition, 2=Substraction, 3=Multiplication, 4=Division");
		int choice=sc.nextInt();
		
		switch(choice) 
		{
		case 1:
			System.out.println("Addition is "+(a+b));
			break;
		
		case 2:
			System.out.println("Substraction is "+(a-b));
			break;
			
		case 3:
			System.out.println("Multipilication is "+(a*b));
			break;
			
		case 4:
			System.out.println("Division is "+(a/b));
			break;
			
		default:
			System.out.println("Invalid Choice");
		}
	}

}
