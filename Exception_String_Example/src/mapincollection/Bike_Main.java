package mapincollection;


import java.util.HashMap;

public class Bike_Main {
	public static void main(String[] args) {
		
		HashMap<Bike,Integer> h=new HashMap<>();
		h.put(new Bike(101,"Splendor","Black"),90000);
		h.put(new Bike(102,"Pulsor","Red"),125000);
		h.put(new Bike(103,"Apache","Black+Grey"),131000);
		h.put(new Bike(201,"RX 100","Yellow + Grey"),90000);
		
		System.out.println(h);
		
		
	}

}
