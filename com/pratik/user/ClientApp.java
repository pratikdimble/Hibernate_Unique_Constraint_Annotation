package com.pratik.user;

import java.util.Date;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pratik.domain.EmpDate_UKC;

public class ClientApp {

	public static void main(String[] args) {

//declare the resources
		Configuration cfg = null;
		SessionFactory factory = null;
		Session ses = null;
		EmpDate_UKC mart = null;
		Transaction tx = null;
			
			//activate the HB framework
			cfg = new Configuration();
				cfg = cfg.configure("/com/pratik/cfgs/hibernate.cfg.xml");
				//build the session factory
				factory = cfg.buildSessionFactory();
				//open or get the session
				ses = factory.openSession();
				
					//create the date 
					Date joindate=new Date();
						//create the domain class object
							mart = new EmpDate_UKC();
							
							//set the values
								mart.setFname("pratik1");
									mart.setLname("Dimble1");
										mart.setJoindate(joindate);

										try {
											//begin the transaction
												tx = ses.beginTransaction();
													//save the record/object
												int idVal=(Integer)ses.save(mart);
													tx.commit();
													System.out.println("object is saved with ID: "+idVal);
										} catch (Exception e) {
											tx.rollback();
												e.printStackTrace();
										}
											//close the session and session factory
												ses.close();
													factory.close();

		
		System.out.print("\n\t\t ==PROGRAMME BY PRATIK DIMBLE==\n\n\n");

	}//main()close

}//class close
