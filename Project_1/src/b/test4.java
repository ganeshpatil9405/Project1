package b;
import a.test1;
public class test4 {
	public static void main(String[] args) {
		test1 t1=new test1();
		//System.out.println(t1.a);//default
		//System.out.println(t1.b);//protected
		System.out.println(t1.c);
		//System.out.println(t1.d);//private
		t1.display();
		
	}

}
