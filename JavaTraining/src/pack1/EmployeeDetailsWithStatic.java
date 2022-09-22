package pack1;

public class EmployeeDetailsWithStatic {

	String emp_name,emp_desig;
	int emp_id,emp_sal;
	static String company_name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetailsWithStatic e1=new EmployeeDetailsWithStatic();
		e1.init(1, "XYZ", "HR", 50000);
		staticdata();
		e1.display();
		e1.init(1, "PQR", "Devloper", 500000);
		e1.display();

	}
	void init(int id,String name, String desig,int s)
	{
		this.emp_id=id;
		this.emp_name=name;
		this.emp_desig=desig;
		this.emp_sal=s;
	}
	void display()
	{
		System.out.println("Employee ID : "+emp_id);
		System.out.println("Employee Name : "+emp_name);
		System.out.println("Employee Designation : "+emp_desig);
		System.out.println("Employee Salary : "+emp_sal);
		System.out.println("Company name is  : "+company_name);
		System.out.println();
	}
	static void staticdata()
	{
		company_name="evry";
	}
	static {
		System.out.println("Static block");
	}
}
