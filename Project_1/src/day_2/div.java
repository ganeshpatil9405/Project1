package day_2;
import java.util.Scanner;
public class div {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int a= sc.nextInt();
		
		if(a%7==0 || a%10==7)
		{
			System.out.println("The Number is Buzz ");
		}
		else
		{
			System.out.println("The Number is not Buzz");
		}
	}

}

