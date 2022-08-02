package inheritancetypes;

class Apple
{
	void eat()
	{
		System.out.println("Apple eat Every Day Keep Doctor away");
	}
}
class Strawberry extends Apple
{
	void eat()
	{
		System.out.println("Starwberry is sweet");
	}
}
class Fruit extends Strawberry
{
	void eat()
	{
		System.out.println("FRuits are good for helath");
	}
}


public class Fruit_Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strawberry s1=new Strawberry();
		s1.eat();
		
		s1=new Fruit();
		s1.eat();
		
		Apple a1=new Apple();
		a1.eat();
		
		a1=new Strawberry();
		a1.eat();
		
	
		

	}

}
