import java.util.Arrays;
import java.util.Scanner;

public class ArraySwap {
	void swapNumbers(int size,int arr[])
	{
	int x=size/2;
	for(int i=0;i<size/2;i++)
	{
		int temp=arr[i];
		arr[i]=arr[x];
		arr[x]=temp;
		x++;
	}
	System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int size;
		int x;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Array");
		size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter the Elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		ArraySwap a=new ArraySwap();
		a.swapNumbers( size, arr);
		
		
		
	}

}
