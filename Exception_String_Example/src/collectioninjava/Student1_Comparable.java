package collectioninjava;

import java.util.ArrayList;
import java.util.Collections;

public class Student1_Comparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student1> al=new ArrayList<>();
		
		al.add(new Student1(101,"Sandesh","Mechanical",80));
		al.add(new Student1(103,"Nilesh","Civil",95));
		al.add(new Student1(105,"Sushant","ENTC",60));
		al.add(new Student1(102,"Akshay","Mecahnical",80));
		al.add(new Student1(108,"Gaurav","Instru",90));
		al.add(new Student1(112,"Anil","Computer",85));
		al.add(new Student1(113,"Aniket","Electrical",80));

		
		//Collections.sort(al);
		
		Collections.sort(al,new StudentDeptComparator());
		
		System.out.println(al);


	}

}
