/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tim10.glavna_knjiga.dbutils;

import com.tim10.glavna_knjiga.hibernate.HibernateSessionManager;
import com.tim10.glavna_knjiga.mappings.Dokumenti;
import com.tim10.glavna_knjiga.mappings.Klijent;
import com.tim10.glavna_knjiga.mappings.KontniOkvir;
import com.tim10.glavna_knjiga.mappings.Nalozi;
import com.tim10.glavna_knjiga.mappings.StavkeNaloga;
import com.tim10.glavna_knjiga.session.UserData;
import java.util.ArrayList;
import java.util.Date;

import java.util.List;
import java.util.Set;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
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
        
        session.clear();
    }
    
    public void spasiStavkeNaloga(List<StavkeNaloga> stavkeNaloga, Nalozi nalog){
        
        Transaction tran = session.beginTransaction();
        
        if (nalog.getId() == 0)
        {
            Query query;
            List<Nalozi> nalozi = new ArrayList<Nalozi>();

            query = session.createQuery("select nalozi from Nalozi nalozi order by nalozi.id desc").setMaxResults(1);

            nalozi = query.list();

            if (nalozi.size() > 0)
            {
                Nalozi spaseniNalog = nalozi.get(0);

                for(StavkeNaloga stavka: stavkeNaloga)
                {
                    stavka.setNalozi(spaseniNalog);
                    session.save(stavka);

                    session.flush();
                    session.clear();
                }  
            }
        }
        else
        {
            for(StavkeNaloga stavka: stavkeNaloga)
            {
                if (stavka.getId() == 0)
                {
                    session.save(stavka);

                    session.flush();
                    session.clear();
                }
                else
                {
                    session.update(stavka);

                    session.flush();
                    session.clear();
                }
            }
        }
        
        tran.commit();
        
        session.clear();
    }
    
    public void obrisiStavkeNaloga(List<StavkeNaloga> stavkeNaloga) {
        Transaction tran = session.beginTransaction();
        
        for (StavkeNaloga stavka: stavkeNaloga)
            session.delete(stavka);
        
        tran.commit();
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
        
        for (StavkeNaloga stavka: nalog.getStavkeNalogas())
            session.delete(stavka);
        
        session.delete(nalog);
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
    
    public List<Dokumenti> getDokumenti() {
        
        Query query;
        List<Dokumenti> dokumenti = new ArrayList<Dokumenti>();
        
        query = session.createQuery("select dokumenti from Dokumenti dokumenti");

        dokumenti = query.list();

        return dokumenti;
    }
    
    public List<Klijent> getKlijenti() {
        
        Query query;
        List<Klijent> klijenti = new ArrayList<Klijent>();
        
        query = session.createQuery("select klijenti from Klijent klijenti");

        klijenti = query.list();

        return klijenti;
    }
    
    public List<KontniOkvir> getKontoIzOkvira(String sifraKonta){
        
        List<KontniOkvir> result = new ArrayList<KontniOkvir>();
        Query query;
        
        query = session.createQuery("select konto from KontniOkvir konto where konto.brojKonta = :sifrakonta");
        query.setParameter("sifrakonta", sifraKonta);
        
        result = query.list();
        
        return result;
    }
    
    public boolean provjeriKontoUKontnomPlanu(int idKonta){
        
        int idPreduzeca = UserData.getPreduzece().getIdPreduzece();
        SQLQuery query;
          
        query = session.createSQLQuery("select kpko.KontniOkvir_id from KontniPlan_has_KontniOkvir kpko "
                + "inner join KontniPlan kp on kpko.KontniPlan_IdKontniPlan = kp.idKOntniPlan "
                + "where kpko.KontniOkvir_id = :idKonta and kp.Preduzece_IdPreduzece = :idPreduzeca");
        query.setParameter("idKonta", idKonta);
        query.setParameter("idPreduzeca", idPreduzeca);
        
        List<KontniOkvir> result = new ArrayList<KontniOkvir>();
        
        result = query.list();
    
        if (result.size() > 0)
            return true;
        else
            return false;
    }
    
}
