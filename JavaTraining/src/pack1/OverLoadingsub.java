package pack1;

public class OverLoadingsub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverLoadingsub s=new OverLoadingsub();
		s.sub(20, 6);
		s.sub(28.3f, 6.6f);
		s.sub(28,6);

	}
	void sub(int x,int y)
	{
		System.out.println("Difference of "+x+" and "+y+" is :"+(x-y));
	}
	void sub(float x,float y)
	{
		System.out.println("Difference of "+x+" and "+y+" is :"+(x-y));
	}
	void sub(int x,float y)
	{
		System.out.println("Difference of "+x+"and "+y+" is :"+(x-y));
	}

}
