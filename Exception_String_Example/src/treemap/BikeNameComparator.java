package treemap;

import java.util.Comparator;

public class BikeNameComparator implements Comparator<Bike> {

	@Override
	public int compare(Bike b1, Bike b2) {
		// TODO Auto-generated method stub
		return b1.id-b2.id;
	}

}
