package inheritancepolymorphism;

public class driver {
	int id;
	String name,contact;
	
	driver(int id,String name,String contact)
	{
		this.id=id;
		this.name=name;
		this.contact=contact;
	}
	
	public String toString()
	{
		return id+" "+name+" "+contact;
	}

}
