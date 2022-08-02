package collectioninjava;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrayLiUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> al=new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Student");
		int num=sc.nextInt();
		
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter Student id, Name, Dept, Marks");
			int id=sc.nextInt();
			String name=sc.next();
			String dept=sc.next();
			int marks=sc.nextInt();
			
			al.add(new Student(id,name,dept,marks));
			
			
		}
		for(Student s:al)
		{
			if(s.marks>80)
			{
				System.out.println(s);
			}
		}

	}

}
