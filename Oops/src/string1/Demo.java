package string1;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Employee");
		int num=sc.nextInt();
		
		
		Employee emp[]=new Employee[num];
		
		
		for(int i=0;i<emp.length;i++)
		{
		Employee e1=new Employee();
		System.out.println("Enter id,name, salary ");
		int id=sc.nextInt();
		String name=sc.next();
		int salary=sc.nextInt();
		
		
		
		e1.setId(id);
		e1.setName(name);
		e1.setSalary(salary);
		
		
		e1.getId();
		e1.getName();
		e1.getSalary();
		emp[i]=e1;
		
		
		
		
		}
		//System.out.println(e1);
		System.out.println(Arrays.toString(emp));
	}
	
	

}

class Employee{
	int id,salary;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString()
	{
		return id+" "+name+" "+salary+" ";
	}
	
	
}