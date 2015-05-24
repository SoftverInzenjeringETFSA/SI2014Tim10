/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tim10.glavna_knjiga.dbutils;

import com.tim10.glavna_knjiga.hibernate.HibernateSessionManager;
import org.hibernate.Session;
import com.tim10.glavna_knjiga.mappings.Korisnik;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Transaction;

/**
 *
 * @author ZUGOR
 */
public class BilansStanjaUtils {
    private static BilansStanjaUtils instance = null;
    
    private static Session session = HibernateSessionManager.getSessionFactory().openSession();
    
    private BilansStanjaUtils() {
		// NO INSTANTIATIOOON!!!
        }
    
    public static BilansStanjaUtils getInstace() {
		if(instance == null) {
			instance = new BilansStanjaUtils();
		}
		
		return instance;
    }}