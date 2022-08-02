package mapincollection;

public class Bike {
	int id;
	String name,colour;
	
	Bike(int id,String name,String colour)
	{
		this.id=id;
		this.name=name;
		this.colour=colour;
	}
	
	public String toString()
	{
		return id+" "+name+" "+colour;
	}
	
}
