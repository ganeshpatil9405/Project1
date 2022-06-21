package oracle_may5;

import java.util.Scanner;

public class frequencyofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Num");
		int num=sc.nextInt();
		
		
		int temp;
		temp=num;
		for(int i=0;i<=9;i++)
		{
			int cnt=0;
			while(num!=0)
			{
				int r=num%10;
				if(r==1)
				{
					cnt++;
				}
				num=num/10;
				
				
			}
			num=temp;
			if(cnt>0)
			System.out.println(i+ " " +cnt);
		}
		

	}

}
