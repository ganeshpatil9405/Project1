import java.util.Scanner;

public class ArrayIndexPosition {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Element");
		int size=sc.nextInt();
		
		System.out.println("Enter "+size+"Elements");
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter Number to find Index");
		int num=sc.nextInt();
		
		int i=0;
		int index=-1;
		while(i<arr.length)
		{
			if(arr[i]==num)
			{
				index=i;
				break;
			}
			i++;
		}
		System.out.println("Index of Element is "+index);
	}

}
