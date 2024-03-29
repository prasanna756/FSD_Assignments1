package com.hexaware.mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mappings.entity.Address;
import com.hexaware.mappings.entity.Student;

public class OneToOneMapping 
{
	
    public static void main( String[] args )
    {
       SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
       Session session =sessionFactory.openSession();
        System.out.println(session);
        

        Student student= new Student(103,"ford");
        Address address  = new Address(29,"Noida",student);
        
     
        
        Transaction txn= session.beginTransaction();
        session.persist(address);
        txn.commit();
    }
}
