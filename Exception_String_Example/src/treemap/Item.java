package treemap;

public class Item {
	int id,cost;
	public String name;
	String company;
	
	Item(int id,String name,String company,int cost)
	{
		this.id=id;
		this.name=name;
		this.company=company;
		this.cost=cost;
	}
	
	public String toString()
	{
		return id+" "+name+" "+company+" "+cost;
	}

}
