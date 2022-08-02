import java.util.Arrays;

public class Even_Odd_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,6,3,5,7,8,11};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]%2!=0)
				{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
			
		}
		System.out.println("New Array is :"+Arrays.toString(arr));
		

	}

}
