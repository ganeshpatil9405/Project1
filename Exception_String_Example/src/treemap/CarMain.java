package treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, Car> tm=new TreeMap<>();
		
		tm.put(101,new Car("Creta","Hyndai",1400000,2021));
		tm.put(201,new Car("Innova","Toyota",300000,2022));
		tm.put(108,new Car("Indica","Tata",600000,2015));
		tm.put(111,new Car("Altroz","Tata",900000,2019));
		tm.put(501,new Car("Venue","Hyundai",1200000,2020));
		tm.put(105,new Car("Nexon","Tata",1100000,2019));
		tm.put(251,new Car("Fortuner","Toyota",4000000,2018));
		tm.put(142,new Car("Scorpio","Mahindra",1800000,2022));
		tm.put(449,new Car("XUV700","Mahindra",2200000,2021));
		tm.put(559,new Car("WRv","Honda",1200000,2018));
		
		System.out.println(tm);
		
		for(Integer i:tm.keySet())
		{
			System.out.println(i);
		}
		for(Car c:tm.values())
		{
			System.out.println(c);
		}
		for(Map.Entry<Integer,Car> entry: tm.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.out.println();
		System.out.println("-----Iterator-----");
		
		Iterator itr=tm.entrySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
	}

}
