package com.HibernateINbuiltFunc;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CriteriaTest {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(Details.class);
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	Criteria criteria = session.createCriteria(Details.class);
	List <Details> listdt = criteria.list();
	for (Details details : listdt) {
		System.out.println(details.Id);
		System.out.println(details.mobno);
		System.out.println(details.Name);
	}
}
}
