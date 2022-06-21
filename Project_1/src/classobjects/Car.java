package classobjects;

import java.util.Scanner;

public class Car {
		int car_id,year;
		double price,amt,dis;
		String car_name,brand_name, online, cash;
		int Installment;
		String mpay;
		
		void getData(int id,String s,double p,int b, String t,double a,String m, String mpay2, int installment2)
		{
			car_id=id;
			car_name=s;
			price=p;
			year=b;
			brand_name=t;
			amt=a;
			mpay=m;
		}
		void Discount()
		{
			if(mpay.equals(cash) && Installment==0)
			{
				dis =amt*5/100;
				System.out.println("Discount of Rs "+dis);
				System.out.println("Net Payable Amount is "+(amt-dis));
			}
			else if(mpay.equals(online) && Installment==0)
			{
				dis=amt*4/100;
				System.out.println("Discount of Rs "+dis);
				System.out.println("Net Paybale Amount is "+(amt-dis));
			}
			else if(Installment==2)
			{
				dis=amt*3/100;
				System.out.println("Discount of Rs "+dis);
				System.out.println("Net Payable Amount is "+(amt-dis));
			}
			else if(Installment==3)
			{
				dis=amt*1/100;
				System.out.println("Discount of RS "+dis);
				System.out.println("Net Payable Amount is "+(amt-dis));
			}
			else
			{
				System.out.println("No Discount");
			}
			
			
		}
		public String toString()
		{
			return car_id+" "+car_name+" "+price+" "+year+" "+brand_name+" ";
		}
		public static void main(String[] args) {
			int car_id,year,Installment;
			double price,amt;
			String car_name,brand_name,mpay;
			
			Car c1=new Car();
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Car id, car name, price, year , Brand name");
			car_id=sc.nextInt();
			car_name=sc.next();
			price=sc.nextDouble();
			year=sc.nextInt();
			brand_name=sc.next();
			
			System.out.println("Enter Paymnet Mode ");
			mpay=sc.next();
			System.out.println("Enter Installment Numbers ");
			Installment=sc.nextInt();
			c1.getData(car_id,car_name,price,year,brand_name,brand_name,mpay,Installment);
			System.out.println(c1);
			c1.Discount();
			
			
 
		}
		private void getData(int car_id2, String car_name2, double price2, int year2, String brand_name2,
				String brand_name3, String mpay2, int installment2) {
			// TODO Auto-generated method stub
			
		}

}
