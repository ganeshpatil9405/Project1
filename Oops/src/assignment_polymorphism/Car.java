package assignment_polymorphism;

public class Car {
	String name,brand;
	int launchyear,price;
	
	void setData(String name,String brand,int launchyear,int price)
	{
		this.name=name;
		this.brand=brand;
		this.launchyear=launchyear;
		this.price=price;
	}
	void display()
	{
		System.out.println(name+" "+brand+" "+launchyear+" "+price);
	}

}
