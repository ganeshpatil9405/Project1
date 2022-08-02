package polymorphism2;

import java.util.Arrays;

public class Department1 {
	
	int did;
	String dname;
	Student1 stud1[];
	
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Student1[] getStud() {
		return stud1;
	}
	public void setStud(Student1[] stud1) {
		this.stud1 = stud1;
	}
	
	public String toString()
	{
		return did+" "+dname+" "+Arrays.toString(stud1)+"\n";
	}

}
