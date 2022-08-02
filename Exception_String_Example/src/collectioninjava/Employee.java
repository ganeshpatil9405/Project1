package collectioninjava;

public class Employee implements Comparable<Employee>{
	int id,salary;
	String name,dept;
	
	Employee(int id,String name,String dept,int salary)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	
	public String toString()
	{
		return id+" "+name+" "+dept+" "+salary;
	}

	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		if(this.id>e.id)
			return 1;
		else 
			if(this.id<e.id)
				return -1;
			else
				return 0;
		
		//return this.name.compareTo(e.name);
		
		/*if(this.salary>e.salary)
			return 1;
		else if(this.salary<e.salary)
			return -1;
		else
			if(this.id>e.id)
				return -1;
			else if(this.id<e.id)
				return 1;
			else
				return 0;*/
		
	}

}
