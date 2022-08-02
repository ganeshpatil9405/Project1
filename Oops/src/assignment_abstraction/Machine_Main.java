package assignment_abstraction;

public class Machine_Main {
	public static void main(String[] args) {
		
		Juicer j=new Juicer();
		j.crush();
		j.filter();
		j.rotate();
		
		
		Machine m=new Juicer();
		
		m.crush();
		m.rotate();
		//m.filter();
		
	}

}
