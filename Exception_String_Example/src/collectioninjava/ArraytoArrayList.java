package collectioninjava;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraytoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer arr[]= {10,20,30,40,50,8,6,5,4};
		
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(arr));
		
		System.out.println(al);

	}

}
