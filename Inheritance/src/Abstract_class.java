	
public abstract class Abstract_class {

	// common properties
	    int empId;
	    public Abstract_class(){
	
	        super();
	        // TODO Auto-generated constructor stub
	    }
	    public Abstract_class(int empId,String empName){
	      
	        this.empId =empId;
	        this.empName= empName;
	    }
	    String empName;
	    void dispData(){
	        System.out.println("emp data is"+empId+""+empName);
	   }
	    abstract int calcSalary();
}
abstract class Regemp extends Abstract_class{
int bSal;

	public Regemp(int id ,String name,int bSal) {
	super(id,name);
	this.bSal = bSal;
}

//	@Override
//	int calcSalary() {
//		// TODO Auto-generated method stub
//	//	return 0;
//		float hra = 0.01f*bSal;
//		//calc many financial components
//		return bSal+(int)hra;
//	}
	void test() {
		System.out.println("hi");
	}
	
}
class CtrEmp extends Abstract_class{

	@Override
	int calcSalary() {
		// TODO Auto-generated method stub
		return 10000;
	}
	
}