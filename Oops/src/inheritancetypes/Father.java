package inheritancetypes;

public class Father extends Grand_Father {
	String fn1;
	void setFather(String fn1)
	{
		this.fn1=fn1;
	}
	
	void display1()
	{
		System.out.println(fn1+" "+super.fn+" "+ln);
		
	}

	
}
