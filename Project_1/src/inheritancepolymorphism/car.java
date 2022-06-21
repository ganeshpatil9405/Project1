package inheritancepolymorphism;

public class car {
	int id;
	String brand,name;
	driver d;
	
	 //Aggregation
	 /*car(int id, String brand,String name,driver d)
	{
		this.id=id;
		this.brand=brand;
		this.name=name;
		this.d=d;
	}*/
	//composition
	car(int id, String brand,String name,int did,String dname,String dcontact)
	{
		this.id=id;
		this.brand=brand;
		this.name=name;
		this.d=new driver(did,dname,dcontact);
	}
	public String toString()
	{
		return id+" "+brand+" "+name+" "+d;
	}

}
