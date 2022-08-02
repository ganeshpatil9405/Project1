package assignment_polymorphism;

public class Hyundai extends Car {
	
	int id,modelno,installment;
	String modeofpayment;
	
	
	void setHyundai(int id,int modelno,int installment,String modeofpayment)
	{
		this.id=id;
		this.modelno=modelno;
		this.installment=installment;
		this.modeofpayment=modeofpayment;
	}
	
	void display()
	{
		super.display();
		System.out.println(id+" "+modelno+" "+modeofpayment+" ");
	}
	void discount()
	{
		if(modeofpayment.equals("cash") && installment==0)
		{
			double discount=price*10/100;
			System.out.println("Total Discount is "+discount);
		}
		else if(modeofpayment.equals("online") && installment==0)
		{
			double discount=price*12/100;
			System.out.println("Total Discount is "+discount);
		}
		else if(installment==1)
		{
			double discount =price*5/100;
			System.out.println("Total Discount is "+discount);
		}
		else if(installment==2) 
		{
			double discount =price*3/100;
			System.out.println("Total Discount is "+discount);
		}
		else
		{
			System.out.println("No Discount ");
		}
	}

}
