package com.hibernateEX;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientDemo {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(Employee.class);
	SessionFactory factory =cfg.buildSessionFactory();
	Session session = factory.openSession();
	Employee employee = session.load(Employee.class,22);
	System.out.println(employee);
	
}
}
