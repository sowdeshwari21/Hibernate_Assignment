package com;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class IdPassword {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your id");
	int id=s.nextInt();
		System.out.println("Enter your password");
		String pw=s.next();
		
		Configuration con=new Configuration();
		con.configure();
		SessionFactory sef=con.buildSessionFactory();
		Session ses=sef.openSession();
		
	Query q=ses.createQuery("select e from Employee e where e.id=:id and e.password=:password");
		q.setParameter("id", id);
		q.setParameter("password", pw);
	 
	try {
		Employee e = (Employee) q.getSingleResult();
		System.out.println("Id and password matched");
	} catch (Exception e) {
		System.out.println("Id and password are not matched");
	}
	
	

}
}
