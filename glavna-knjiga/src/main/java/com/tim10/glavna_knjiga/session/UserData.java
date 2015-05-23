package com.tim10.glavna_knjiga.session;

import org.hibernate.Session;

import com.tim10.glavna_knjiga.hibernate.HibernateSessionManager;
import com.tim10.glavna_knjiga.mappings.*;

public class UserData {

	private static UserData instance = null;
	private static Korisnik korisnik;
	private static Preduzece preduzece;

	private static Session session = HibernateSessionManager.getSessionFactory().openSession();

	private UserData() {
            // NO INSTANTIATIOOON!!!
        }
        
	public static UserData getInstace() {
		if (instance == null) {
			instance = new UserData();
		}

		return instance;
	}

	public static Korisnik getKorisnik() {
		return korisnik;
	}

	public static void setKorisnik(Korisnik korisnik) {
		UserData.korisnik = korisnik;
	}

	public static Preduzece getPreduzece() {
		return preduzece;
	}

	public static void setPreduzece(Preduzece preduzece) {
		UserData.preduzece = preduzece;
	}
	
	
}
