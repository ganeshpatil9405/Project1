package assignment_polymorphism;

public class Student {
	int roll_no;
	String name;
	
	Student(int roll_no,String name)
	{
		this.roll_no=roll_no;
		this.name=name;
		
	}
	public String toString()
	{
		return roll_no+" "+name+" ";
	}

}
