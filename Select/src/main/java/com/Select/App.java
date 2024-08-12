package com.Select;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
      Employee emp=null;
        Configuration con=new Configuration().configure().addAnnotatedClass(Employee.class);
        SessionFactory sf=con.buildSessionFactory();
        Session session=sf.openSession();
        emp=session.get(Employee.class,1);
        System.out.println(emp);
        
    }
}
