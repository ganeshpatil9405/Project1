package exception_exmp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample1 {
	
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int arr[]={10,20,30,50,60,70};
		System.out.println("Enter 2 numbers: ");
		int  a=0;
		int b=0;
		try
		{
			a=sc.nextInt();
			b= sc.nextInt();
			divide(a,b);	
		}
		/*catch(ArithmeticException  e)
		{
			//System.out.println(e);
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}*/
		finally
		{
			System.out.println("Finally block always executes");
			sc.close();
		}
		
		add(a,b);
		arrayElement(arr, 3);
		
		System.out.println("Done with the operations");
		
		

	}

}
