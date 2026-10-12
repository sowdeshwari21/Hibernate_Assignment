package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {
	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure();
		SessionFactory sef=con.buildSessionFactory();
		Session ses=sef.openSession();
		Transaction tran=ses.getTransaction();
		tran.begin();
		Employee e=new Employee();
		e.setId(1);
		e.setName("Changed data");
		e.setPassword("Changed value");
		e.setDesgnation("change");
		ses.update(e);
		
		System.out.println("values are updated");
		tran.commit();
	}

}
