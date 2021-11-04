package com.luv2code.hibernate.demo;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Employee;
import com.luv2code.hibernate.demo.entity.Student;



public class CrudEmployeeDemo {

	public static void main(String[] args) {
		
		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Employee.class)
								.buildSessionFactory();
								
		// create session
		Session session =  factory.getCurrentSession();
		
		try {
			// create a student object
//			System.out.println("Creating new employee object...");
//			Employee tempEmployee1 = new Employee("Jeannie", "Luo", "Paypal");
//			Employee tempEmployee2 = new Employee("Kun", "Wang", "Uber.tec");
//			Employee tempEmployee3 = new Employee("Yimo", "Wang", "Happy.tec");
			
			// start a transaction
			session.beginTransaction();
			
			// save the student object
//			System.out.println("Saving the employees...");
//			session.save(tempEmployee1);
//			session.save(tempEmployee2);
//			session.save(tempEmployee3);
			
			// commit transaction
//			session.getTransaction().commit();
			
			// read employees
//			session = factory.getCurrentSession();
//			session.beginTransaction();
			
//			Employee e1 = session.get(Employee.class, tempEmployee2.getId());
//			System.out.println("read complete : " + e1);
			
			// update employees
			//int id = 3;
			//Employee e1 = session.get(Employee.class, id);
			//e1.setFirstName("Maggie");
			session.createQuery("update Employee set company='Facebook' where lastName='Luo'")
			       .executeUpdate();
			
			// commit transaction
   		    session.getTransaction().commit();
   		    
   		    session =  factory.getCurrentSession();
   		    session.beginTransaction();
   		    
   		    session.createQuery("delete Employee where lastName='Luo'")
	       .executeUpdate();
   		    
   		   // commit transaction
   		    session.getTransaction().commit();
   		    
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}
