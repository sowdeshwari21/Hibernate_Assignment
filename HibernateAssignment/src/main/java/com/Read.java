package com;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Read {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your id");
		int id=s.nextInt();
		Configuration con=new Configuration();
		con.configure();
		SessionFactory sef=con.buildSessionFactory();
		Session ses=sef.openSession();
		Employee e=new Employee();
Employee val=ses.find(Employee.class, id);
		if(val!=null) {
			System.out.println("The expected value");
			System.out.println(val);
		
		}else {
			System.out.println("Id not found");
		}
	}
}
