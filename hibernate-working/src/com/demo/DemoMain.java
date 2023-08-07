package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoMain {

	public static void main(String[] args) {
	//	Configuration c=new Configuration();
		//c.configure();
		//SessionFactory sf=c.buildSessionFactory(); 
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();//session is to connection
		Transaction tx=s.beginTransaction();
		Student_data sd=new Student_data();
//		sd.setStudName("gopal");
//		s.save(sd);
//		tx.commit();
//		System.out.println("Success");
		sd=s.get(Student_data.class,4);
//		System.out.println(sd);
//		System.out.println(s.get(Student_data.class,23));
//		System.out.println("s.load"+s.load(Student_data.class, 10));
//		s.delete(sd);
		sd.setStudName("hiber");
		s.saveOrUpdate(sd);
		tx.commit();
	}
}
