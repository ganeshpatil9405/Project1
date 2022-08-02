package inheritancetypes;

public class Son extends Father {
	String fn2;
	
	void setSon(String fn2)
	{
		this.fn2=fn2;
		
	}
	void display2()
	{
		System.out.println(fn2+" "+super.fn1+" "+ln);
	}
}
