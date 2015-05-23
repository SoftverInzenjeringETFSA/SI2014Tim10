/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tim10.glavna_knjiga.dbutils;

import com.tim10.glavna_knjiga.hibernate.HibernateSessionManager;
import com.tim10.glavna_knjiga.mappings.Korisnik;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Faris
 */
public class DodajKorisnikaFrameUtils {
     private static DodajKorisnikaFrameUtils instance = null;
    
    private static Session session = HibernateSessionManager.getSessionFactory().openSession();
    
    private DodajKorisnikaFrameUtils() {
		// NO INSTANTIATIOOON!!!
        }
    
    public static DodajKorisnikaFrameUtils getInstace() {
		if(instance == null) {
			instance = new DodajKorisnikaFrameUtils();
		}
		
		return instance;
	}
    
    //daj tip korisnika!
    public List<String> getAllTipKorisnika()
    {
        Query query = session.createQuery("select kt.naziv from KorisnikTipovi kt");	
        List<String> allKorisnikTipovi = query.list();
        
        return allKorisnikTipovi;
    }
    
    public void ustekaj (Korisnik k)
    {
        Transaction tx = session.beginTransaction();
        session.save(k);
        tx.commit();
        //session.disconnect();
        //session.close();
    }
    
    public void istekaj (Korisnik k)
    {
        Transaction tx = session.beginTransaction();
        session.delete(k);
        tx.commit();
    }
    
}
