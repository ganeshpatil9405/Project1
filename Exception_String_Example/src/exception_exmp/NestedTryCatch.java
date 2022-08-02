package exception_exmp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryCatch {
	static void add(int a,int b)
	{
		System.out.println("Addition is: "+(a+b));
	}
		
	static void divide(int a,int b)
	{
		System.out.println("Division in process");
		System.out.println("Division is: "+(a/b));
	}
	
	static void arrayElement(int arr[],int i)
	{
		System.out.println("elemen at the index is: "+arr[i]);
	}
	
	static void stringElement(String s,int i)
	{
		System.out.println("Character at the index of string is: "+s.charAt(i));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int arr[]={10,20,30,50,60,70};
		System.out.println("Enter 2 numbers: ");
		int a=sc.nextInt();
		int b= sc.nextInt();
		//nested try catch
		try
		{	
			try
			{
				try
				{
					arrayElement(arr, 7);
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println(e);
				}
				stringElement("India", 8);
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			divide(a,b);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			//e.printStackTrace();//System.err printed
		}
		
		add(a,b);
		System.out.println("Done with the operations");
		
	}
}
