package assignment_polymorphism;

public class Person {
	int age;
	String name,gender,Adderess;
	Adderess a1;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Adderess getAdderess() {
		return a1;
	}
	public void setAdderess( Adderess a1) {
		this.a1 = a1;
	}
	
	public String toString()
	{
		return name+" "+gender+" "+age+" "+a1;
	}
	
	
}
