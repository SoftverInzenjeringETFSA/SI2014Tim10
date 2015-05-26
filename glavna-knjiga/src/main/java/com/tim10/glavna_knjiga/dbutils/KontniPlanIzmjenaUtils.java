/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tim10.glavna_knjiga.dbutils;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.tim10.glavna_knjiga.hibernate.HibernateSessionManager;
import com.tim10.glavna_knjiga.mappings.KontniOkvir;
import com.tim10.glavna_knjiga.mappings.KontniPlan;
import com.tim10.glavna_knjiga.mappings.Preduzece;
import com.tim10.glavna_knjiga.session.UserData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author faruk
 */
public class KontniPlanIzmjenaUtils {
    private static KontniPlanIzmjenaUtils instance = null;
	
    private static Session session = HibernateSessionManager.getSessionFactory().openSession();

    private static Boolean setContainsKonto(KontniOkvir okvir, Set<KontniOkvir> set) {
        for(KontniOkvir setOkvir : set) {
            if(setOkvir.getId().equals(okvir.getId())) {
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
        Query preduzeceQuery = session.createQuery("select p from Preduzece p where p.naziv=?");
        preduzeceQuery = preduzeceQuery.setParameter(0,nazivPreduzeca); 
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
    
    public static void commitData(Object[][] tableData) throws ClassNotFoundException, SQLException {
        // ad-hoc, hibernate not workiing... ne radi me hajbernejttt
        
        Class.forName("com.mysql.jdbc.Driver") ;
        Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Tim10", "root", "root");
        
        int kontniPlanId = UserData.getPreduzece().getKontniPlans().iterator().next().getIdKontniPlan();
        
        // deleting all kontos
        String deleteQuery = "delete from KontniPlan_has_KontniOkvir where KontniPlan_IdKontniPlan = ?";
        PreparedStatement deletePreparedStmt = conn.prepareStatement(deleteQuery);
        deletePreparedStmt.setInt(1, kontniPlanId);
        deletePreparedStmt.execute();

        for(Object[] row : tableData) {
            if((Boolean)(row[2])) {
                System.out.println(row[0].toString());
                // the mysql insert statement
                String query = " insert into KontniPlan_has_KontniOkvir (KontniPlan_IdKontniPlan, KontniOkvir_Id)"
                  + " values (?, ?)";

                // create the mysql insert preparedstatement
                PreparedStatement preparedStmt = conn.prepareStatement(query);
                preparedStmt.setInt(2, Integer.parseInt(row[0].toString()));
                preparedStmt.setInt(1, kontniPlanId);
                preparedStmt.execute();
            }
        }
        
        
        /*
        Statement stmt = (Statement) conn.createStatement() ;
        String query = "select * from KontniPlan_has_KontniOkvir;";
        ResultSet rs = stmt.executeQuery(query);
        rs.first();
        System.out.println(rs.getLong(1));
        */
    }
}
