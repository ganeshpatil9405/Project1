import java.util.Scanner;

public class ArraysExm1 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter array Size");
			int size=sc.nextInt();
			
			int arr[]=new int [size];
			int even = 0,odd=0;
			
			System.out.println("Enter"+size+"Elements");
			
			for(int i=0;i<size;i++)
			{
				arr[i]=sc.nextInt();
				
			}
			
			for(int i=0;i<size;i++)
			{
				if(arr[i]%2==0)
				{
					even=even+arr[i];
				
				}
				else
				{
					odd=odd+arr[i];
					
				}
			}
			System.out.println("Sum of even Numbers "+even);
			System.out.println("sum of odd Numbers "+odd);
		}
}
