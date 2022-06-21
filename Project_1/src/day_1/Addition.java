package day_1;
import java.util.Scanner;
public class Addition {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 Numbers For Addition");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int add=a+b;
		System.out.println("Addition is " + add);
	}

}
