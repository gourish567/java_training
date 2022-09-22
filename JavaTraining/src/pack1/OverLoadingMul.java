package pack1;

public class OverLoadingMul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverLoadingMul s=new OverLoadingMul();
		s.mul(3, 6);
		s.mul(2.3f, 6.6f);
		s.mul(8,6,4);

	}
	void mul(int x,int y)
	{
		System.out.println("Multlipication of "+x+" and "+y+" is :"+(x*y));
	}
	void mul(float x,float y)
	{
		System.out.println("Multlipication of "+x+" and "+y+" is :"+(x*y));
	}
	void mul(int x,int y,int z)
	{
		System.out.println("Multlipication of "+x+","+y+" and "+z+" is :"+(x*y*z));
	}

}
