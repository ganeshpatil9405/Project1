import java.util.Scanner;

public class ArrayOfObject {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Number of student");
		int num=sc.nextInt();
		
		Student stud[]=new Student[num];
		
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter "+(i+1)+" Student Details");
			System.out.println("Enter the Student Id");
			int id=sc.nextInt();
			System.out.println("Enter the Name");
			String name=sc.next();
			System.out.println("Enter Department");
			String dept=sc.next();
			System.out.println("Enter the Marks");
			int marks=sc.nextInt();
			
			Student s=new Student();
			s.setid(id);
			s.setName(name);
			s.setDept(dept);
			s.setMarks(marks);
			
			stud[i]=s;
			
			
			
			/*stud[i]=new Student(id,name,dept,marks);*/
		}
		//for each loop
		
		for(Student s:stud)
		{
			//if(s.marks<70)
			System.out.println(s);
		}
		
	}

}
