package arraylist_assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class List_IteratorReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> al=new LinkedList<>();
		
		al.add("Fri");
		al.add("Thur");
		al.add("Wed");
		al.add("Tue");
		al.add("Mon");
		
		System.out.println("Original Array :"+al);
		
		Iterator l=al.descendingIterator();
		System.out.println("Elements in Reverse Order : ");
		while(l.hasNext())
		{
			System.out.print(l.next()+" ");
		}
		

	}

}
