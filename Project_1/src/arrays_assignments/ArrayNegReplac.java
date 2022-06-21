package arrays_assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayNegReplac {
	public static void main(String[] args) {
		int i,size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of elements");
		size=sc.nextInt();
		System.out.println("Enter "+size+" Elements");
		int a[]=new int[size];
		
		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(i=0;i<size;i++)
		{
			if(a[i]<0)
			{
				a[i]=a[i-1]*a[i-1];
				
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
