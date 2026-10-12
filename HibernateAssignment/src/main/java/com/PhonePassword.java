package com;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class PhonePassword {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your phone number");
		long ph=s.nextLong();
		System.out.println("Enter your password");
		String pw=s.next();
		
		Configuration con=new Configuration();
		con.configure();
		SessionFactory sef=con.buildSessionFactory();
		Session ses=sef.openSession();
		
	Query q=ses.createQuery("select e from Employee e where e.phone=?1 and e.password=?2");
		q.setParameter(1, ph);
		q.setParameter(2, pw);
	 
	try {
		Employee e = (Employee) q.getSingleResult();
		System.out.println("Phone and password matched");
	} catch (Exception e) {
		System.out.println("Phone and password are not matched");
	}
	
	
	}
}
