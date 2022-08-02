package polymorphism2;

import java.util.Arrays;
import java.util.Scanner;

public class Employee_Depart_Main {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Depart dept[]=new Depart[1];
		Employee emp[]=new Employee[3];
		
		for(int i=0;i<1;i++)
		{
			System.out.println("Enter Dept name & Total Emp no"+(i+1));
			String dname=sc.next();
			int totalemp=sc.nextInt();
			
			
			for(int j=0;j<3;j++)
			{
				System.out.println("Enter "+(j+1)+" Employee ID,name,department,Salary , Contact , Adderess");
				int id=sc.nextInt();
				String name=sc.next();
				String dept1=sc.next();
				int salary=sc.nextInt();
				String Contact=sc.next();
				String adderess=sc.next();
				
				Employee e=new Employee();
				e.setId(id);
				e.setName(name);
				e.setDept(dept1);
				e.setSalary(salary);
				e.setContact(Contact);
				e.setAdderess(adderess);
				
				emp[j]=e;
				
			}
			Depart d=new Depart();
			d.setDname(dname);
			d.setTotalemp(totalemp);
			d.setEmp(emp);
			dept[i]=d;
			
		}
		System.out.println(Arrays.toString(dept));
		for(Depart d:dept)
		{
			for(Employee e:d.emp)
			{
				if(e.getAdderess().equals("pune") && e.getSalary()>30000)
				{
					System.out.println(d.dname+" "+e.id+" "+e.name+" "+e.dept1+" "+e.salary+" "+e.contact+" "+e.adderess+" ");
				}
			}
		}
		sc.close();
	}

}
