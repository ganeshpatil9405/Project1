package inheritancetypes;

public class Constructor_Chaining {
	
	Constructor_Chaining()
	{
		System.out.println("Default Constructor");
	}
	Constructor_Chaining(int a)
	{
		this();
		System.out.println("1 Parameterized Constructor"+a);
	}
	Constructor_Chaining(int a,int b)
	{
		this(100,20,30);
		System.out.println("2 Parameterized Constructor"+a+" "+b);
	}
	Constructor_Chaining(int a,int b,int c)
	{
		this();
		
		System.out.println("3 Parameterized Constructor"+a+" "+b+" "+c);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_Chaining a=new Constructor_Chaining(100,20);
		

	}

}
