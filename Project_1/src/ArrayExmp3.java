import java.util.Scanner;

public class ArrayExmp3 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array Size ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int i;
		
		System.out.println("Enter" +size+ "Elements");
		
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter the Element you want to search");
		int n=sc.nextInt();
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				System.out.println("Number is present"+ n +" At index " + i);
				break;
			}
		
		}
		
	}

}
