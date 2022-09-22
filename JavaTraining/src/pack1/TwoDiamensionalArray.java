package pack1;

public class TwoDiamensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{1,2},{4,6}};
		int[][] b= {{5,6},{3,3}};
		int c[][]=new int[4][4];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
