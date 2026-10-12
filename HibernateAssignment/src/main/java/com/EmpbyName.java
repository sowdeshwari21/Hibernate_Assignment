package com;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class EmpbyName {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=s.next();
		Configuration con=new Configuration();
		con.configure();
		SessionFactory sef=con.buildSessionFactory();
		Session ses=sef.openSession();
Query q=ses.createQuery("select e from Employee e where e.name=?1");
q.setParameter(1, name);
List<Employee> e=q.getResultList();
if(e.size()>0) {
	for(Employee emp:e) {
		System.out.println(emp);
	}
}else {
	System.out.println("Emp not found");
}
		
		
	}

}
