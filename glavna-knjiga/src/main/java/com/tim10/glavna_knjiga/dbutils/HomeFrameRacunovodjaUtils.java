package com.tim10.glavna_knjiga.dbutils;

import org.hibernate.Session;

import com.tim10.glavna_knjiga.hibernate.HibernateSessionManager;

public class HomeFrameRacunovodjaUtils {
private static HomeFrameRacunovodjaUtils instance = null;
	
	private static Session session = HibernateSessionManager.getSessionFactory().openSession();
	
	private HomeFrameRacunovodjaUtils() {
		// NO INSTANTIATIOOON!!!
	}
	
	public static HomeFrameRacunovodjaUtils getInstace() {
		if(instance == null) {
			instance = new HomeFrameRacunovodjaUtils();
		}
		
		return instance;
	}
	
	

}
