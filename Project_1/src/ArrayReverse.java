import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		
		int arr[]=new int [size];
		
		System.out.println("Enter "+size+" Elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<size/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[size-i-1];
			arr[size-i-1]=temp;
		}
		System.out.println("Reverse of Array is ");
		System.out.println(Arrays.toString(arr));
		
	}

}
