package may6;

import java.util.Scanner;

public class greaterdigitofnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int largest=0;
		
		System.out.println("Enter a digit");
		int num=sc.nextInt();
		int rem;
		
		while(num>0)
		{
			rem=num%10;
					if(largest<rem)
					{
						largest=rem;
					}
					num=num/10;
		}
		System.out.println("Largest Number is "+largest);
		

	}

}
