package assignment_set_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> hm=new HashMap<>();
		
		hm.put("2544646461", "BJP");
		hm.put("6556464663","NCP");
		hm.put("5465468535", "Congress");
		hm.put("4867644543", "Shivsena");
		hm.put("4687764645", "NCP");
		hm.put("54848446464", "Congress");
		
		System.out.println(hm);
		
		HashMap<String, Integer> h=new HashMap<>();
		
		for(Entry<String, String> e: hm.entrySet())
		{
			String s=e.getValue();
			if(h.containsKey(s))
			{
				int v=h.get(s)+1;
				h.put(s, v);
			}
			else
			{
				h.put(s, 1);
				
			}
		}
		System.out.println(h);

	}

}
