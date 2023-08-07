package com.classproperties;

public class Class {
	
	public Class() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void Display_Class_Properties() {
		System.out.println("Java Classes/Objects\r\n"
				+ "Java is an object-oriented programming language.\r\n"
				+ "\r\n"
				+ "Everything in Java is associated with classes and objects, along with its attributes and methods. For example: in real life, a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.\r\n"
				+ "\r\n"
				+ "A Class is like an object constructor, or a \"blueprint\" for creating objects.");
		System.out.println("Create a Class\r\n"
				+ "To create a class, use the keyword class:\r\n"
				+ "\r\n"
				+ "Main.java\r\n"
				+ "Create a class named \"Main\" with a variable x:\r\n"
				+ "\r\n"
				+ "public class Main {\r\n"
				+ "  int x = 5;\r\n"
				+ "}");
		System.out.println("Create an Object\r\n"
				+ "In Java, an object is created from a class. We have already created the class named Main, so now we can use this to create objects.\r\n"
				+ "\r\n"
				+ "To create an object of Main, specify the class name, followed by the object name, and use the keyword new:\r\n"
				+ "\r\n"
				+ "Example\r\n"
				+ "Create an object called \"myObj\" and print the value of x:\r\n"
				+ "\r\n"
				+ "public class Main {\r\n"
				+ "  int x = 5;\r\n"
				+ "\r\n"
				+ "  public static void main(String[] args) {\r\n"
				+ "    Main myObj = new Main();\r\n"
				+ "    System.out.println(myObj.x);\r\n"
				+ "  }\r\n"
				+ "}");
	}
}
