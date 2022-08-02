package abstractioninjava;

public class CarInnova_Main {
	public static void main(String[] args) {
		
		InnovaCrysta i1=new InnovaCrysta();
		i1.setData(2200000, "Toyota");
		System.out.println(i1);
		i1.wheelno();
		i1.gears();
		i1.dashBoard();
		i1.engine();
		i1.noOfSeats();
		i1.wheelType();
		
		System.out.println();
		
		/*Fortuner f1=new Fortuner();
		f1.setData(3000000, "Toyota");
		System.out.println(f1);
		f1.dashBoard();
		f1.engine();
		f1.noOfSeats();*/
	}
	
}


