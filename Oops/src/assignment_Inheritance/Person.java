package assignment_Inheritance;

import java.util.Arrays;

public class Person {
	int id;
	String pname,contact,adderess;
	
	Idproof arr[];
	
	Person(int id, String pname,String contact,String adderess,Idproof arr[])
	{
		this.id=id;
		this.pname=pname;
		this.contact=contact;
		this.adderess=adderess;
		this.arr=arr;
		
	}
	public String toString()
	{
		return id+" "+pname+" "+contact+" "+adderess+" "+Arrays.toString(arr);
	}

}
