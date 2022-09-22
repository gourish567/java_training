package javaprogram;

import java.util.Scanner;

public class BigNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a,b,c;
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a>b && a>c)
			System.out.print(a+" is a big number");
		else if(b>c && b>a)
			System.out.print(b+" is a big number");
		else
			System.out.print(c+" is a big number");

	}

}
