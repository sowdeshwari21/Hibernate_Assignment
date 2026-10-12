package com;
import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class EmpbyDesg {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Designation");
		String desg=s.next();
		Configuration con=new Configuration();
		con.configure();
		SessionFactory sef=con.buildSessionFactory();
		Session ses=sef.openSession();
Query q=ses.createQuery("select e from Employee e where e.desgnation=?1");
q.setParameter(1, desg);
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
