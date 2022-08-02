package polymorphism2;

import java.util.Arrays;
import java.util.Scanner;

public class Employee_Department_main1 {
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Depart dept[]=new Depart[2];
		
		
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter Dept name & Total no emp");
			String dname=sc.next();
			int totalemp=sc.nextInt();
			
			Employee emp[]=new Employee[3];
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
				if(e.getSalary()>50000)
				{
					int sal=e.getSalary()*15/100;
					System.out.println(e.name+" "+e.getSalary()+" Old Salary "+(e.getSalary()+ sal)+" Bonus Salary");
					
				}
			}
		}
		sc.close(); 

}
}
