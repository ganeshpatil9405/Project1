package oracle_may5;
import java.util.Scanner;
public class thalis {
	public static void main(String[] args) {
		
		char ch='n';
		do
		{

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1=Maharshtrian Thali \n Press 2=Gujarati  Thali \n Press 3=Bangali Thali \n Press 4=Punjabi Thali");
		
		int a=sc.nextInt();
		
		
		switch(a)
		{
		case 1:
			System.out.println("Maharashtrian Thali Price is 200");
			System.out.println("Enter Quantity of Thali");
			int b=sc.nextInt();
			int amt=200*b;
			System.out.println("Total price is " +amt);
			break;
			
		case 2:
			System.out.println("Gujarati Thali Price is 150");
			System.out.println("Enter Quantity of Thali");
			int c=sc.nextInt();
			int amt1=150*c;
			System.out.println("Total price is " +amt1);
			break;
			
		case 3:
			System.out.println("Bagali Thali Price is 180");
			System.out.println("Enter Quantity of Thali");
			int d=sc.nextInt();
			int amt2=180*d;
			System.out.println("Total price is " +amt2);
			break;
			
		case 4:
			System.out.println("punjabi Thali Price is 180");
			System.out.println("Enter Quantity of Thali");
			int e=sc.nextInt();
			int amt3=180*e;
			System.out.println("Total price is " +amt3);
			break;
			
		default :
			System.out.println("Wrong Choice");
			
		
			
		}
		System.out.println("Do you want to Continue (Y/N)");
		ch=sc.next().charAt(0);
		
		}while(ch=='y'||ch=='Y');
		System.out.println("Thank you");
		
		
		
	}

}
