package classobjects;

public class InstanceBlock {
	int id;
	static int marks;
	String name;
	
	{
		id=01;
		marks=564;
		name="rajesh";
		System.out.println("Instance Block 1st");
	}
	
	{
		id=02;
		marks=854;
		name="Amol";
		System.out.println("Instance Block 2nd");
	}
	InstanceBlock()
	{
		System.out.println("Default Constructor");
	}
	
	
	
	public static void main(String[] args) {
		int id;
		int marks;
		String name;
		InstanceBlock b1=new InstanceBlock();
		
		
		
	}

}
