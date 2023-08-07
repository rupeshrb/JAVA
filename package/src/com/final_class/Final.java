package com.final_class;

public class Final {
	
	public Final() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void Display_Final() {
		System.out.println("Definition and Usage\r\n"
				+ "The final keyword is a non-access modifier used for classes, attributes and methods, which makes them non-changeable (impossible to inherit or override).\r\n"
				+ "\r\n"
				+ "The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...).\r\n"
				+ "\r\n"
				+ "The final keyword is called a \"modifier\". You will learn more about these in the Java Modifiers Chapter.");
		System.out.println("Example\r\n"
				+ "Set a variable to final, to prevent it from being overridden/modified:\r\n"
				+ "\r\n"
				+ "public class Main {\r\n"
				+ "  final int x = 10;\r\n"
				+ "\r\n"
				+ "  public static void main(String[] args) {\r\n"
				+ "    Main myObj = new Main();\r\n"
				+ "    myObj.x = 25; // will generate an error: cannot assign a value to a final variable\r\n"
				+ "    System.out.println(myObj.x);\r\n"
				+ "  }\r\n"
				+ "}");
	}
}
