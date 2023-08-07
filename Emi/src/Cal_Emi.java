public class Cal_Emi { // class created
	
	double principal, rate, time;// create variable
	
	Cal_Emi(){
		//create default constructor 
	}
	Cal_Emi(double principal,double rate,double time){
		// create overloaded constructor
		this.principal=principal;
		this.rate=rate;
		this.time=time;
	}
	double Emi_Cal() {
		double emi;
		rate=rate/(12*100); 
        time=time*12; 
        emi= (principal*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
        return emi;
	}
	void display() {
		double emi_print;
		System.out.println("\t******EMI CALCULATOR******");
		System.out.println("principal ="+principal );
		System.out.println("rate ="+rate );
		System.out.println("time ="+time );
		emi_print= Emi_Cal();
		System.out.println("\nMonthly EMI is == "+emi_print);
	}
}
