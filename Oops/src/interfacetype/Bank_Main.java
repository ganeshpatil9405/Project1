package interfacetype;

public class Bank_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b=new Sbi();
		Bank a=new Mahindra_Kotak();
		
		b.bankName();
		b.rateOfInterest();
		
		a.bankName();
		a.rateOfInterest();

	}

}
