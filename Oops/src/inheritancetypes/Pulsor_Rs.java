package inheritancetypes;

public class Pulsor_Rs extends Pulsor {
	String engine_type,engine_cc;
	
	void setPulsor_Rs(String engine_type,String engine_cc) 
	{
		this.engine_type=engine_type;
		this.engine_cc=engine_cc;
	}
	public String toString()
	{
		return name+" "+brand+" "+price+" "+color+" "+milege+" "+weight+" "+modelno+" "+engine_type+" "+engine_cc;
	}
	

}
