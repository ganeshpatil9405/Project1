package inheritancetypes;

public class Grand_Father {
	String fn,mn,ln;
	
	void setGrand_Father(String fn,String mn,String ln)
	{
		this.fn=fn;
		this.mn=mn;
		this.ln=ln;
		
	}
	
	void display()
	{
		System.out.println(fn+" "+mn+" "+ln);
	}

}
