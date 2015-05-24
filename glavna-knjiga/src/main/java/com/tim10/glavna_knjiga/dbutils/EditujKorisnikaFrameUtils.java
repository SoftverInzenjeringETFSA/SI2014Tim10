/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tim10.glavna_knjiga.dbutils;

import com.tim10.glavna_knjiga.hibernate.HibernateSessionManager;
import com.tim10.glavna_knjiga.mappings.Korisnik;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Faris
 */
public class EditujKorisnikaFrameUtils {
    private static EditujKorisnikaFrameUtils instance = null;
    
    private static Session session = HibernateSessionManager.getSessionFactory().openSession();
    
    private EditujKorisnikaFrameUtils() {
		// NO INSTANTIATIOOON!!!
        }
    
    public static EditujKorisnikaFrameUtils getInstace() {
		if(instance == null) {
			instance = new EditujKorisnikaFrameUtils();
		}
		
		return instance;
	}
    
    //daj korisnike
    public List<Korisnik> getKorisnikPoJmbg(int jmbg)
    {
        
        Query query = session.createQuery("select ko from Korisnik ko where ko.jmbg='" + jmbg + "'");
        List<Korisnik> edit = query.list();
        return edit;
        
    }
    
    //daj jmbg-ove
    public List<Integer> getAllJmbg()
    {
        Query query = session.createQuery("select ko.jmbg from Korisnik ko");
        List<Integer> all = query.list();
      
        return all;
    }
}
