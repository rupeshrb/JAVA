	
public class W_H { // class created
	float height;// create variable
	int weight;

	W_H(){
		//create default constructor 
	}
	W_H(int h,int w){  // create overloaded constructor
		height=h; // Assign arguments to variables
		weight=w;
	}
	void result() {
		float bmi,meter; // declare local variable
	
		System.out.println("\t******Personal Details******");
		System.out.println("height in feet  ="+ height);
		System.out.println("weight in kilograms  ="+ weight);
	
		meter=height*0.3048f;  // covert feet in meter
		bmi=(weight/(meter*meter));  // calculate BMI
		System.out.println("\nBMI ="+bmi);
	
		if(bmi>=18.5) { // condition check
		System.out.println("\nUnderweight"); // condition returns 
		}
		else if(bmi>=24.9) { // condition check
			System.out.println("\nNormal weight");
		}
		else if(bmi>=29.9) { // condition check
			System.out.println("\nOverweight");
		}
		else if(bmi>=30) { // condition check
			System.out.println("\nObesity");
		}
		else { // condition check
			System.out.println("\nYour Weight is less");
		}
}}
