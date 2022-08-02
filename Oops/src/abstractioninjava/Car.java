package abstractioninjava;

public abstract class Car {
	
	int price;
	String brand;
	
	void setData(int price,String brand)
	{
		this.price=price;
		this.brand=brand;
		
	}
	
	void wheelno()
	{
		System.out.println("4 Wheeler");
	}
	void gears()
	{
		System.out.println("5 Gears");
	}
	
	abstract void noOfSeats();
	abstract void  dashBoard();
	abstract void engine();
	abstract void wheelType();
	

}
