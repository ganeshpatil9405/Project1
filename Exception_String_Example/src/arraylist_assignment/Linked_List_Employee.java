package arraylist_assignment;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
public class Linked_List_Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Employee> al=new LinkedList<Employee>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id,name,dept");
		for(int i=0;i<5;i++)
		{
			int id=sc.nextInt();
			String name=sc.next();
			String dept=sc.next();
			
			al.add(new Employee(id,name,dept));
		}
		System.out.println(al);
		String dept=" ";
		for(Employee emp:al)
		{
			if(emp.id==10)
			{
				dept=emp.dept;
			}
		}
		ListIterator<Employee> emp=al.listIterator();
		while(emp.hasNext())
		{
			Employee m=emp.next();
			if(m.dept.equals(dept))
			{
				emp.remove();
			}
		}
		System.out.println(al);
	}

}
