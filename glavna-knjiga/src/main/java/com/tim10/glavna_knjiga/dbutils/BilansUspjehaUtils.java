/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tim10.glavna_knjiga.dbutils;

import com.tim10.glavna_knjiga.hibernate.HibernateSessionManager;
import org.hibernate.Session;
import com.tim10.glavna_knjiga.mappings.KontniOkvir;
import com.tim10.glavna_knjiga.mappings.KontniPlan;
import com.tim10.glavna_knjiga.mappings.Nalozi;
import com.tim10.glavna_knjiga.mappings.Preduzece;
import com.tim10.glavna_knjiga.mappings.StavkeNaloga;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Transaction;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ZUGOR
 */
public class BilansUspjehaUtils {
    private static BilansUspjehaUtils instance = null;
    
    private static Session session = HibernateSessionManager.getSessionFactory().openSession();
    
    private BilansUspjehaUtils() {
		// NO INSTANTIATIOOON!!!
        }
    
    public static BilansUspjehaUtils getInstace() {
		if(instance == null) {
			instance = new BilansUspjehaUtils();
		}
		
		return instance;
	}
    
    
    
    
	public Object[][] getAllPPreduzeca() {
            Query query = session.createQuery("select ko from Preduzeca ko");
            List<Preduzece> allPreduzeca = query.list();

            System.out.println(allPreduzeca.size());

            Object[][] rowData = new Object[allPreduzeca.size()][];

            for(int i = 0; i < allPreduzeca.size(); i++) {
                    rowData[i] =
                        new Object[] { (allPreduzeca.get(i).getNaziv()).toLowerCase() };
            }

            return rowData;
	}
        
        
        
	public Object[][] getAllBilansUspjehaTrenutnaGodina(String preduzece) throws ParseException {
              Query query = session.createQuery(
                            "select ko from Nalozi ko where lower(ko.preduzece) like '" + 
                            preduzece.toLowerCase() +  "%'"
            );
              
               Query query2 = session.createQuery(
                            "select ko from StavkeNaloga ko " );
              
            List<Nalozi> allNalozi = query.list();
            List<StavkeNaloga> allStavkeNaloga = query.list();
            

            System.out.println(allNalozi.size());

           
             Object[][] trenutnaGodina = new Object[allNalozi.size()][];

            for(int i = 0; i < allNalozi.size(); i++) {
                
                for (int j = 0; j < allStavkeNaloga.size(); j++) {
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Date date = dateFormat.parse("01/06/2014");
                    long time = date.getTime();
                    
                if ( time<=dateFormat(allStavkeNaloga.get(i).getDatumKreiranja())){
                    if (allStavkeNaloga.get(j).getNalozi().equals(allNalozi.get(i).getId()))
                    trenutnaGodina[i] =
                        new Object[] { (allStavkeNaloga.get(j).getPotrazuje().floatValue()- allStavkeNaloga.get(j).getDuguje().floatValue())};
            }}}

            return trenutnaGodina;
	}
        
        
        
      
	public Object[][] getAllBilansUspjehaPrethodnaGodina(String preduzece) throws ParseException {
              Query query = session.createQuery(
                            "select ko from Nalozi ko where lower(ko.preduzece) like '" + 
                            preduzece.toLowerCase() +  "%'"
            );
              
               Query query2 = session.createQuery(
                            "select ko from StavkeNaloga ko " );
              
            List<Nalozi> allNalozi = query.list();
            List<StavkeNaloga> allStavkeNaloga = query.list();
            

            System.out.println(allNalozi.size());

            Object[][] prethodnaGodina = new Object[allNalozi.size()][];

            for(int i = 0; i < allNalozi.size(); i++) {
                
                for (int j = 0; j < allStavkeNaloga.size(); j++) {
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Date date = dateFormat.parse("01/06/2013");
                    long time = date.getTime();
                    
                if ( time<=dateFormat(allStavkeNaloga.get(i).getDatumKreiranja())){
                    if (allStavkeNaloga.get(j).getNalozi().equals(allNalozi.get(i).getId()))
                    prethodnaGodina[i] =
                        new Object[] { (allStavkeNaloga.get(j).getPotrazuje().floatValue()- allStavkeNaloga.get(j).getDuguje().floatValue())};
            }}}

            return prethodnaGodina;
	}
        
        
         
      
	public Object[][] getAllAOP(String preduzece) throws ParseException {
              Query query = session.createQuery(
                            "select ko from Nalozi ko where lower(ko.preduzece) like '" + 
                            preduzece.toLowerCase() +  "%'"
            );
              

            List<Nalozi> allNalozi = query.list();

            System.out.println(allNalozi.size());

            Object[][] allNaloziID = new Object[allNalozi.size()][];

            for(int i = 0; i < allNalozi.size(); i++) {
               
              
                    allNaloziID[i] =
                        new Object[] {allNalozi.get(i).getId()};
            }

            return allNaloziID;
	}
        
        
        	public Object[][] getAllPozicija(String preduzece) throws ParseException {
              Query query = session.createQuery(
                            "select ko from KontniPlan ko where lower(ko.preduzece) like '" + 
                            preduzece.toLowerCase() +  "%'"
            );
              

            List<Nalozi> allKontniPlan = query.list();

            System.out.println(allKontniPlan.size());

            Object[][] allNaloziID = new Object[allKontniPlan.size()][];

            for(int i = 0; i < allKontniPlan.size(); i++) {
               
              
                    allNaloziID[i] =
                        new Object[] {allKontniPlan.get(i).getStavkeNalogas()};
            }

            return allNaloziID;
	}
        
        
        
        
        
          	public Object[][] getAllGrupaRacuna(String preduzece) throws ParseException {
              Query query = session.createQuery(
                            "select ko from Nalozi ko where lower(ko.preduzece) like '" + 
                            preduzece.toLowerCase() +  "%'"
            );
              

            List<Nalozi> allGrupaRacuna = query.list();

            System.out.println(allGrupaRacuna.size());

            Object[][] allNaloziID = new Object[allGrupaRacuna.size()][];

            for(int i = 0; i < allGrupaRacuna.size(); i++) {
               
              
                    allNaloziID[i] =
                        new Object[] {allGrupaRacuna.get(i).getStavkeNalogas()};
            }

            return allNaloziID;
	}
        
        
        
        


    private long dateFormat(Date datumKreiranja) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}


