import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
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
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}System.out.println("Quick sort "+Arrays.toString(arr));
		System.out.println("Highest Second Number"+arr[1]);
		System.out.println("Minimum Second Number "+arr[size-2]);
		
		/*int a[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
		}
		System.out.println("Bubble sort "+Arrays.toString(a));
		System.out.println("Highest second Number"+a[size-2]);
		System.out.println("Second Smallest Number "+a[2]);*/
	}

}
