package may6;

import java.util.Scanner;

public class reversenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=0;
		int rev=0;
		System.out.println("Enter a Number for Reverse");
		num=sc.nextInt();
		
		while(num!=0)
		{
			int c=num%10;
			rev=rev*10+c;
			num=num/10;	
		}
		System.out.println("Reverse Number is "+rev);

	}

}
