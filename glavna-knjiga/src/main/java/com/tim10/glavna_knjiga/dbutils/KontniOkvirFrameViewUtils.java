package com.tim10.glavna_knjiga.dbutils;

import org.hibernate.Session;

import com.tim10.glavna_knjiga.hibernate.HibernateSessionManager;

public class KontniOkvirFrameViewUtils {
	private static KontniOkvirFrameViewUtils instance = null;
	
	private static Session session = HibernateSessionManager.getSessionFactory().openSession();
	
	private KontniOkvirFrameViewUtils() {
		// NO INSTANTIATIOOON!!!
	}
	
	public static KontniOkvirFrameViewUtils getInstace() {
		if(instance == null) {
			instance = new KontniOkvirFrameViewUtils();
		}
		
		return instance;
	}
}
