package assignment_polymorphism;

public class Series1 {
	
	double series(double  n)
	{
		double sum=0;
		for(int i=1;i<=n;i++)
		{
			double a=1.0/i;
			sum+=a;
		}
		return sum;
	}
	double series(double x,double y)
	{
		double sum=0;
		int b=1;
		for(int i=1;i<=y;i++)
		{
			int e=b+1;
			double c=x/Math.pow(x, e);
			sum+=c;
			b+=3;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Series1 s1=new Series1();
		System.out.println("First Series Sum= "+s1.series(5));
		System.out.println("Second Series sum= "+s1.series(3,7));
	}

}
