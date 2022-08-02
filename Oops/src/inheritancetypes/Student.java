package inheritancetypes;

public class Student implements Addmition,College {

	public void idCard() {
		System.out.println("ID card are taken From College");
	}

	public void uniform() {
		System.out.println("College has uniform");
	}

	public void markSheetSSC() {
		System.out.println("SSC mark sheet: Yes");
	}

	public void markSheetHSC() {
		System.out.println("HSC marksheet: Yes");
	}

	public void nationality() {
		System.out.println("Nationality : Yes");
	}

	public void leavingCertificate() {
		System.out.println("LeavingCertificate: Yes");
	}

	public void adharCard() {
		System.out.println("AdharCard: Yes");
	}

	@Override
	public void unifrom() {
		// TODO Auto-generated method stub
		System.out.println("Uniform Collected");
		
	}

	@Override
	public void marksheetHSC() {
		// TODO Auto-generated method stub
		
	}
	public void transport()
	{
		System.out.println("Not needed");
	}
	
}


