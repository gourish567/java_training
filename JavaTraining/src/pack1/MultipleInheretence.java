package pack1;
interface interface1
{
	void method();
}
interface interface2
{
	void method1();
}
public class MultipleInheretence implements interface1,interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheretence obj=new MultipleInheretence();
		obj.method();
		obj.method1();
	}
	public void method1()
	{
		System.out.println("Interface method 1");
	}
	public void method()
	{
		System.out.println("Interface method 2");
	}
}
