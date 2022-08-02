package collectioninjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayListDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(10,20,30,40,10,20,10));
		
		System.out.println("ArrayList With duplicate"+al);
		Set<Integer> s=new LinkedHashSet<>();
		s.addAll(al);
		al.clear();
		al.addAll(s);
		System.out.println("Arrays without duplicate"+al);
		
		

	}

}
