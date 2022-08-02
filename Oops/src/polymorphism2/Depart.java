package polymorphism2;

import java.util.Arrays;

public class Depart {
	String dname;
	int totalemp;
	
	Employee emp[];
	public String getDname() {
		return dname;
	}
	public void setTotalemp(int totalemp)
	{
		this.totalemp=totalemp;
	}
	public int getTotalemp()
	{
		return totalemp;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Employee[] getEmp() {
		return emp;
	}
	public void setEmp(Employee[] emp) {
		this.emp = emp;
	}
	
	public String toString()
	{
		return dname+" "+Arrays.toString(emp)+"\n";
	}
	

}
