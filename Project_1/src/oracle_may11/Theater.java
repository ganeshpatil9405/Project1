package oracle_may11;

import java.util.Scanner;

public class Theater {
	String name,movie1,movie2,movie3,movie4;
	String contact,movie;
	
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	
	void setMovie1(String movie1)
	{
		this.movie1=movie1;
	}
	String getMovie1()
	{
		return movie1;
	}
	
	void setMovie2(String movie2)
	{
		this.movie2=movie2;
	}
	String getMovie2()
	{
		return movie2;
	}
	
	void setMovie3(String movie3)
	{
		
		this.movie3=movie3;
	}
	String getMovie3()
	{
		return movie3;
	}
	
	void setMovie4(String movie4)
	{
		
		this.movie4=movie4;
	}
	String getMovie4()
	{
		return movie4;
	}
	
	void setContact(String contact)
	{
		this.contact=contact;
	}
	String getContact()
	{
		return contact;
	}
	
	 void movieDetails(String movie)
	 {
		 if(movie.equalsIgnoreCase(movie1))
		 {
			 
			 System.out.println("Ticket Price: SILVER=150, GOLD=250, PLATINUM=350 ");
			 System.out.println("Shows Timings: 12PM, 3PM , 6PM , 9PM , 12PM ");
		 }
		 else if(movie.equalsIgnoreCase(movie2))
		 {
			 
			 System.out.println("Ticket Price: SILVER=150, GOLD=250, PLATINUM=350 ");
			 System.out.println("Shows Timings: 12PM, 3PM , 6PM , 9PM , 12PM ");
		 }
		 else if(movie.equalsIgnoreCase(movie3))
		 {
			 
			 System.out.println("Ticket Price: SILVER=150, GOLD=250, PLATINUM=350 ");
			 System.out.println("Shows Timings: 12PM, 3PM , 6PM , 9PM , 12PM ");
		 }
		 else if(movie.equalsIgnoreCase(movie4))
		 {
			 
			 System.out.println("Ticket Price: SILVER=150, GOLD=250, PLATINUM=350 ");
			 System.out.println("Shows Timings: 12PM, 3PM , 6PM , 9PM , 12PM ");
		 }
		 else
			 System.out.println("No such Movie");
		 
	 }
	
	 public static void main(String[] args) {
		 
		 String name,movie1,movie2,movie3,movie4;
			String contact,movie;
		Theater t1=new Theater();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name, Contact No");
		 name=sc.next();
		 contact=sc.next();
		t1.setName(name);
		t1.setContact(contact);
		t1.setMovie1("RRR");
		t1.setMovie2("KGF2");
		t1.setMovie3("Dharmveer");
		t1.setMovie4("Jersey");
		System.out.println(t1.getName());
		
		System.out.println("move: "+t1.getMovie1()+"/"+t1.getMovie2()+"/"+t1.getMovie3()+"/"+t1.getMovie4());
		System.out.println("Enter the Movie Name");
		movie=sc.next();
		t1.movieDetails(movie);
		
		}

}
