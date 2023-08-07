package com.composition.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Main_class {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();//session is to connection
		Transaction tx=s.beginTransaction();
		Person p1=new Person();
		Date d=new Date();
		d.setDay(03);
		d.setYear(1998);
		d.setMonth("aug");
		p1.setName("sahil");
		p1.setbDate(d);
		s.save(p1);
		
		tx.commit();
		Query q=s.createQuery("from Person");
		System.out.println(q.list());
	}

}
