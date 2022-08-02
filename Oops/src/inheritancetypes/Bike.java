package inheritancetypes;

public class Bike {
	
	int price;
	String color,milege,brand;
	
	/*void setBikeData(int price, String color, String milege, String brand)
	{
		this.price=price;
		this.color=color;
		this.milege=milege;
		this.brand=brand;
	}*/
	
	
	
	public String toString()
	{
		return brand+" "+price+" "+color+" "+milege;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMilege() {
		return milege;
	}

	public void setMilege(String milege) {
		this.milege = milege;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	void wheelno()
	{
		System.out.println("2 Wheels");
	}
	void seats()
	{
		System.out.println("2 Seats");
	}
	void gears()
	{
		System.out.println("4 Gears");
	}

}
