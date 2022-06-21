package a;

public class Abc {
	int i=4;
	static int j=5;


	public static void main(String[] args) {
		Abc a1=new Abc();
		Abc a2=new Abc();
		
		

		
		
		

		a2.j=10;
		a1.j=20;
		System.out.println(a1.j);
		System.out.println(a2.j);
		a2.i=2;
		a1.i=7;
		System.out.println(a1.i);
		System.out.println(a2.i);
		// TODO Auto-generated method stub

	}

}
