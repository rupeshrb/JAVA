package com.core.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx= new ClassPathXmlApplicationContext("appicationContext.xml");

//		Customer cust=ctx.getBean("cust",Customer.class);
//		System.out.println(cust);
			
		Person p = ctx.getBean("per1",Person.class);
		System.out.println(p);
		
	}

}
