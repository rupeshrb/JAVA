package com.core.external;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo_main {
public static void main (String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("appicationContext.xml");
	Payment p=ctx.getBean("pay",Payment.class);
	p.payment("9923399RRB", 10000);
}
}
