/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tim10.glavna_knjiga.dbutils;

import com.tim10.glavna_knjiga.hibernate.HibernateSessionManager;
import com.tim10.glavna_knjiga.mappings.Nalozi;
import com.tim10.glavna_knjiga.mappings.StavkeNaloga;
import com.tim10.glavna_knjiga.session.UserData;
import java.util.ArrayList;
import java.util.Date;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Omar
 */
public class NaloziUtils {
    
    private static NaloziUtils instance = null;
    
    private static Session session = HibernateSessionManager.getSessionFactory().openSession();
    
    private NaloziUtils() {
    }
    
    public static NaloziUtils getInstace() {
        if(instance == null) 
        {
            instance = new NaloziUtils();
        }
        return instance;
    }
    
    public void spasiNalog (Nalozi nalog, boolean zatvoriNalog) {
        try {
            Transaction tran = session.beginTransaction();

            if (zatvoriNalog)
            {
                nalog.setStatus(2);
                nalog.setDatumKnjizenja(new Date());
            }
            else
            {
                nalog.setStatus(1);
            }

            session.save(nalog);
            tran.commit();
        } catch(Exception e) {
            session.flush();
        } finally {
            session.clear();
        }
    }
    
    public void izmijeniNalog (Nalozi nalog, boolean zatvoriNalog) {
        Transaction tran = session.beginTransaction();

        if (zatvoriNalog)
        {
            nalog.setStatus(2);
            nalog.setDatumKnjizenja(new Date());
        }
        
        session.update(nalog);
        tran.commit();
        
        session.clear();
    }
    
    public void obrisiNalog(Nalozi nalog) {
        Transaction tran = session.beginTransaction();
        
        session.delete(nalog);
        tran.commit();
    }
    
    public void spasiStavkeNaloga (List<StavkeNaloga> stavke) {
        Transaction tran = session.beginTransaction();
        
        for(StavkeNaloga stavka: stavke)
        {
            session.save(stavka);
        }
        
        tran.commit();
    }
    
    public List<Nalozi> getNalozi(String sifraNaloga, String nazivNaloga, int statusNaloga, boolean isInit) {
        
        Query query;
        List<Nalozi> nalozi = new ArrayList<Nalozi>();
        
        if (isInit)
        {
            query = session.createQuery("select nalozi from Nalozi nalozi where nalozi.preduzece.id = :praduzece");
            query.setParameter("praduzece", UserData.getPreduzece().getIdPreduzece()); 

            nalozi = query.list();
        }
        else
        {
            if (statusNaloga == 0)
            {
                query = session.createQuery("select nalozi from Nalozi nalozi where nalozi.preduzece.id = :preduzece AND nalozi.sifraNaloga LIKE :sifra AND nalozi.naziv LIKE :naziv");
            }
            else
            {
                query = session.createQuery("select nalozi from Nalozi nalozi where nalozi.preduzece.id = :preduzece AND nalozi.sifraNaloga LIKE :sifra AND nalozi.naziv LIKE :naziv AND nalozi.status= :status");
                query.setParameter("status", statusNaloga);
            }
            
            query.setParameter("preduzece", UserData.getPreduzece().getIdPreduzece()); 
            query.setParameter("sifra", (sifraNaloga.isEmpty()) ? "%%" : "%" + sifraNaloga + "%");
            query.setParameter("naziv", (nazivNaloga.isEmpty()) ? "%%" : "%" + nazivNaloga + "%");
            
            nalozi = query.list();
        }

        return nalozi;
    }
    
}
