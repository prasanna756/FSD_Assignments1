package com.hexaware.hibernate;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.hibernate.entity.Employee;

public class App 
{
    public static void main( String[] args )
    {
       
        
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        System.out.println(sessionFactory);
        
         Session session =sessionFactory.openSession();
         System.out.println(session);
         
         Transaction txn=session.beginTransaction();//mandatory for DML only
         
         //Employee emp=new Employee(101,"king khan",60000);
        // session.get(Employee.class, 101);
         
        // Serializable ser=session.save(emp);//insert or update
        //System.out.println(ser.toString());
        
//        Employee emp2=new Employee(103,"geetha",30000);
//        Employee emp3=new Employee(104,"surekha",54000);
//        Employee emp4=new Employee(105,"latha",20000);
//        
//        session.save(emp2);
//        session.save(emp3);
//        session.save(emp4);
         
//         Employee emp1 = session.get(Employee.class, 101);
//         System.out.println(emp1);
//         emp1.setEname("Lakshmi Prasanna");
//         emp1.setSalary(90000);
//         
//         Serializable ser=session.save(emp1);
//         System.out.println("updated record"+ser.toString());
//         
//         Employee updatedEmp = session.get(Employee.class, 101);
//         System.out.println(updatedEmp);
         
         //session.delete(updatedEmp);
          Employee e =new Employee(103,"Adam smith",75000);
          session.saveOrUpdate(e);
          System.out.println(e);
        
         txn.commit();
    }
}
