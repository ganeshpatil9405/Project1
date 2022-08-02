package collectioninjava;

import java.util.ArrayList;
import java.util.Collections;

public class Employee_Comparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> al=new ArrayList<>();
		
		al.add(new Employee(2,"Ramesh","HR",55000));
		al.add(new Employee(1,"Suresh","Accounts",80000));
		al.add(new Employee(4,"Sandesh","Production",60000));
		al.add(new Employee(3,"Saurabh","Marketing",50000));
		
		Collections.sort(al);
		
		System.out.println(al);

	}

}
