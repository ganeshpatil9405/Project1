package oracle_may11;

import java.util.Scanner;

public class StudentData {
	int id,marks;
	String name,dept;
	
	
	void setData(int id,String name,String dept,int marks)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.marks=marks;
		
	}
	
	public String toString()
	{
		return id+" "+name+" "+dept+" "+marks+" ";
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		StudentData s1=new StudentData();
		
		System.out.println("Enter student id, name, dept, marks");
		int id=sc.nextInt();
		String name=sc.next();
		String dept=sc.next();
		int marks=sc.nextInt();
		
		s1.setData(id,name,dept,marks);
		System.out.println(s1);
	}

}
