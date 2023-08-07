package com.overload_overrid;

public class Overload_Overrid {
	
	public Overload_Overrid() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void Display_overload_overrid() {
		System.out.println("Method Overriding in Java\r\n"
				+ "Understanding the problem without method overriding\r\n"
				+ "Can we override the static method\r\n"
				+ "Method overloading vs. method overriding\r\n"
				+ "If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.\r\n"
				+ "\r\n"
				+ "In other words, If a subclass provides the specific implementation of the method that has been declared by one of its parent class, it is known as method overriding.\r\n"
				+ "\r\n"
				+ "Usage of Java Method Overriding\r\n"
				+ "Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.\r\n"
				+ "Method overriding is used for runtime polymorphism\r\n"
				+ "Rules for Java Method Overriding\r\n"
				+ "The method must have the same name as in the parent class\r\n"
				+ "The method must have the same parameter as in the parent class.\r\n"
				+ "There must be an IS-A relationship (inheritance).");
		System.out.println("//Java Program to illustrate the use of Java Method Overriding  \r\n"
				+ "//Creating a parent class.  \r\n"
				+ "class Vehicle{  \r\n"
				+ "  //defining a method  \r\n"
				+ "  void run(){System.out.println(\"Vehicle is running\");}  \r\n"
				+ "}  \r\n"
				+ "//Creating a child class  \r\n"
				+ "class Bike2 extends Vehicle{  \r\n"
				+ "  //defining the same method as in the parent class  \r\n"
				+ "  void run(){System.out.println(\"Bike is running safely\");}  \r\n"
				+ "  \r\n"
				+ "  public static void main(String args[]){  \r\n"
				+ "  Bike2 obj = new Bike2();//creating object  \r\n"
				+ "  obj.run();//calling method  \r\n"
				+ "  }  \r\n"
				+ "} ");
		System.out.println("Method Overloading in Java\r\n"
				+ "Different ways to overload the method\r\n"
				+ "By changing the no. of arguments\r\n"
				+ "By changing the datatype\r\n"
				+ "Why method overloading is not possible by changing the return type\r\n"
				+ "Can we overload the main method\r\n"
				+ "method overloading with Type Promotion\r\n"
				+ "If a class\r\n"
				+ "has multiple methods having same name but different in parameters, it is known as Method Overloading.\r\n"
				+ "\r\n"
				+ "If we have to perform only one operation, having same name of the methods increases the readability of the program\r\n"
				+ ".\r\n"
				+ "\r\n"
				+ "Suppose you have to perform addition of the given numbers but there can be any number of arguments, if you write the method such as a(int,int) for two parameters, and b(int,int,int) for three parameters then it may be difficult for you as well as other programmers to understand the behavior of the method because its name differs.");
		System.out.println("Advantage of method overloading\r\n"
				+ "Method overloading increases the readability of the program.\r\n"
				+ "\r\n"
				+ "Different ways to overload the method\r\n"
				+ "There are two ways to overload the method in java\r\n"
				+ "\r\n"
				+ "By changing number of arguments\r\n"
				+ "By changing the data type");
		System.out.println("1) Method Overloading: changing no. of arguments\r\n"
				+ "In this example, we have created two methods, first add() method performs addition of two numbers and second add method performs addition of three numbers.\r\n"
				+ "\r\n"
				+ "In this example, we are creating static methods\r\n"
				+ "so that we don't need to create instance for calling methods.\r\n"
				+ "\r\n"
				+ "class Adder{  \r\n"
				+ "static int add(int a,int b){return a+b;}  \r\n"
				+ "static int add(int a,int b,int c){return a+b+c;}  \r\n"
				+ "}  \r\n"
				+ "class TestOverloading1{  \r\n"
				+ "public static void main(String[] args){  \r\n"
				+ "System.out.println(Adder.add(11,11));  \r\n"
				+ "System.out.println(Adder.add(11,11,11));  \r\n"
				+ "}}  ");
		System.out.println("2) Method Overloading: changing data type of arguments\r\n"
				+ "In this example, we have created two methods that differs in data type\r\n"
				+ ". The first add method receives two integer arguments and second add method receives two double arguments.\r\n"
				+ "\r\n"
				+ "class Adder{  \r\n"
				+ "static int add(int a, int b){return a+b;}  \r\n"
				+ "static double add(double a, double b){return a+b;}  \r\n"
				+ "}  \r\n"
				+ "class TestOverloading2{  \r\n"
				+ "public static void main(String[] args){  \r\n"
				+ "System.out.println(Adder.add(11,11));  \r\n"
				+ "System.out.println(Adder.add(12.3,12.6));  \r\n"
				+ "}} ");
	}
}
