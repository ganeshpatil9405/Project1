package assignment_set_map;

public class Item1 {
	
	int id,price,qty;
	String name;
	
	Item1(int id,String name,int price,int qty)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.qty=qty;
	}
	
	public String toString()
	{
		return id+" "+name+" "+price+" "+qty;
	}

}
