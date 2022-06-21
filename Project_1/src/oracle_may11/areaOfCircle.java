package oracle_may11;

import java.util.Scanner;

public class areaOfCircle {
		
		
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
			
			areaOfCircle a1=new areaOfCircle();
			a1.area(r);
			
			areaOfCircle a2=new areaOfCircle();
			System.out.println("Enter the radius ");
			r=sc.nextInt();
			a2.area(r);
			
			areaOfCircle a3=new areaOfCircle();
			System.out.println("Enter the radius ");
			r=sc.nextInt();
			a3.area(r);
			
			
			
			
			
		}

}
