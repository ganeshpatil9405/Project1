import java.util.Scanner;

public class ArrayMissingNumber {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array Size");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter "+size+" Elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int cnt=1;
		for(int i=0;i<arr.length;)
		{
			if(arr[i]==cnt)
			{
				i++;
				cnt++;
			}
			else
			{
				System.out.print(cnt);
				//cnt=cnt+2;
				cnt++;
			}
			
		}
		
		
	}

}
