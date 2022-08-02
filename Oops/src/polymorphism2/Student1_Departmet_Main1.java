package polymorphism2;

import java.util.Arrays;
import java.util.Scanner;

public class Student1_Departmet_Main1 {
	
public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		Department1 dept1[]=new Department1[1];
		Student1 stud1[]=new Student1[2];
		
		
		for(int i=0;i<1;i++)
		{
			System.out.println("Enter Dept  id, name Student list of "+(i+1)+" Dept");
			int did=sc.nextInt();
			String dname=sc.next();
			
			for(int j=0;j<2;j++)
			{
				
				System.out.println("Enter id , name, marks,  contact of "+(j+1)+"student");
				int id=sc.nextInt();
				String name=sc.next();
				int marks=sc.nextInt();
				String contact=sc.next();
				Student1 s=new Student1();
				s.setId(id);
				s.setName(name);
				s.setMarks(marks);
				s.setContact(contact);
				
				stud1[j]=s;
			
			}
			Department1 d=new Department1();
			d.setDid(did);
			d.setDname(dname);
			d.setStud(stud1);
			dept1[i]=d;
			
			
		}
		System.out.println(Arrays.toString(dept1));
		
				
		sc.close();
	}

}
