package inheritancepolymorphism;

public class drivercarmain {
	
	public static void main(String[] args) {
		
		//Agregation
		//driver d1=new driver(102,"Ramesh","90876556");
		//driver d2=new driver(103,"raj","098767665");
		//car c1=new car(1,"Hyundai","Creta");
		//car c2=new car(2,"Suzuki","Swift");
		
		
		//composition
		car c1=new car(1,"Hyundai","Creta",102,"Ramesh","90876556");
		car c2=new car(2,"Suzuki","Swift",103,"raj","098767665");
		
		System.out.println(c1);
		System.out.println(c2);
		
	}

}
