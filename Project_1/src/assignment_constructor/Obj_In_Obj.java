package assignment_constructor;

import java.util.Scanner;

public class Obj_In_Obj {
	int id,marks;
	String name;
	
	Obj_In_Obj(){}
	
	Obj_In_Obj(Obj_In_Obj s1)
	{
		id=s1.id;
		marks=s1.marks;
		name=s1.name;
		
	}
	
	Obj_In_Obj(int id,int marks,String name)
	{
		this.id=id;
		this.marks=marks;
		this.name=name;
	}
	void display()
	{
		System.out.println(id+" "+marks+" "+name+" ");
	}

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int id,marks;
		String name;
		System.out.println("Enter id,marks,name");
		id=sc.nextInt();
		marks=sc.nextInt();
		name=sc.next();
		
		Obj_In_Obj s1=new Obj_In_Obj(id,marks,name);
		
		Obj_In_Obj s2=new Obj_In_Obj(s1);
		
		s1.display();
		s2.display();
	}
	

}
