package pack1;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int i;
		if(a<4)
		{
			System.out.print(a+"is a prime number");
			System.exit(0);
		}
		for(i=2;i<Math.sqrt(a);i++)
		{
			if(a%i==0)
			{
				System.out.print("Not a prime number");
				System.exit(0);
			}
		}
		System.out.print(a+" is a prime number");

	}

}
