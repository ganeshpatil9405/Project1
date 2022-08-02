package assignment_polymorphism;

import java.util.Scanner;

public class Car_Hundai_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter car name,brand,launch year,Price");
		String name=sc.next();
		String brand=sc.next();
		int launchyear=sc.nextInt();
		int price=sc.nextInt();
		
		Hyundai h=new Hyundai();
		h.setData(name, brand, launchyear, price);
		
		System.out.println("Enter Hyundai id,modelNo,Installment, ModeofPayment");
		int id=sc.nextInt();
		int modelno=sc.nextInt();
		int installment=sc.nextInt();
		String modeofpayment=sc.next();
		
		
		h.setHyundai(id, modelno, installment, modeofpayment);
		h.discount();
		h.display();
		
		

	}

}
