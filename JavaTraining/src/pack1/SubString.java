package pack1;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcd";
		int i,j;
		for(i=0;i<s1.length()+1;i++)
		{
			for(j=i+1;j<s1.length()+1;j++)
			{
				System.out.println(s1.substring(i,j));
			}
		}
		

	}

}
