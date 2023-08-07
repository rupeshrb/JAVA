package com.login;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo_main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx= new ClassPathXmlApplicationContext("appicationContext.xml");

	
		Login log = ctx.getBean("login",Login.class);
		System.out.println(log);
		
	}
}
