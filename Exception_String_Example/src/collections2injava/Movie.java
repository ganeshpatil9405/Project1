package collections2injava;

public class Movie implements Comparable<Movie>{
	
	int mid,rating,collection;
	String mname;
	
	Movie(int mid,String mname,int rating,int collection)
	{
		this.mid=mid;
		this.mname=mname;
		this.rating=rating;
		this.collection=collection;
	}
	public String toString()
	{
		return mid+" "+mname+" "+rating+" "+collection;
	}
	
	@Override
	public int compareTo(Movie e) {
		// TODO Auto-generated method stub
		if(this.rating>e.rating)
			return 1;
		else if(this.rating<e.rating)
			return -1;
		else
			if(this.mid>e.mid)
				return 1;
			else if(this.mid<e.mid)
				return -1;
		return this.mname.compareTo(e.mname);
	}

}
