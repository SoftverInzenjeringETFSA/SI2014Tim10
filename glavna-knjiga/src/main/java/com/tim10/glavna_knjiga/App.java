package com.tim10.glavna_knjiga;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.tim10.glavna_knjiga.hibernate.HibernateSessionManager;
import com.tim10.glavna_knjiga.mappings.KorisnikTipovi;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Session session = HibernateSessionManager.getSessionFactory()
				.openSession();
		
		Query query = session.createQuery("from KorisnikTipovi");	
		List<KorisnikTipovi> listAllKorisnikTipovi = query.list();
		
		System.out.println(listAllKorisnikTipovi.toString());
	}
}
