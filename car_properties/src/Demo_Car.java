
public class Demo_Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// reference variable

		Automoblie_Car car;
	 
		// creating an object
		car=new Automoblie_Car();
		car.showData();
		// injecting values into the object
		car.carBrand="tata";
		car.carPrice=11;
		car.mileage=20.7f;
		// invoking the method
		car.showData();
	}

}
