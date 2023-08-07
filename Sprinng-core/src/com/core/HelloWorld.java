package com.core;

public class HelloWorld {
private String message;
private Integer age;

	@Override
public String toString() {
	return "HelloWorld [message=" + message + ", age=" + age + "]";
}

	public HelloWorld() {
	super();
	// TODO Auto-generated constructor stub
}

public void setMessage(String message) {
	this.message = message;
}



public void setAge(Integer age) {
	this.age = age;
}

	public String sayHello(String message) {
		// TODO Auto-generated constructor stub
	return message;
	}

}
