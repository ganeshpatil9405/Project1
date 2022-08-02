package assignment_Inheritance;

import java.util.Scanner;

public class Sum_Of_Number_Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to check Pair");
		int sum=sc.nextInt();
	
	
	int arr[]= {11,15,4,10,6,17,3};
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if((arr[i]+arr[j])==sum)
			{
				System.out.println("Count of Pairs is "+arr[i]+" "+arr[j]+" ");	
			}
			
		}
		
	}
	sc.close();
	
	
	}

}
