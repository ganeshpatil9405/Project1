package inheritancetypes;

import java.util.Scanner;

public class Bike_Pulsor_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Pulsor p1=new Pulsor();
		p1.setPulsorData(158, "Pulsor", "Alpha");
		p1.setBikeData(158000, "Black", "40 km/pl", "Bajaj");
		
		System.out.println(p1);
		p1.engine();
		p1.gears();
		p1.seats();
		p1.wheelno();*/
		
		Scanner sc=new Scanner(System.in);
		Pulsor_Rs p=new Pulsor_Rs();
		
		System.out.println("Enter Bike Brand,Color, Price, milege, Name, Weight,ModelNo,enginetype,engineCC");
		String brand=sc.next();
		String color=sc.next();
		int price=sc.nextInt();
		String milege=sc.next();
		String name=sc.next();
		int weight=sc.nextInt();
		String modelno=sc.next();
		String engine_type=sc.next();
		String engine_cc=sc.next();
		
		p.setBrand(brand);
		p.setColor(color);
		p.setPrice(price);
		p.setMilege(milege);
		p.setName(name);
		p.setWeight(weight);
		p.setModelno(modelno);
		p.setPulsor_Rs(engine_type, engine_cc);
		
		p.engine();
		p.gears();
		p.seats();
		p.wheelno();
		
		System.out.println(p);
		
		

	}

}
