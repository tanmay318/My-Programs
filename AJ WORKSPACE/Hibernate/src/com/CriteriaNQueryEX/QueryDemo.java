package com.CriteriaNQueryEX;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class QueryDemo {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure().addAnnotatedClass(Student.class).addAnnotatedClass(Country.class);
	SessionFactory sf = cfg.buildSessionFactory();
	Session session = sf.openSession();
	Query query = session.createQuery("from Student");
	List<Student> studentList = query.list();
	for (Student student : studentList) {
	System.out.println(student.getSname());
	}
	////// adding where condition and column names
	Query query1 = session.createQuery("select sname from Student where sname='jbk44'");
	List<String> studentList1 = query1.list();
	for (String sname : studentList1) {
	System.out.println(sname);
	}
}
}
