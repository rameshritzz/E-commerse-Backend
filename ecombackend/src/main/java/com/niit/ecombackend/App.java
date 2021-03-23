package com.niit.ecombackend;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ecombackend.model.customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
         SessionFactory sf=(SessionFactory) context.getBean("sf");
         customer v=new customer();
         Session s=sf.openSession();
         org.hibernate.Transaction t=s.beginTransaction();
         s.save(v);
         t.commit();
         s.close();
         sf.close();
    }
}
