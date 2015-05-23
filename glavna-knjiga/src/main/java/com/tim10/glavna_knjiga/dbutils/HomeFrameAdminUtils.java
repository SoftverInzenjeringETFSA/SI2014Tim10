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

/**
 *
 * @author Faris
 */
public class HomeFrameAdminUtils {
    private static HomeFrameAdminUtils instance = null;
    
    private static Session session = HibernateSessionManager.getSessionFactory().openSession();
    
    private HomeFrameAdminUtils() {
		// NO INSTANTIATIOOON!!!
        }
    
    public static HomeFrameAdminUtils getInstace() {
		if(instance == null) {
			instance = new HomeFrameAdminUtils();
		}
		
		return instance;
	}
    
    //daj sve korisnike
    public Object[][] getAllKorisnici()
    {
        Query query = session.createQuery("select ko from Korisnik ko");
        List<Korisnik> allKorisnici = query.list();
        
        Object[][] rowData = new Object[2][];
        System.out.println(allKorisnici.size());
        
        for(int i = 0; i < allKorisnici.size(); i++)
        {
            rowData[i] = new Object[] {allKorisnici.get(i).getIme(), allKorisnici.get(i).getPrezime()};
        }
        
        return rowData;
    }
    
}
