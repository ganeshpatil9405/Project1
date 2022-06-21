package classobjects;

import java.util.Scanner;

public class Student {
	int id;
	int marks;
	String name;
	static String colgname;
	
	static
	{
		System.out.println("First Block");
		colgname="PREC";
		
	}
	
	Student(){}
	Student(int id,int marks,String name)
	{
		this.id=id;
		this.marks=marks;
		this.name=name;
	}
	void display()
	{
		colgname="PREC";
		System.out.println( id+" "+marks+" "+name+" ");
	}
	
	public static void main(String[] args) {
		int id,marks;
		String name;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter student id, marks,name");
		id=sc.nextInt();
		marks=sc.nextInt();
		name=sc.next();
		System.out.println(colgname);
		Student s1=new Student(id,marks,name);
		s1.display();
		
		
		
	}

}
