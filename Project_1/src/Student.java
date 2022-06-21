
public class Student {
	int id,marks;
	String name,dept;
	
	Student() {}

	void setid(int id)
	{
		this.id=id;
	}
	
	int getid()
	{
		return id;
	}
	
	void setName(String name)
	{
		this.name=name;
	}
	
	String getName()
	{
		return name;
	}

	
	void setDept(String dept)
	{
		this.dept=dept;
	}
	
	String getDept()
	{
		return dept;
	}
	
	void setMarks(int marks)
	{
		this.marks=marks;
	}
	
	int getMarks()
	{
		return marks;
	}
	/*Student(int id,String name,String dept,int marks)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.marks=marks;
	}*/
	
	public String toString()
	{
		return id+" "+name+" "+dept+" "+marks+" ";
	}

}
