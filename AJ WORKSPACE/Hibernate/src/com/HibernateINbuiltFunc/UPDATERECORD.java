package com.HibernateINbuiltFunc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UPDATERECORD {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(Details.class);
	SessionFactory factory =cfg.buildSessionFactory();
	Session session = factory.openSession();
	Transaction tt = session.beginTransaction();
	Details dt = session.load(Details.class, 4);
	System.out.println(dt);
	dt.setName("VAP");
	session.update(dt);
	tt.commit();
}
}
