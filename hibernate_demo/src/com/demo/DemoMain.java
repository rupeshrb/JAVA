package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoMain {

	public static void main(String[] args) {
		Configuration c=new Configuration();
		c.configure();
		SessionFactory sf=c.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Student_data sd=new Student_data();
		sd.setStudName("java");
		s.save(sd);
		tx.commit();
		System.out.println("Success");
	}
}
