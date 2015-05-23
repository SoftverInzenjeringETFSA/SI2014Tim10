/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tim10.glavna_knjiga.dbutils;

import com.tim10.glavna_knjiga.hibernate.HibernateSessionManager;
import com.tim10.glavna_knjiga.mappings.KontniOkvir;
import com.tim10.glavna_knjiga.mappings.KontniPlan;
import java.util.List;
import java.util.Set;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author faruk
 */
public class KontniPlanUtils {
    private static KontniPlanUtils instance = null;

    private static Session session = HibernateSessionManager.getSessionFactory().openSession();

    private KontniPlanUtils() {
            // NO INSTANTIATIOOON!!!
    }

    public static KontniPlanUtils getInstace() {
            if(instance == null) {
                    instance = new KontniPlanUtils();
            }

            return instance;
    }

    public Object[][] getKontoListByName(String naziv) {
        Query query = session.createQuery("select kp from KontniPlan kp where kp.preduzece.naziv='" + naziv + "'");
        List<KontniPlan> allKontniPlan = query.list();
        
        System.out.println(allKontniPlan.size());
        
        if(allKontniPlan.size() == 0) {
            return null;
        }
        
        Object[][] rowData = new Object[allKontniPlan.size()][];
        
        Set<KontniOkvir> kontniOkvirs = allKontniPlan.get(0).getKontniOkvirs();
        System.out.println("kontni okvir size: " + kontniOkvirs.size());
        int i = 0;
        for(KontniOkvir okvir : kontniOkvirs) {
            rowData[i] = 
                    new Object[] { okvir.getBrojKonta().toString(), okvir.getNaziv() };
            ++i;
        }
        
        return rowData;
    }
}
