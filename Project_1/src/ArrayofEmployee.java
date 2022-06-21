import java.util.Scanner;

public class ArrayofEmployee {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number of Employees");
		int n=sc.nextInt();
		
		Employee emp[]=new Employee[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter "+(i+1)+" Employee Details");
			System.out.println("Enter Employee id:");
			int id=sc.nextInt();
			System.out.println("Enter Employee name:");
			String name=sc.next();
			System.out.println("Enter Employee department");
			String dept=sc.next();
			System.out.println("Enter salary:");
			int salary=sc.nextInt();
			System.out.println("Enter Employee Location");
			String location=sc.next();
			
			Employee e=new Employee();
			e.setId(id);
			e.setName(name);
			e.setDept(dept);
			e.setSalary(salary);
			e.setLocation(location);
			
			emp[i]=e;
		}
		for(Employee e:emp)
		{
			if(e.getDept().equals("HR") && e.getSalary()>30000)
			{
				System.out.println(e);
			}
		}
	}

}
