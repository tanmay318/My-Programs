package com.CriteriaNQueryEX;

import java.sql.Statement;
import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Expression;

public class CriteriaDEMO {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure().addAnnotatedClass(Student.class).addAnnotatedClass(Country.class);
	SessionFactory sf = cfg.buildSessionFactory();
	Session session = sf.openSession();
	Criteria criteria = session.createCriteria(Student.class);
	List<Student> studentList = criteria.list();
	for (Student student : studentList) { System.out.println(student.getSname());
	}
	////// adding where condition
	Criteria criteria1 = session.createCriteria(Student.class);
	criteria1.add(Expression.eqProperty("sname","jbk44"));
	List<Student> studentList1 = criteria1.list();
	for (Student student : studentList1) 
	{ 
		System.out.println(student.getSname());
}
}
}