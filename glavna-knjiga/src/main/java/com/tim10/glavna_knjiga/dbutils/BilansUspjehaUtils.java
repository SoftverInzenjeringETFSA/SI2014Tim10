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
	}}