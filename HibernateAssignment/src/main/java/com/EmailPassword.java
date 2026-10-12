package com;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class EmailPassword {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Email");
		String email=s.next();
		System.out.println("Enter your password");
		String pw=s.next();
		
		Configuration con=new Configuration();
		con.configure();
		SessionFactory sef=con.buildSessionFactory();
		Session ses=sef.openSession();
		
	Query q=ses.createQuery
   ("select e from Employee e where e.email=:email and e.password=:password");
		q.setParameter("email", email);
		q.setParameter("password", pw);
	 

	try {
		Employee e=	(Employee) q.getSingleResult();
		System.out.println(e);
	} catch (Exception e) {
		System.out.println("Email and password not verfied");
	}
		
	
	
	}

}
