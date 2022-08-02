package assignment_set_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import treemap.Item;

public class Item1_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Item1> al=new ArrayList<>();
		
		al.add(new Item1(101,"ParleG",30,3));
		al.add(new Item1(201,"Good Day",40,2));
		al.add(new Item1(101,"ParleG",30,2));
		al.add(new Item1(201,"Good Day",40,15));
		
		System.out.println(al);
		
		HashMap<String, Integer> m=new HashMap<>();
		
		for(Item1 i:al)
		{
			if(m.containsKey(i.name))
			{
				int v=m.get(i.name)+i.qty;
				m.put(i.name, v);
			}
			else
			{
				m.put(i.name, i.qty);
			}
		}
		System.out.println(m);

		
		

	}

}
