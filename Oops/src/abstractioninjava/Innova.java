package abstractioninjava;

public abstract class Innova extends Car {
	
	void noOfSeats()
	{
		System.out.println("No of seats are 7 ");
		
	}
	void dashBoard()
	{
		System.out.println("Screen, Music System, Pendrive, charging");
	}
	
	void engine()
	{
		System.out.println("2400 cc");
	}
	
	public String toString()
	{
		return "Innova"+" "+brand+" "+price;
	}

}
