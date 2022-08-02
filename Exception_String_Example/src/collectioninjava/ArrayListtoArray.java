package collectioninjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListtoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(10);
		al.add(20);
		al.add(50);
		al.add(10);
		al.add(40);
		al.add(80);
		al.add(60);
		al.add(70);
		
		System.out.println(al);
		
		Collections.sort(al);//Sorting in Asending Order
		System.out.println(al);
		Collections.reverse(al);//Sorting in desending order.....to Desending First Convert in Asending order
		System.out.println(Collections.frequency(al, 80));
		//System.out.println(Collections.indexOfSubList(al, al1));
		
		int arr[]=new int[al.size()];
		for(int i=0;i<al.size();i++)
		{
			arr[i]=al.get(i);
			//al.add(arr[i]); Converting Array to ArrayList
		}
		
		System.out.println(Arrays.toString(arr));
		Integer ai[]=new Integer[al.size()];
		al.toArray(ai);
		
		System.out.println("Object Array :"+Arrays.toString(ai));

	}

}
