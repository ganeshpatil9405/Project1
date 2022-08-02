package polymorphism2;

import java.util.Scanner;

public class Car_Company_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Car ID, Name, Model, Price");
		int id=sc.nextInt();
		String name=sc.next();
		String model=sc.next();
		int price=sc.nextInt();
		
		Car c1=new Car();
		c1.setId(id);
		c1.setName(name);
		c1.setModel(model);
		c1.setPrice(price);
		
		System.out.println("Enter Company Id,Name, Est year");
		int cid=sc.nextInt();
		String cname=sc.next();
		int year=sc.nextInt();
		
		Company c2=new Company();
		c2.setId(cid);
		c2.setName(cname);
		c2.setYear(year);
		c2.setCar(c1);
		System.out.print(c2);
		
		
		
		
		
		
		
		
		

	}

}
