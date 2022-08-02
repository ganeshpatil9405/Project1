package setsinjava;


import java.util.TreeSet;

public class EmployeeMainTreeSet {
	
	public static void main(String[] args) {
		
		TreeSet<Employee> tm= new TreeSet<>();
		
		tm.add(new Employee(101,"Rupesh","HR",51000));
		tm.add(new Employee(108,"Rakesh","Marketing",52000));
		tm.add(new Employee(106,"Sandesh","Sales",45000));
		tm.add(new Employee(104,"Pravin","Manufacturing",49000));
		tm.add(new Employee(201,"Rahul","R&D",89000));
		
		
	}

}
