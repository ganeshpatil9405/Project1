package assignment_polymorphism;

public class Department {
	int id;
	String name;
	Student s;
	
	Department(int id, String name,Student s)
	{
		this.id=id;
		this.name=name;
		this.s=s;
		
	}
	public String toString()
	{
		return id+" "+name+" "+s;
	}

}
