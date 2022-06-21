package class_object_homw;

import java.util.Scanner;

public class MyDate {
	int date,mon,year;
	
	void getdata(int dd,int mm,int yy)
	{
		date=dd;
		mon=mm;
		year=yy;
		
	}
	public String toString()
	{
		return date+" "+"/"+mon+" "+"/"+year+" ";
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int date,mon,year;
		MyDate d1= new MyDate();
		System.out.println("Enter date month & year ");
		date=sc.nextInt();
		mon=sc.nextInt();
		year=sc.nextInt();
		d1.getdata(date, mon, year);
		System.out.println();
		System.out.println(d1);
		
		
		
		MyDate d2=new MyDate();
		date=sc.nextInt();
		mon=sc.nextInt();
		year=sc.nextInt();
		d2.getdata(date, mon, year);
		System.out.println(d2);
		
		
		
		
	}

}
