package oracle_may11;

import java.util.Scanner;

public class StudentConstructor {
	
	int id, marks;
	String name;
	
	StudentConstructor() {}
	
	void setId(int id)
	{
		this.id=id;
	}
	int getId()
	{
		return id;
	}
	
	void setMarks(int marks)
	{
		this.marks=marks;
	}
	int getMarks()
	{
		return marks;
	}
	
	public String toString()
	{
		return id+" "+marks+" ";
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		StudentConstructor s1=new StudentConstructor();
		
		System.out.println("Enter student id , marks & Name");
		
		int id=sc.nextInt();
		int marks=sc.nextInt();
		
		
		s1.setId(id);
		s1.setMarks(marks);
		System.out.println(s1);
		
	}

	
		
		
	}

