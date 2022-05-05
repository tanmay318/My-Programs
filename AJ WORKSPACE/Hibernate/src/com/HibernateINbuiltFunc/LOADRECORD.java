package com.HibernateINbuiltFunc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LOADRECORD {
public static void main(String[] args) {
	System.out.println(1);
	Configuration cfg = new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(Details.class);
	System.out.println(2);
	SessionFactory factory =cfg.buildSessionFactory();
	Session session = factory.openSession();
	System.out.println(3);
	Details DT=session.load(Details.class, 2);
	System.out.println(DT);
}
}
