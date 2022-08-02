package inheritancetypes;

import java.util.Scanner;

public class Father_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Grandfather fn,mn,ln ");
		String fn=sc.next();
		String mn=sc.next();
		String ln=sc.next();
		System.out.println("Enter Father fn");
		String fn1=sc.next();
		System.out.println("Enter Son fn");
		String fn2=sc.next();
		Son s=new Son();
		
		s.setGrand_Father(fn,mn,ln);
		s.setFather(fn1);
		s.setSon(fn2);
		s.display();
		s.display1();
		s.display2();

	}

}
