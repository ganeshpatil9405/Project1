package polymorphism2;

public class Actor {
	int aid,birthyear;
	String aname,add;
	public int getId() {
		return aid;
	}
	public void setId(int aid) {
		this.aid = aid;
	}
	public int getBirthyear() {
		return birthyear;
	}
	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}
	public String getName() {
		return aname;
	}
	public void setName(String aname) {
		this.aname = aname;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	public String toString()
	{
		return aid+" "+aname+" "+birthyear+" "+add;
	}

}
