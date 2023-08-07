package com.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Start the spring container method stub
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("appicationContext.xml");
	//the above line code will create a container and also a bean
		//inside the container
		// retrive the bean from the container
		HelloWorld h = ctx.getBean("hello",HelloWorld.class);
		//System.out.println(h.sayHello("spring"));
		System.out.println(h);
	}

}
