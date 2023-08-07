// not an efficient style of prog
public class Demo_Inheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract_class reg;
		//Regemp emp=new Regemp(1,"java",20000);
		CtrEmp ctr=new CtrEmp();
		// dynamic method dispatch
		// reg sal calc
	//	reg=emp;
		reg=ctr;
		reg.dispData();
		System.out.println(reg.calcSalary());
		
		// not recommended
		//emp.test();
	}

}
