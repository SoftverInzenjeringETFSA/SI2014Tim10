/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tim10.glavna_knjiga.dbutils;

import com.tim10.glavna_knjiga.hibernate.HibernateSessionManager;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

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
}
