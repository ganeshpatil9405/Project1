package collectioninjava;

public class Student1 implements Comparable<Student1> {

	int id,marks;
	String name,dept;
	
	Student1(int id,String name,String dept,int marks)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.marks=marks;
	}
	
	public String toString()
	{
		return id+" "+name+" "+dept+" "+marks;
	}

	

	@Override
	public int compareTo(Student1 s) {
		// TODO Auto-generated method stub
		if(this.dept.equals(s.dept))
		{
			if(this.marks>s.marks)
				return 1;
			else if(this.marks<s.marks)
				return -1;
			else
				//return this.id-s.id;
				return this.name.compareTo(s.name);
		}
		else
		{
			return this.dept.compareTo(s.dept);
		}
				
	}

}
