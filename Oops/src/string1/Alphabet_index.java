package string1;

public class Alphabet_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="the quick brown for jumps over the lazy dog";
		
		char ch[]=s1.toCharArray();
		
			for(char c='a';c<='z';c++)
			{
				for(int i=0;i<s1.length();i++)
				{
					if(c==ch[i])
					{
						System.out.println(c+" "+i);
					}
				}
			}

	}

}
