package collectioninjava;

import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ArrayList<Student> al=new ArrayList<>();
		
		//Student s=new Student(101,"Ritesh","mech",80);
		al.add(new Student(101,"Arjun","mech",80));
		al.add(new Student(102,"Saurabh","Civil",55));
		al.add(new Student(103,"Sandesh","Instru",80));
		al.add(new Student(104,"Sushant","ENTC",80));
		al.add(new Student(105,"Akshay","Mech",80));
		al.add(new Student(106,"Pratik","Computer",80));
		al.add(new Student(107,"Shubham","Electrical",80));
		
		for(Student s:al)
		{
			//if(s.name.startsWith("S"))
			if(s.dept.equalsIgnoreCase("Computer") && s.marks>70)
			{
				System.out.println(s);
			}
		}
		
		
	}

}
