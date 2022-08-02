package assignment_set_map;

import java.util.LinkedList;

public class LinkedListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> list1=new LinkedList<>();
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(60);
		
		
		LinkedList<Integer> list2=new LinkedList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		LinkedList<Integer> list3=new LinkedList<>();
		for(int i=0;i<list1.size();i++)
		{
			list3.add(list1.get(i));
			if(i<list2.size())
			{
				list3.add(list2.get(i));
			}
		}
		System.out.println(list3);

	}

}
