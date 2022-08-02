package enum_examplesssss;

public class BookMyShow_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookMyShow b1=BookMyShow.PLATINUM;
		b1.message();
		b1.description();
		
		BookMyShow b2=BookMyShow.GOLD;
		b2.message();
		b2.description();
		
		BookMyShow b3=BookMyShow.SILVER;
		b3.message();
		b3.description();
		
		System.out.println(BookMyShow.SILVER);
		System.out.println(BookMyShow.GOLD);
		System.out.println(BookMyShow.PLATINUM);
		

	}

}
