package collections2injava;

import java.util.ArrayList;

public class Theater {
	int id;
	String name;
	ArrayList<Movie>mo;
	
	Theater(int id,String name,ArrayList<Movie>mo)
	{
		this.id=id;
		this.name=name;
		this.mo=mo;
		
	}
	
	public String toString()
	{
		return id+" "+name+" "+mo;
		
	}

}
