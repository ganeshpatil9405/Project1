package abstraction2;

public class Activa extends Unicorn{
	
	int modelno,installment;
	String engine;
	
	void setData2(int modelno, int installment,String engine)
	{
		this.modelno=modelno;
		this.installment=installment;
		this.engine=engine;
		
	}
	
	void features()
	{
		System.out.println("Charging Socket, More Space for Comfortable ");
	}
	void seatNo()
	{
		System.out.println("2 Seater");
	}
	void discount()
	{
		if(installment==1)
		{
			double discount=price*5/100;
			System.out.println("Discount of Rs "+discount);
		}
		else if(installment==2)
		{
			double discount=price*3/100;
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
