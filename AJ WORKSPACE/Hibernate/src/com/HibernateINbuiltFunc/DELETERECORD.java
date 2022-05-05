package com.HibernateINbuiltFunc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DELETERECORD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Details.class);
		SessionFactory factory =cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tt = session.beginTransaction();
		Details dt = session.load(Details.class, 4);
		session.delete(dt);
		tt.commit();
		System.out.println("DATA DELETED SUCCESSFULLY");
	}

}
