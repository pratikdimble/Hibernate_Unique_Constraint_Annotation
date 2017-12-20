package com.pratik.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pratik.domain.EmpDate_UKC;

public class get_or_find {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Configuration cfg = null;
		SessionFactory factory = null;
		Session ses = null;
		EmpDate_UKC em = null;
	
		cfg = new Configuration();
		cfg = cfg.configure("/com/pratik/cfgs/hibernate.cfg.xml");
		factory = cfg.buildSessionFactory();
		ses = factory.openSession();
		em = new EmpDate_UKC();
		em=ses.get(EmpDate.class, 22);
		
		
		if(em!=null)
		{
			System.out.println("===Record Found ===");
			System.out.println("ID: "+em.getCartid()+"\nFNAME: "+em.getFname()+"\nLNAME: "
								+em.getLname()+"\nJoinDate: "+em.getJoindate());
		}
		else
		{
			System.out.println("Record Not Found");
		}

		System.out.print("\n\t\t ==PROGRAMME BY PRATIK DIMBLE==\n\n\n");

	}

}
