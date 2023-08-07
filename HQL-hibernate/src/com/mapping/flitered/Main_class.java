package com.mapping.flitered;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction; 
import org.hibernate.cfg.Configuration;import org.hibernate.query.Query;

public class Main_class {

	public static void main(String[] args){
		// TODO Auto-generated constructor stub
		
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();//session is to connection
		Transaction tx=s.beginTransaction();
		Disk d=new Disk();
		d.setDskName("RamSetu");
		d.setDskPrice(200);
		
		AudioDisk ad=new AudioDisk();
		ad.setDskName("eternals");
		ad.setDskPrice(500);
		ad.setNumSongs(10);
		ad.setSingerName("RBgroup");
		//for video disk
		
		VideoDisk vd= new VideoDisk();
		vd.setDskName("End Game");
		vd.setDirector("Rupesh");
		vd.setDskPrice(400);
		vd.setFormat("mvc");
		
		s.save(d);
		s.save(ad);
		s.save(vd);
		tx.commit();
		Query q=s.createQuery("from Disk");
		System.out.println(q.list());
		System.out.println("Sucessfull save data");
	}

}
