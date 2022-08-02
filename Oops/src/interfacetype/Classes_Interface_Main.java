package interfacetype;

class A {
	public void display() {
		System.out.println("In parent Class Display");
	}
}

interface Abc {
	void show();

	void display();
}

public class Classes_Interface_Main extends A implements Abc {

	
	 public void display() 
	 { 
		 System.out.println("In child class display"); 
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classes_Interface_Main c = new Classes_Interface_Main();
		c.display();

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

}
