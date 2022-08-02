package mapincollection;


import java.util.HashMap;

public class Employee1_Map {
public static void main(String[] args) {

	HashMap<Employee1, Integer> Data=new HashMap<>();
	Data.put(new Employee1("gaurav","Developer",10),60000);
	Data.put(new Employee1("HR","madhavan",125), 50000);
	Data.put(new Employee1("gaurav","Developer",10),60000);
	Data.put(new Employee1("keshav","Sales",9), 45000);
	Data.put(new Employee1("HR","madhavan",125), 50000);
	System.out.println(Data);
	
}
}
