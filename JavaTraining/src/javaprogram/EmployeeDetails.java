package javaprogram;

public class EmployeeDetails {
	String emp_name,emp_desig;
	int emp_id,emp_sal;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails e1=new EmployeeDetails();
		e1.init(1, "XYZ", "HR", 50000);
		e1.display();
		e1.init(1, "PQR", "Devloper", 500000);
		e1.display();

	}
	void init(int id,String name, String desig,int s)
	{
		emp_id=id;
		emp_name=name;
		emp_desig=desig;
		emp_sal=s;
	}
	void display()
	{
		System.out.println("Employee ID : "+emp_id);
		System.out.println("Employee Name : "+emp_name);
		System.out.println("Employee Designation : "+emp_desig);
		System.out.println("Employee Salary : "+emp_sal);
		System.out.println();
	}
}
