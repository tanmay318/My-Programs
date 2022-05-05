package com.HibernateINbuiltFunc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SAVERECORD {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(Details.class);
	SessionFactory factory =cfg.buildSessionFactory();
	Session session = factory.openSession();
	Transaction tt = session.beginTransaction();
	Details dt = new Details(6,"PAT",106);
	session.save(dt);
	tt.commit();
	session.close();
	System.out.println("Data Stored Successfully");
}
}