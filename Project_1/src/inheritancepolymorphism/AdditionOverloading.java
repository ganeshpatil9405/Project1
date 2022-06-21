package inheritancepolymorphism;

public class AdditionOverloading {
	
	void add(int a,int b)
	{
		System.out.println("Addition is: "+(a+b));
	}
	void add(int a,int b,int c)
	{
		System.out.println("Addition of 3 numbers: "+(a+b+c));
	}
	void add(int a, float b)
	{
		System.out.println("Addition of (int+float) Numbers:"+(a+b));
	}
	void add(float a,float b)
	{
		System.out.println("Addition of (float+float) is"+(a+b));
	}
	void add(String a,String b)
	{
		System.out.println("Addition of Two String "+(a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdditionOverloading a1=new AdditionOverloading();
		
		a1.add(3, 5);
		a1.add(5, 9,6);
		a1.add(5, 6.5f);
		a1.add(6.5f, 8.9f);
		a1.add("ABC", "DFG");
		
		
		

	}

}
