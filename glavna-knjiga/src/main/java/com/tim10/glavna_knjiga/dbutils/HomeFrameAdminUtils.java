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
import javax.swing.table.DefaultTableModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

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
        
        
        for(int i = 0; i < allKorisnici.size(); i++)
        {
            rowData[i] = new Object[] {allKorisnici.get(i).getIme(), allKorisnici.get(i).getPrezime()};
        }
        
        return rowData;
    }
    
    public DefaultTableModel getDefModel()
    {
        Query query = session.createQuery("select ko from Korisnik ko");
        List<Korisnik> allKorisnici = query.list();
        System.out.println(allKorisnici.size());
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Ime", "Prezime", "Korisničko ime", "JMBG", "Adresa", "Telefon", "Tip korisnika"});
        for (Korisnik k : allKorisnici)
        {
            model.addRow(new Object[]{k.getIme().toString(), k.getPrezime().toString(), k.getKorisnickoIme().toString(),
            k.getJmbg().toString(), k.getAdresa().toString(), k.getTelefon().toString(), k.getKorisnikTipovi().getNaziv().toString()});
            //JOptionPane.showMessageDialog(null, k.getIme().toString(), "Naslov", JOptionPane.INFORMATION_MESSAGE);
        }
        
        //String col[] = {"Pos","Team","P", "W", "L", "D", "MP", "GF", "GA", "GD"};
        //DefaultTableModel model = new DefaultTableModel(col, 0);
        
        return model;
    }
    
    //vrati korisnika na osnovu jmbga
    public List<Korisnik> getKorisnikJmbg(int jmbg)
    { 
        Query query = session.createQuery("select ko from Korisnik ko where ko.jmbg='" + jmbg + "'");
        List<Korisnik> del = query.list();
        return del;
        
    }
    
    //obrisi krosinika 
    public void ObrisiKorisnika (Korisnik k)
    {
        Transaction tx = session.beginTransaction();
        session.delete(k);
        tx.commit();
    }
}
