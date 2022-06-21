package oracle_may11;

public class Fibonacciseies {
	public static void main(String[] args) {
		
		int n1=0,n2=1,n3,i,count=10;
		
		
		
		for(i=1;i<=count;i++)
		{
			System.out.print(n1+" ");
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		
	}

}
