package oracle_may5;
import java.util.Scanner;
public class odd_even {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter limit for Even Numbers");
		int a=sc.nextInt();
		int i=2;
		System.out.println("list of Even Numbers");
		while(i<=a)
		{
			System.out.println(i+" ");	
			i=i+2;
			
		}
	}

}
