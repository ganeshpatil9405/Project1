package day_1;
import java.util.Scanner;
public class swap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  2 Numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		 
		a=b;
		b=a;
		System.out.println("First Number "+a);
		System.out.println("second  Number "+b);
	
	}

}
