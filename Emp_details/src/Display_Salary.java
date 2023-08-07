public class Display_Salary {

	public static void main(String args[]) {
	
	Salary sal;  // reference variable
	sal=new Salary();	// creating an object
	
	sal.emp_id=101;// injecting values into the object
	sal.emp_name="Rupesh Ranjeet Borse";// injecting values into the object
	sal.emp_salary=10000;// injecting values into the object
	
	sal.display();// display employee details
}
}
