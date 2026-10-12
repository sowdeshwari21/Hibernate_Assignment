package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveEmp {
	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure();
		SessionFactory sef=con.buildSessionFactory();
		Session ses=sef.openSession();
		Transaction tran=ses.getTransaction();
		tran.begin();
		Employee e=new Employee();
		e.setName("Sowdesh");
		e.setEmail("Sowdesh123@gmail.com");
		e.setDesgnation("Developer");
		e.setPassword("Sowdesh123");
		e.setSalary(1000000.0);
		e.setPhone(1223456780);
		
		ses.save(e);
		
		Employee e1=new Employee();
		e1.setName("Sowdesh");
		e1.setEmail("Sowdesh123@gmail.com");
		e1.setDesgnation("Developer");
		e1.setPassword("Sowdesh123");
		e1.setSalary(1000000.0);
		e1.setPhone(1123456678);
		ses.save(e1);
		
		Employee e2=new Employee();
		e2.setName("Chaitra");
		e2.setEmail("chaitra123@gmail.com");
		e2.setDesgnation("Developer");
		e2.setPassword("chaitra123");
		e2.setSalary(1000000.0);
		e2.setPhone(1233556789);
		ses.save(e2);
		
		Employee e3=new Employee();
		e3.setName("Ranjana");
		e3.setEmail("ranjana123@gmail.com");
		e3.setDesgnation("Developer");
		e3.setPassword("ranjana123");
		e3.setSalary(1000000.0);
		e3.setPhone(1234456789);
		ses.save(e3);
		
		Employee e4=new Employee();
		e4.setName("Srinithi");
		e4.setEmail("Srinithi123@gmail.com");
		e4.setDesgnation("Developer");
		e4.setPassword("Srinithi123");
		e4.setSalary(1000000.0);
		e4.setPhone(1234556789);
		ses.save(e4);
		
		System.out.println("Values are saved");
		tran.commit();
	}

}
