package day_1;
import java.util.Scanner;
public class Area {
	public static void main(String[] args) {
		System.out.println("Enter Length of Rectangle");
		Scanner sc=new Scanner(System.in);
		int ln=sc.nextInt();
		System.out.println("Enter Breadth of Rectangle");
		int br=sc.nextInt();
		
		int area=ln*br;
		System.out.println("Area of Rectangle " +area);
		int peri=2*(ln+br);
		System.out.println("Perimeter of Rectangle "+ peri);
	}

}
