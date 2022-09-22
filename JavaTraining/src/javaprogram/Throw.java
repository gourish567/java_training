package javaprogram;

public class Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=17;
		if(age<18)
		{
			throw new ArithmeticException("Not valid for voting");
		}
		else
		{
			System.out.print("Valid for voting");
		}
	}

}
