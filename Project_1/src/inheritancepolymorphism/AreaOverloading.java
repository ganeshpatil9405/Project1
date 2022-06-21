package inheritancepolymorphism;

public class AreaOverloading {
	
	void area(int r)
	{
		double pi=3.14*r*r;
		System.out.println("Area of Circle:"+pi);
	}
	void area(int b,int h)
	{
		double are=1/2*(b*h);
		System.out.println("Area of Triangle "+are);
	}
	void area(double l,int b)
	{
		double ar=l*b;
		System.out.println("Area of Rectangle"+ar);
	}
	void area(double s,double sq)
	{
		sq=s*s;
		System.out.println("Area of Square"+sq);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOverloading a1=new AreaOverloading();
		
		a1.area(5);
		a1.area(3,4);
		a1.area(3.56, 8);
		a1.area(3.58,3.68);

	}

}
