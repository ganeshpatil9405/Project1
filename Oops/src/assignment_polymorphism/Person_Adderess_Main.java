package assignment_polymorphism;

import java.util.Scanner;

public class Person_Adderess_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter city,State,Country");
		String city=sc.next();
		String state=sc.next();
		String country=sc.next();
		
		Adderess a=new Adderess();
		a.setCity(city);
		a.setState(state);
		a.setCountry(country);
		
		System.out.println("Enter name, Gender, Age");
		String name=sc.next();
		String gender=sc.next();
		int age=sc.nextInt();
		
		
		Person p =new Person();
		p.setName(name);
		p.setGender(gender);
		p.setAge(age);
		p.setAdderess(a);
		
		System.out.println(p);

	}

}
