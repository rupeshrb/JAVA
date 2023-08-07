
package com.exception;


	public class DemoChk_Exception{
		public static void main(String[]args){
        // TODO Auto-generated method stub
	License li= new License(101,16);
	try {
		li.applyForLicense(16);
	} catch (AgeException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("Sorry , you are not eligiable , u can try after  "+(18-e.getAge())+"yrs");
	}
		}
	}
class AgeException extends Exception{
    int age;
    public AgeException(int age){
        super();
        this.age = age;
    }
    int getAge(){
        return age;
    }
}
class License{
    // properties
    int userId;
    public License(int userId,int age){
        super();
        this.userId= userId;
        this.age=age;
   }
    public License(){
        super();
        // TODO Auto-generated
   }
    int age;
    void applyForLicense(int age) 
    		throws AgeException{
    	if(age<18) {
    		int temp;
    		AgeException ae=new AgeException(age);
    		throw ae;
    	}
    	else
    		System.out.println("eligible");
    }
    }
