package treemap;

import java.util.ArrayList;
import java.util.HashMap;

public class Item_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Item> al=new ArrayList<>();
		
		al.add(new Item(101,"Buiscuit","Britannia",20));
		al.add(new Item(205,"Cake","Monginis",250));
		al.add(new Item(407,"Maggie","Nestle",12));
		al.add(new Item(108,"Chocolate","Melody",100));
		al.add(new Item(103,"Pizaa","Dominos",300));
		
		System.out.println(al);
		
		HashMap<String, Integer> hm=new HashMap<>();
		for(Item i:al)
		{
			if(hm.containsKey(i.company))
			{
				int v=hm.get(i.company)+1;
				hm.put(i.company, 1);
			}
			else
			{
				hm.put(i.company, 1);
			}
		}
		System.out.println(hm);
		

	}

}
