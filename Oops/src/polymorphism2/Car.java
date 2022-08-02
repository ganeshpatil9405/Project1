package polymorphism2;

public class Car {
	
	Car(){}
	
	
	int id,price;
	String name,model;
	
	public void setId(int id)
	{
		this.id=id;
	}
	int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
		
	}
	public String getName()
	{
		return name;
	}
	
	public void setModel(String model)
	{
		this.model=model;
	}
	public String getModel()
	{
		return model;
	}
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	int getPrice()
	{
		return price;
	}
	
	public String toString()
	{
		return id+" "+name+" "+model+" "+price+" ";
	}
	
	
	

}
