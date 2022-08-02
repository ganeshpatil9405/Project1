package abstraction2;

public class Bike_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Activa a=new Activa();
		
		a.setData(125000, "Black", "Honda");
		System.out.println(a);
		System.out.println("Unicorn");
		a.setData1(101 , 1, "125 cc");
		a.display();
		a.wheelno();
		a.mirror();
		a.gears();
		a.features();
		a.seatNo();
		a.discount();
		
		
		System.out.println("Activa ");
		a.setData2(1012 , 2, "110 cc");
		a.display();
		a.wheelno();
		a.mirror();
		a.gears();
		a.display();
		
		

	}

}
