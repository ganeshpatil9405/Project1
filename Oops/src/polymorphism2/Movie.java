package polymorphism2;

import java.util.Arrays;

public class Movie {
	
	int id,boxofficecollection;
	String name;
	Actor act[];
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBoxofficecollection() {
		return boxofficecollection;
	}
	public void setBoxofficecollection(int boxofficecollection) {
		this.boxofficecollection = boxofficecollection;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Actor[] getAct() {
		return act;
	}
	public void setAct(Actor[] act) {
		this.act = act;
	}
	
	public String toString()
	{
		return id+" "+name+" "+boxofficecollection+" "+Arrays.toString(act);
	}

}
