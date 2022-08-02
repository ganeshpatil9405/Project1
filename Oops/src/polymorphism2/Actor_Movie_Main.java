package polymorphism2;

import java.util.Arrays;
import java.util.Scanner;

public class Actor_Movie_Main {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Movie mov[]=new Movie[2];
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter movie ID, Theater Name, BoxOffice Colllection ");
			int id=sc.nextInt();
			String name=sc.next();
			int boxofficecollection=sc.nextInt();
			
			Actor act[]=new Actor[3];
			for(int j=0;j<3;j++)
			{
				System.out.println("Enter Actor Id,name, Birthyear, Adderess");
				int aid=sc.nextInt();
				String aname=sc.next();
				int birthyear=sc.nextInt();
				String add=sc.next();
				
				Actor a=new Actor();
				a.setId(aid);
				a.setName(aname);
				a.setBirthyear(birthyear);
				a.setAdd(add);
				
				act[j]=a;
			}
			Movie m=new Movie();
			m.setId(id);
			m.setName(name);
			m.setBoxofficecollection(boxofficecollection);
			m.setAct(act);
			
			mov[i]=m;
		}
		System.out.println(Arrays.toString(mov));
		for(Movie m:mov)
		{
			for(Actor a:m.act)
			{
				if(a.getName().equals("salman_khan ") && m.getBoxofficecollection()>5000000)
				{
					System.out.println(m.name+" "+a.aname+" "+m.boxofficecollection);
				}
			}
		}
		sc.close();
	}

}
