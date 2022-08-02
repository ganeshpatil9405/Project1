package inheritancetypes;

public interface College {

	 void idCard();
	   void unifrom();
	   void transport();
	   
	   default void library()
	   {
		   System.out.println("Membership is compulsory");
	   }
	   
	   static void labrotary()
	   {
		   System.out.println("Laborotory is compulsory");
	   }
	}


