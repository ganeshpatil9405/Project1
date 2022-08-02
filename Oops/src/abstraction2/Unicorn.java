package abstraction2;

public abstract class Unicorn extends Bike {
	
	String engine;
	int modelno,installment;
	
	void setData1(int modelno, int installment,String engine)
	{
		this.modelno=modelno;
		this.installment=installment;
		this.engine=engine;
		
	}
	
	void gears()
	{
		System.out.println("Unicorn Have 5 Gears");
	}
	
	void features()
	{
		System.out.println("Digital Speedometer, Disc Brake");
	}
	
	void discount()
	{
		if(installment==1)
		{
			double discount=price*8/100;
			System.out.println("Discount of Rs "+discount);
		}
		else if(installment==2)
		{
			double discount=price*4/100;
			System.out.println("Discount of  Rs "+discount);
		}
		else
		{
			System.out.println("No Discount");
		}
	}
	void display()
	{
		System.out.println(engine+" "+modelno+" "+installment);
	}
	
	

}
