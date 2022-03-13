package com.hubberspot.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateTest {
 public static void main(String[] args) {

  // SessionFactory gives us a factory of sessions
  // Usually SessionFactory is been configured by the 
  // configuration file named as hibernate.cfg.xml
  // buildSessionFactory() builds the sessionFactory for us
  SessionFactory sessionFactory = new Configuration().
    configure().buildSessionFactory();

  // Session is created by calling openSession()
  // method on SessionFactory object
  Session session = sessionFactory.openSession();
  // Creating a transaction from session
  Transaction tx = session.beginTransaction();

  // Creating a Customer object 
  Customer customer = new Customer();
  // setting customer name , email and phone
  customer.setCustomerName("hubberspot");
  customer.setCustomerEmail("jonty@hubberspot.com");
  customer.setCustomerPhone("89289867");
  // Saving the Customer into the database 
  session.save(customer);
  // Commiting the transaction
  session.getTransaction().commit();
  // closing the session
  session.close();

 }
}
