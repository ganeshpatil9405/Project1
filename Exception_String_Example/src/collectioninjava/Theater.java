package collectioninjava;

public class Theater {
	int id,collectionsinoned;
	String name;
	Theater(int id,String name,int collectionsinoned)
	{
		this.id=id;
		this.name=name;
		this.collectionsinoned=collectionsinoned;
	}
	
	public String toString()
	{
		return id+" "+name+" "+collectionsinoned;
	}

}
