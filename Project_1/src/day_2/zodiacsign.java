package day_2;

import java.util.Scanner;

public class zodiacsign {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Birth Date Month Year");
		int dd=sc.nextInt();
		int mm=sc.nextInt();
		int yy=sc.nextInt();
		
		if(mm==1)
		{
			if(dd<=19)
			{
				System.out.println("Your zodiac sign is caprion");
			}
			else if(dd>=20 && dd>=30)
			{
				System.out.println("your zodiac sign is Aquarus");
				
			}
			
		
			else
			{
				System.out.println("Invalid Date");
			}
		}
		else if(mm==2)
		{
			if(dd<=19)
			{
				System.out.println("your zodiac sign is Aquarus ");
			}
			else if(dd>=20 && dd>=28)
			{
				System.out.println("Your zodiac sign is pieces ");
				
			}
			
		
			else
			{
				System.out.println("Invalid date");
			}
		}
		else if(mm==3)
		{
			if(dd<=19)
			{
				System.out.println("Your zodiac sign is Pieces");
			}
			else if(dd>=20 && dd>=28)
			{
				System.out.println("Your zodiac sign is Aries");
			}
		
			else
			{
				System.out.println("Invalid date");
			}
		}
		else if(mm==4)
		{
			if(dd<=19)
			{
				System.out.println("your zodiac sign is Aries");
			}
			else if(dd>=20 && dd>=28)
			{
				System.out.println("Your zodiac sign is Taurus");
			}
			
		
			else
			{
				System.out.println("Invalid date");
			}
		}
		else if(mm==5)
		{
			if(dd<=19)
			{
				System.out.println("Your Zodiac sign is Taurus ");
			}
			else if(dd>=20 && dd>=31)
			{
				System.out.println("Your zodiac sign is Gemini");
			}
			else
			{
				System.out.println("Invalid Date");
			}
		}
		else if(mm==6)
		{
			if(dd<=19)
			{
				System.out.println("Your Zodiac sign is Gemini");
			}
			else if(dd>=20 && dd>=31)
			{
				System.out.println("Your zodiac sign is Cancer");
			}
			else 
			{
				System.out.println("Invalid Date");
			}
		}
		else if(mm==7)
		{
			if(dd<=19)
			{
				System.out.println("Your zodiac sign is Cancer ");
			}
			else if(dd>=20 && dd>=31)
			{
				System.out.println("Your zodiac sign is leo");
			}
			else
			{
				System.out.println("Invalid Date");
			}
		}
		else if(mm==8)
		{
			if(dd<=19)
			{
				System.out.println("Your zodiac Sign is leo");
			}
			else if(dd>=20 && dd>=31)
			{
				System.out.println("Your Zodiac sign is virgo");
			}
			else
			{
				System.out.println("Invalid Date");
			}
		}
		else if(mm==9)
		{
			if(dd<=19)
			{
				System.out.println("Your Zodiac sign is virgo");
			}
			else if(dd>=20 && dd>=31)
			{
				System.out.println("your Zodiac sign is Libra");
			}
			else
			{
				System.out.println("Invalid date");
			}
		}
		else if(mm==10)
		{
			if(dd<=19)
			{
				System.out.println("Your Zodiac sign is Libra");
			}
			else if(dd>=20 && dd>=31)
			{
				System.out.println("Your Zodiac sign is Scorpio");
			}
			else
			{
				System.out.println("Invalid date");
			}
		}
		else if(mm==11)
		{ 
			if(dd<=19)
			{
				System.out.println("Your Zodiac sign is Scorpio");
			}
			else if(dd>=20 && dd>=31)
			{
				System.out.println("Your Zodiac sign is Sagittarius");
			}
			else
			{
				System.out.println("Invalid Date");
			}
		}
		else if(mm==12)
		{
			if(dd<=19)
			{
				System.out.println("Your Zodiac sign is sagittarius");
			}
			else if(dd>=20 && dd>=31)
			{
				System.out.println("Your Zodiac sign is Capricon");
			}
			else
			{
				System.out.println("Invalid Date");
			}
		}
		else
		{
			System.out.println("invalid Entry");
		}
		
			
		
	}
	

}
