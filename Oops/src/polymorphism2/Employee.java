package polymorphism2;

public class Employee {
	int id, salary;
	String name,dept1,contact, adderess;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept1;
	}
	public void setDept(String dept1) {
		this.dept1 = dept1;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAdderess() {
		return adderess;
	}
	public void setAdderess(String adderess) {
		this.adderess = adderess;
	}
	
	public String toString()
	{
		return  id+" "+name+" "+dept1+" "+salary+" "+contact+" "+adderess+"\n \n";
	}

}
