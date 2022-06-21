package class_object_homw;

import java.util.Scanner;

public class Student {
	int stud_id,math,sci,eng,marks,per;
	String stud_name,stud_dept;
	
	void studData(int id,String s,String t,int x,int y,int z)
	
	{
		stud_id=id;
		stud_name=s;
		stud_dept=t;
		math=x;
		sci=y;
		eng=z;
	}
	void marks()
	{
		marks= math+sci+eng;
		System.out.println("Total of Marks = "+marks);
	}
	void per()
	{
		per=(marks*80)/240;
		System.out.println("Percentage = "+per);
	}
	void Grade()
	{
		if(per>=75)
		{
			System.out.println("Pass with Distinction ");
		}
		else if(per>=65)
		{
			System.out.println("Pass with First class");
		}
		else if(per>=50)
		{
			System.out.println("Pass with Second Class");
		}
		else if(per>=40)
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}
			
	}
	public String toString()
	{
		return stud_id+" "+stud_name+" " +stud_dept+ " " +math+ " " +sci+ " " +eng+ " ";
	}
	public static void main(String[] args) {
		int stud_id,math,sci,eng;
		String stud_name,stud_dept;
		
		Scanner sc=new Scanner(System.in);
		
		Student a=new Student();
		System.out.println("Enter Student id, Name, Department, Maths, Science, English Marks ");
		stud_id=sc.nextInt();
		stud_name=sc.next();
		stud_dept=sc.next();
		math=sc.nextInt();
		sci=sc.nextInt();
		eng=sc.nextInt();
		a.studData(stud_id,stud_name,stud_dept,math,sci,eng);
		System.out.println(a);
		a.marks();
		a.per();
		a.Grade();
		
		
		
	}

}
