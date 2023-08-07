package com.demo.static_demo;

public class Static_demo {
	public Static_demo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void Display_Static() {
		System.out.println("Definition and Usage\r\n"
				+ "The static keyword is a non-access modifier used for methods and attributes. Static methods/attributes can be accessed without creating an object of a class.");
		System.out.println("Example\r\n"
				+ "A static method can be accessed without creating an object of the class first:"
				+"public class FrogCount {\r\n"
				+ "	 public static void main(String[]args){\r\n"
				+ "		 frog f1= new frog();\r\n"
				+ "		 frog f2= new frog();\r\n"
				+ "		 frog f3= new frog();\r\n"
				+ "		 System.out.println(f1.frog_count());\r\n"
				+ "		 System.out.println(frog.frog_count());\r\n"
				+ "		// System.out.println(frog.count);\r\n"
				+ "\r\n"
				+ "	 }\r\n"
				+ "}\r\n"
				+ "class frog{\r\n"
				+ "	private static int count=0;\r\n"
				+ "	frog(){\r\n"
				+ "		++count;\r\n"
				+ "	}\r\n"
				+ "	static int frog_count() {\r\n"
				+ "		return count; \r\n"
				+ "	\r\n"
				+ "}\r\n"
				+ "}");
	}
}
