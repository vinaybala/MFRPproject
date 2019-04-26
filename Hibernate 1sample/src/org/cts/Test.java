package org.cts;

import java.util.List;

import org.cts.beans.Emp;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration  configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		
		Transaction transaction=session.beginTransaction();
		Emp e=new Emp(134,"shaik","kurnool");
		session.saveOrUpdate(e);
		System.out.println("save or update");
		
		
//	
//		Query query=session.createQuery("from org.cts.beans.Emp as e where e.name=:name ");
//		query.setParameter("name","bala");
//	   
//	
//		
//		
//	List<Emp> list=query.list();
//		
//		for(Emp e:list)
//		{
//			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getAddress());
//		}
//		
		
		
		transaction.commit();
		session.close();
		
		
		
		
	

	}

}
