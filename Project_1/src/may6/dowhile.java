package may6;

import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch, a,b;
		
		
		do {
			System.out.println("1. Addition /n 2. Substraction /n 3. Multiplication /n 4. Division");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your choice :");
			ch=sc.nextInt();
			
			System.out.println("Enter 2 Numbers :");
			 a=sc.nextInt();
			 b=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Addition of two numbers is :"+(a+b));
				break;
				
			case 2:
				System.out.println("Substraction is :"+(a-b));
				break;
				
			case 3:
				System.out.println("Multiplication is :"+(a*b));
				break;
				
			case 4:
				System.out.println("Division is :"+(a/b));
				break;
				
				default :
					System.out.println("Wrong choice");
					
			}
			System.out.println("Do you want to repeat (Y/N)");
			ch=sc.next().charAt(0);
			
		}
		while(ch=='y' || ch=='Y');
			System.out.println("Thank you");
			
		

	}

}
