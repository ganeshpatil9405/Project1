package string1;

public class Word_Count_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Java is a Programming Languages";
		String str[]=s1.split(" ");
		
		for(String s:str)
		{
			System.out.println(s);
		}
			System.out.println("Total no of words : "+str.length);
			
		char ch[]=s1.toCharArray();
		String s=" ";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='g')
			{
				ch[i]='G';
				
			}
			s=s+ch[i];
		}
		System.out.println(s);
	}

}
