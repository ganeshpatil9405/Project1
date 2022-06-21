package class_object_homw;

import java.util.Scanner;

public class CountryGame {
		
		
	
	String country;
	void getData(String s)
	{
		country=s;
	}
	
	public String toString()
	{
		return country;
	}
	
	void Game()
	{
		switch(country)
		{
		case "India":
			System.out.println("Hockey is National Game");
			break;
		case "US" :
			System.out.println("Baseball is National Game");
			break;
		case "China":
			System.out.println("Table tenis is National Game");
			break;
		case "Italy":
			System.out.println("Football is National game");
			break;
		case "Bangladesh":
			System.out.println("Kabaddi is a National Game");
			break;
		default:
			System.out.println("Invalid Name");
		}
	}
	public static void main(String[] args) {
		String country;
		Scanner sc=new Scanner(System.in);
		System.out.println("Note: country's Name First letter is capital ");
		
		CountryGame g1=new CountryGame();
		System.out.println("Enter Country Name :");
		country=sc.next();
		g1.getData(country);
		g1.Game();
				
	}


}
