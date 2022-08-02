package assignment_Inheritance;

public class Employee_Salary extends Employee{
	
	void bonus()
	{
		System.out.println("Bonus=10000");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee_Salary e=new Employee_Salary();
		e.salary();
		e.bonus();
		
		
		
			
		

	}

}
