package abstraction2;

public abstract class Bike {
	
	int price;
	String color,brand;
	
	void setData(int price,String color,String brand)
	{
		this.price=price;
		this.color=color;
		this.brand=brand;
	}
	
	void display()
	{
		System.out.println(price+" "+color+" "+brand);
	}
	
	void wheelno()
	{
		System.out.println("Bike has 2 Wheels");
	}
	
	void mirror()
	{
		System.out.println("Bike has 2 Mirrors");
	}
	
	abstract void gears();
	abstract void features();
	abstract void seatNo();
	abstract void discount();
	
	

}
