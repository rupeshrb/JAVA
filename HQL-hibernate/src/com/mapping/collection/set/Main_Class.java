package com.mapping.collection.set;

import java.util.HashSet;
import java.util.TreeSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Main_Class {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();//session is to connection
		Transaction tx=s.beginTransaction();
		Book b1=new Book();
		b1.setBk_tittle("java");
		b1.setBk_publisher("oracle");
		HashSet<String> hs= new HashSet<>();
		hs.add("rupesh");
		hs.add("gopal");
		hs.add("sahil");
		hs.add("pranav");
		b1.setAuthors(hs);
		
		
		Book b2=new Book();
		b2.setBk_tittle("spring");
		b2.setBk_publisher("springboot");
		
		TreeSet<String> ts =new TreeSet<>();
		ts.add("sahil");
		ts.add("sumit");
		ts.add("rb");
		ts.add("varun");
		b2.setAuthors(ts);
		s.save(b1);
		s.save(b2);
		tx.commit();
		
		Query<Book> q = s.createQuery("from Book");
		for(Book b:q.list()) {
		System.out.println(b);
		}
		
	}

}
