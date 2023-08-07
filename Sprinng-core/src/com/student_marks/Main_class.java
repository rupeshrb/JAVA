package com.student_marks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.core.HelloWorld;

public class Main_class {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Start the spring container method stub
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("appicationContext.xml");
	Stud_data sd=ctx.getBean("data",Stud_data.class);
	Calculate cl=ctx.getBean("calcu",Calculate.class);
	System.out.println(cl);
	System.out.println(cl.get_total());
	}
}
