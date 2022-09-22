package pack1;

public class SingleDiamensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,4,6};
		int[] b= {5,6,3,3};
		int c[]=new int[4];
		for(int i=0;i<a.length;i++)
		{
				c[i]=a[i]+b[i];
				System.out.print(c[i]+" ");
		}

	}

}
