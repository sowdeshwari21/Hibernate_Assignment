package com;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class EmpBetweensalRange {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Min Salary");
		double sal1=s.nextDouble();
		System.out.println("Enter your Max Salary");
		double sal2=s.nextDouble();
		Configuration con=new Configuration();
		con.configure();
		SessionFactory sef=con.buildSessionFactory();
		Session ses=sef.openSession();
Query q=ses.createQuery
("select e from Employee e where e.salary between :sal1 and :sal2");
q.setParameter("sal1", sal1);
q.setParameter("sal2", sal2);
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

