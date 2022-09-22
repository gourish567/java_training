package pack1;

import java.util.Scanner;

public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a,b,c;
		a=s.nextInt();
		b=s.nextInt();
		Functions obj=new Functions();
		int res=obj.add(a,b);
		System.out.println("Sum is :"+res);
		res=obj.sub(a,b);
		System.out.println("Difference is :"+res);
		obj.mul(a,b);
		obj.div(a,b);
	}
	int add(int x,int y)
	{
		return x+y;
	}
	int sub(int x,int y)
	{
		return x-y;
	}
	void mul(int x,int y)
	{
		System.out.println("Multiplication of two number is :"+x*y);
	}
	void div(int x,int y)
	{
		if(y<1)
			System.out.println("Division is not possible");
		else
			System.out.println("Division of two number is :"+x/y);
	}

}
