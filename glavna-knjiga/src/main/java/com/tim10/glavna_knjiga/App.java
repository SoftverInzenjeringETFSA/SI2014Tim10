package com.tim10.glavna_knjiga;

import org.hibernate.Session;

import com.tim10.glavna_knjiga.hibernate.HibernateSessionManager;
import com.tim10.glavna_knjiga.mappings.TblOdsjeci;
import com.tim10.glavna_knjiga.mappings.TblStudenti;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Session session = HibernateSessionManager.getSessionFactory()
				.openSession();

		session.beginTransaction();
		
		TblOdsjeci odsjek = new TblOdsjeci();
		odsjek.setId(1);
		
		TblStudenti student = new TblStudenti();
		student.setId(4);
		student.setName("nole");
		student.setSurname("masturbator");
		student.setTblOdsjeci(odsjek);
		
		session.save(student);
		
		session.getTransaction().commit();
		
		System.out.println("xxx");
	}
}
