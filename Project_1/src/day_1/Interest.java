package day_1;
import java.util.Scanner;
public class Interest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle Number");
		int p=sc.nextInt();
		System.out.println("Enter interest");
		int i=sc.nextInt();
		System.out.println("Enter Time");
	
		int t=sc.nextInt();
		int pi=p*i*t/100;
		System.out.println("Simple Interest is "+ pi);
		
		
	}

}
