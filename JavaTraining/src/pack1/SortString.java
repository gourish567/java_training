package pack1;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="dcba";
		char a[]=s1.toCharArray();
		char temp;
		Arrays.sort(a);
		System.out.println(a);
		
		s1="dcba";
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
