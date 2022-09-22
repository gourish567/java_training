package pack1;

import java.util.Scanner;

class login
{
	void log()
	{
		
		System.out.println("login successful");
	}
}
class addben extends login
{
	
	void addb()
	{
		
		System.out.println("beneficiary added");
	}
	
}

public class  Transfer_funds extends addben {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transfer_funds tf=new Transfer_funds();
		tf.log();
		tf.addb();
		tf.display();
	}
	void display()
	{
		System.out.println("Transaction is successful");
	}
	
}
