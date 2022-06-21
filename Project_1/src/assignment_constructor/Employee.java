package assignment_constructor;

import java.util.Scanner;

public class Employee {
	
	int emp_id,sal;
	String emp_name;
	
	Employee(){}
	
	int getid()
	{
		return emp_id;
	}
	
	void setid(int emp_id)
	{
		this.emp_id=emp_id;
	}
	
	String getName()
	{
		return emp_name;
	}
	void setName(String emp_name)
	{
		this.emp_name=emp_name;
	}
	
	int getSalary()
	{
		return sal;
	}
	void setSalary(int sal)
	{
		this.sal=sal;
	}
	
	Employee(int emp_id,String emp_name,int sal)
	{
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.sal=sal;
	}
	
	void display()
	{
		System.out.println(emp_id+" "+emp_name+" "+sal+" ");
	}
	
	public static void main(String[] args) {
		int emp_id,sal;
		String emp_name;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id, emp name, emp sal");
		emp_id=sc.nextInt();
		emp_name=sc.next();
		sal=sc.nextInt();
		
		Employee e1=new Employee();
		e1.setid(emp_id);
		e1.setName(emp_name);
		e1.setSalary(sal);
		e1.display();
		
		System.out.println("Enter id, empname, emp salary ");
		emp_id=sc.nextInt();
		emp_name=sc.next();
		sal=sc.nextInt();
		
		Employee e2=new Employee(emp_id,emp_name,sal);
		

		e2.display();
		
	}
}
