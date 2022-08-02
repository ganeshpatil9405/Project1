package collectioninjava;

public class Stud {
	int id,marks;
	String name;
	
	Stud(int id,int marks,String name)
	{
		this.id=id;
		this.marks=marks;
		this.name=name;
		
	}

	@Override
	public String toString() {
		return  id +" "+ marks +" "+ name+" ";
	}
	

}
