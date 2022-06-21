package a;

public class test1 {
	int a=10;
	protected int b=20;
	public int c=30;
	private int d=40;
	
	public void display()
	{
		System.out.println("Display test 1");
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
			test1 t1=new test1();
			System.out.println(t1.a);
			System.out.println(t1.b);
			System.out.println(t1.c);
			System.out.println(t1.d);
			t1.display();
	}

}
