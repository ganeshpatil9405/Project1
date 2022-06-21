import java.util.Scanner;

public class ArrayExp4 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter "+size+"Elements ");
		int even=0,odd=0;
		int i=0;
		
		for( i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		for( i=0;i<arr.length;i++)
		{
			if(arr[i]>=0)
			{
				System.out.println("Positive numbers are "+arr[i]);
				
			}
			else
			{
				System.out.println("Negative Numbers are "+arr[i]);
			}
			
		}
		
		
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("Even Number is "+arr[i]);
			}
			else
			{
				System.out.println("Odd Numbers is "+arr[i]);
			}
		}
		
		
		
	}

}
