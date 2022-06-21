package a;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,5,6,8,45,7,90};
		
		
			int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]%2!=0)
			{
				sum=sum+arr[i];
				
			}
			
			
		}
		System.out.println("Sum of odd Numbers "+sum);

	}

}
