public class Salary { // class created

	String emp_name;  // create variable
	byte emp_id;
	int emp_salary;
	
	Salary(){	
	//create default constructor 
	}
	Salary(String name,byte id,int salary){ // create overloaded constructor
		
		emp_name=name; // Assign arguments to variables
		emp_id=id;
		emp_salary=salary;
	
	}
	void display() {
		int emp_pf,emp_hra,emp_ca,emp_netSalary; // declare local variable

		System.out.println("\t******Employee Details******");
		System.out.println("Employee name ="+ emp_name);
		System.out.println("Employee id ="+ emp_id);
		System.out.println("Employee salary ="+ emp_salary);
		System.out.println("\n# OverAll salary by add HRA,CA,PF #");
		System.out.println("HRA = 10%");
		System.out.println("CA = 20%");
		System.out.println("PF = 7%");
		
		emp_pf=7*(emp_salary/100); // calculate 15% of salary
		emp_ca=20*(emp_salary/100);//calculate 20% of salary
		emp_hra=10*(emp_salary/100);//calculate 10% of salary
		emp_netSalary=emp_salary+emp_ca+emp_hra+emp_pf; //calculate total salary
		
		System.out.println("\nPF of salary  ="+emp_pf);
		System.out.println("CA of Salary ="+emp_ca);
		System.out.println("HRA of Salary ="+emp_hra);
	  
		System.out.println("\nTotal Salary ="+emp_netSalary);
		//By minus PF salary 
		System.out.println("And by minus (PF) Salary get to Employee ="+(emp_netSalary-emp_pf));
	}
}
