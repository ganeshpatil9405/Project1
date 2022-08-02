package polymorphism2;

public class Company {
	int cid,year;
	String cname;
	Car c;
	
	public void setId(int cid)
	{
		this.cid=cid;
	}
	int getId()
	{
		return cid;
	}
	
	public void setYear(int year)
	{
		this.year=year;
	}
	int getYear()
	{
		return year;
	}
	
	public void setName(String cname)
	{
		this.cname=cname;
	}
	public String getName()
	{
		return cname;
	}
	public void setCar(Car c)
	{
		this.c=c;
	}
	public Car getCar()
	{
		return c;
	}
	
	
	public String toString()
	{
		return cid+" "+year+" "+cname+" "+c;
	}

}
