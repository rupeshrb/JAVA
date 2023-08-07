package com.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class DemoMain {
	public static void main(String[] args) {
		
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();//session is to connection
		Transaction tx=s.beginTransaction();

//		Query q1=s.createQuery("from Disc");
//		List<Disc> l=q1.list();
//		for (Disc d:l) {
//			System.out.println(d);
//		}
	//	Disc dc=new Disc();
	
//		Query q1=s.createQuery("select name,price from Disc");
//		List<Object[]> l=q1.list();
//		for (Object[] d:l) {
//			System.out.println(d[0]+"  "+d[1]);
//		}
	
//		Query q1=s.createQuery("from Disc where type='photo'");
//		System.out.println(q1.list());
	
//		Query q1=s.createQuery("select avg(price) from Disc");
//		System.out.println(q1.uniqueResult());

//		Query q1=s.createQuery("select avg(price) from Disc group by type");
//		System.out.println(q1.list());
		
		Query q1=s.createQuery("update Disc set price=price+100 where id=2");
		System.out.println(q1.executeUpdate());
		tx.commit();
		
	}
	
}
