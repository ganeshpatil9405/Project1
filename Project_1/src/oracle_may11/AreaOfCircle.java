package oracle_may11;

import java.util.Scanner;

public class AreaOfCircle {
		
		
		int rsquare(int r)
		{
			return r*r;
		}
		
		void area(int r)
		{
			double area=3.14*rsquare(r);
			System.out.println("Area Of Circle is "+area);
		}
		
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the Radius ");
			int r=sc.nextInt();
			
			AreaOfCircle a1=new AreaOfCircle();
			a1.area(r);
			
			AreaOfCircle a2=new AreaOfCircle();
			System.out.println("Enter the radius ");
			r=sc.nextInt();
			a2.area(r);
			
			AreaOfCircle a3=new AreaOfCircle();
			System.out.println("Enter the radius ");
			r=sc.nextInt();
			a3.area(r);
			
			
			
			
			
		}

}
