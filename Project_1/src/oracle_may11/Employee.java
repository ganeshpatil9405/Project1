package oracle_may11;

import java.util.Scanner;

public class Employee {
	int id,salary;
	String firstname,lastname,desig;
	
	void setId(int id)
	{
		this.id=id;
	}
	int getId()
	{
		return id;
	}
	
	void setFirstname(String firstname)
	{
		this.firstname= firstname;
	}
	String getFirstname()
	{
		return firstname;
	}
	public String toString()
	{
		return id+" "+firstname+" ";
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Employee e1=new Employee();
		
		System.out.println("Enter id & Firstname");
		int id=sc.nextInt();
		String firstname=sc.next();
		
		e1.setId(id);
		e1.setFirstname(firstname);
		System.out.println(e1);
		
		
		
	}
}
