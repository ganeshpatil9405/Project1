package hashmapinjava;

import java.util.HashMap;
import java.util.LinkedList;

public class IntegerOfLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> l1=new LinkedList<>();
		l1.add(1);
		l1.add(4);
		l1.add(2);
		l1.add(1);
		l1.add(3);
		l1.add(1);
		l1.add(4);
		System.out.println(l1);
		
		LinkedList<String> l2=new LinkedList<>();
		HashMap<String,Integer> hm=new HashMap<>();
		
		for(int i=0;i<l1.size();i++)
		{
			switch(l1.get(i))
			{
			case 1: l2.add("one");
			break;
			case 2: l2.add("two");
			break;
			case 3: l2.add("Three");
			break;
			case 4: l2.add("Four");
			break;
			}
		}
		for(String s:l2)
		{
			if(hm.containsKey(s))
			{
				int v=hm.get(s)+1;
				hm.put(s, v);
			}
			else
			{
				hm.put(s, 1);
			}
			System.out.println(hm);
		}
	}

}
