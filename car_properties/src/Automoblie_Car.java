public class Automoblie_Car {
	// properties
    String carBrand;
    float mileage;
    int carPrice;

    // default constructor
Automoblie_Car(){
   }
    // overloaded constructor
Automoblie_Car(String brand,float mile,int price){
        // used to inject values into the properties at run time
        carBrand = brand;
        mileage=mile;
        carPrice=  price;
   }
    // methods to play with the data
    void showData(){
        System.out.println("car details are"+carBrand+"\t"+carPrice+"\t"+mileage);
   }
}
