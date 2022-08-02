package assignment_polymorphism;

public class Student_Department {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(01,"Sushant");
		Student s2=new Student(02,"Sandesh");
		
		Department d1=new Department(1012,"Electrical",s1);
		Department d2=new Department(1013,"Mechanical",s2);
		
		System.out.println(d1);
		System.out.println(d2);

	}

}
