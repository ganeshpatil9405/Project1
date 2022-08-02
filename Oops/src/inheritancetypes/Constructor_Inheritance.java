package inheritancetypes;

class A
{
	A()
	{
		
		System.out.println("Default Constructor of A");
	}
	A(int a)
	{
		System.out.println("1 Paramiterized Constructor of A"+a);
	}
	
}
class B extends A
{
	int a=1000;
	B()
	{
		super();
		System.out.println("Default Constructor Of B");
	}
	B(int a)
	{
		super(1000);
		System.out.println("1 Paramiterized Constructor of B "+a);
	}
	void display()
	{
		System.out.println("In B Display Method");
	}
}


public class Constructor_Inheritance {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B x=new B(100);
		x.display();
		
	

	}

}
