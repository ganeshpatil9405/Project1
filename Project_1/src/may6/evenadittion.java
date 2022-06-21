package may6;

public class evenadittion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int i;
		int sum=0;
		int sum1=0;
		
		for(i=2;i<=10;i+=2)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
			
		}
		System.out.println("Sum of even Number is :"+sum);
		
		for(i=1;i<=10;i+=2)
		{
			if(i%2==1)
			{
				sum1=sum1+i;
			}
		}
		System.out.println("Sum of odd Number is :"+sum1);

	}

}
