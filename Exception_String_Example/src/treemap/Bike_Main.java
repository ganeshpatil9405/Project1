package treemap;

import java.util.TreeMap;

public class Bike_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Bike,Integer> tm=new TreeMap<>(new BikeNameComparator());
		
		tm.put(new Bike(105,"Splendor","Hero"), 900000);
		tm.put(new Bike(201,"Pulsor","Bajaj"), 135000);
		tm.put(new Bike(205,"Apache","Tvs"), 140000);
		tm.put(new Bike(201,"Shine","Honda"),95000 );
		tm.put(new Bike(205,"MT15","Yamaha"), 145000);
		tm.put(new Bike(201,"rx100","suzuki"), 80000);
		
		System.out.println(tm);
		
		

	}

}
