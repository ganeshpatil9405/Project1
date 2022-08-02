package oracle_may11;

import java.util.Scanner;

public class SimpleInterest {
	
	int si(int p,int r,int t)
	{
		return p*r*t;
	}
	
	void cal(int p,int r,int t)
	{
		double interest=si(p,r,t)/100;
		System.out.println("Simple Interst is "+interest);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Principle, rate of interest & Time");
		int p=sc.nextInt();
		int r=sc.nextInt();
		int t=sc.nextInt();
		
		SimpleInterest s1=new SimpleInterest();
		s1.cal(p,r,t);
	
		
		System.out.println("Enter Principle, rate of interest & Time");
		 p=sc.nextInt();
		 r=sc.nextInt();
		 t=sc.nextInt();
		
		SimpleInterest s2=new SimpleInterest();
		s2.cal(p,r,t);
		sc.close();
		
	}

	

}
