/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tim10.glavna_knjiga.dbutils;

import com.tim10.glavna_knjiga.hibernate.HibernateSessionManager;
import com.tim10.glavna_knjiga.mappings.KontniOkvir;
import com.tim10.glavna_knjiga.mappings.KontniPlan;
import com.tim10.glavna_knjiga.mappings.Preduzece;
import java.util.List;
import java.util.Set;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author faruk
 */
public class KontniPlanIzmjenaUtils {
    private static KontniPlanIzmjenaUtils instance = null;
	
    private static Session session = HibernateSessionManager.getSessionFactory().openSession();

    private static Boolean setContainsKonto(KontniOkvir okvir, Set<KontniOkvir> set) {
        for(KontniOkvir setOkvir : set) {
            if(setOkvir.getId() == okvir.getId()) {
                return true;
            }
        }
        
        return false;
    }

    private KontniPlanIzmjenaUtils() {
            // NO INSTANTIATIOOON!!!
    }

    public static KontniPlanIzmjenaUtils getInstace() {
            if(instance == null) {
                    instance = new KontniPlanIzmjenaUtils();
            }

            return instance;
    }

    public static Object[][] getKontaBooleanList(String nazivPreduzeca) {
        Query query = session.createQuery("select ko from KontniOkvir ko");
        List<KontniOkvir> allKontniOkvir = query.list();
        
        Object[][] rowData = new Object[allKontniOkvir.size()][];
        
        // aaaaa SQL injj hejteriii
        Query preduzeceQuery = session.createQuery("select p from Preduzece p where p.naziv='" + nazivPreduzeca + "'");
        Preduzece preduzece = (Preduzece) preduzeceQuery.list().get(0);
        
        Set<KontniPlan> kontniPlanoviPreduzeca = preduzece.getKontniPlans();
        KontniPlan kontniPlanPreduzeca = kontniPlanoviPreduzeca.iterator().next();
        Set<KontniOkvir> kontniOkviriPreduzeca = kontniPlanPreduzeca.getKontniOkvirs();
        
        for(int i = 0; i < allKontniOkvir.size(); i++) {
            rowData[i] =
                new Object[] { allKontniOkvir.get(i).getBrojKonta(), allKontniOkvir.get(i).getNaziv(), setContainsKonto(allKontniOkvir.get(i), kontniOkviriPreduzeca) };
        }

        return rowData;
    }
    
    public static void commitData(Object[][] tableData) {
        for(Object[] row : tableData) {
            
        }
    }
}
