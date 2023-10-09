package com.klu.JFSD_HIBERNATE;



import org.hibernate.Criteria;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.criterion.Restrictions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("Hibernate.cfg.xml").build();
        Metadata md = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory sf = md.getSessionFactoryBuilder().build();
        Session s = sf.openSession();
        Transaction t;
        
      //  Employee e1=new Employee();
      // e1.setId(1);
      //  e1.setName("mm");
      //  e1.setSalary(50000);
      // t = s.beginTransaction();
      //  s.save(e1);
      //  t.commit();
       //System.out.println("Inserted");
        Employee e1=new Employee();
        e1.setId(1);
         e1.setName("new");
         e1.setSalary(50000);
        t = s.beginTransaction();
        s.save(e1);
         t.commit();
        System.out.println("Parent Inserted");
        ContractEmployee e11=new ContractEmployee();
         e11.setName("new1");
         e11.setMonth(2);
         e11.setDept("CSE");
        t = s.beginTransaction();
        s.save(e11);
         t.commit();
        System.out.println("child-1 Inserted");
        RegularEmployee e12 =new RegularEmployee();
        e12.setSalary(12500);
        e12.setInstitute("KLU");
        e12.setDept("CSE-H");
        t = s.beginTransaction();
        s.save(e12);
         t.commit();
        System.out.println("child-2 Inserted");
        
        
     //   Employee e2 = s.find(Employee.class, 2);
     // e2.setName("Pavan");
     //   t = s.beginTransaction();
     //  s.update(e2);
     //  t.commit();
     //  System.out.println("Updated");
        
     //   Employee e3 = s.find(Employee.class, 2);
     //   t = s.beginTransaction();
     //   s.delete(e3);
     //   t.commit();
     // System.out.println("Deleted");
        
      //  Criteria c = s.createCriteria(Employee.class); // for retrieval of entire data criteria class
      //  c.add(Restrictions.gt("id", 2) );
      //  List<Employee> l=c.list();
      //  for(Employee e :l)
        {
        	//System.out.println(e.getId());  //JOIN
        	//Table per class
        	//Class
        	//System.out.println(e.getName());
        	//System.out.println(e.getSalary());
        	
        }
        
        
        
        
    }
}
