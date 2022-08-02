package assignment_Inheritance;

public class Idproof {
	
	int validity;
	String idname,number;
	
	Idproof(String idname,String number,int validity)
	{
		this.idname=idname;
		this.number=number;
		this.validity=validity;
	}
	public String toString()
	{
		return idname+" "+number+" "+validity;
	}

}
