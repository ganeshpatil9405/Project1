package day_2;

import java.util.Scanner;

public class choicecased {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		System.out.println("Press 1=Add, Press 2=sub Press 3= Mul Press 4=Div");
		int choice=sc.nextInt();
		
		if(choice==1)
		{
			System.out.println("Addition "+(x+y));
			
		}
		else if(choice==2)
		{
			System.out.println("Substracion "+(x-y));
			
		}
		else if(choice==3) 
		{
			System.out.println("Multiplication "+(x*y));
			
		}
		else if(choice==4)
		{
			System.out.println("Division is "+(x/y));
		}
		else
		{
			System.out.println("Invalid Choice");
		}
	}

}
