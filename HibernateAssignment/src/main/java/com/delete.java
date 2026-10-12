package com;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class delete {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your id");
		int id=s.nextInt();
		Configuration con=new Configuration();
		con.configure();
		SessionFactory sef=con.buildSessionFactory();
		Session ses=sef.openSession();
		Transaction tran=ses.getTransaction();
		tran.begin();
	Employee e=ses.find(Employee.class, id);
	if(e!=null) {
		ses.delete(e);
		System.out.println("Object deleted");
	}else {
		System.out.println("Id not found object cannot delete");
	}
	tran.commit();
	}

}
