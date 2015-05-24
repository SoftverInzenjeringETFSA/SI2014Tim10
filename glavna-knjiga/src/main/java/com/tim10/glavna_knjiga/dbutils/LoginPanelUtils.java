/**
 * 
 */
package com.tim10.glavna_knjiga.dbutils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.*;

import com.tim10.glavna_knjiga.hibernate.*;
import com.tim10.glavna_knjiga.mappings.*;

/**
 * @author tim10
 *
 */
public class LoginPanelUtils {
	private static LoginPanelUtils instance = null;
	
	private static Session session = HibernateSessionManager.getSessionFactory().openSession();
	
	private LoginPanelUtils() {
		// NO INSTANTIATIOOON!!!
	}
	
	public static LoginPanelUtils getInstace() {
		if(instance == null) {
			instance = new LoginPanelUtils();
		}
		
		return instance;
	}
	
	public List<String> getAllKorisnikTipoviNazivi() {
		Query query = session.createQuery("select kt.naziv from KorisnikTipovi kt");	
		List<String> allKorisnikTipovi = query.list();
		
		return allKorisnikTipovi;
	}
	
	public Boolean isValidUsernamePasswordCombination(String username, String password, String userType) {
		Query query = session.createQuery("select k from Korisnik k where k.korisnickoIme=?");	
                query = query.setParameter(0,username); 
		List<Korisnik> matchingUsers = query.list();
		
		if(matchingUsers.size() == 0) {
			return false;
		}
		
		return password.equals((matchingUsers.get(0)).getLozinka()) && userType.equals(matchingUsers.get(0).getKorisnikTipovi().getNaziv());
	}
	
	public List<String> getAllPreduzeca() {
		Query query = session.createQuery("select p.naziv from Preduzece p");
		List<String> allPreduzeca = query.list();
		
		return allPreduzeca;
	}

	public Korisnik getKorisnikByUsername(String username) {
		Query query = session.createQuery("select k from Korisnik k where k.korisnickoIme=?'");
                query = query.setParameter(0,username);
		List<Korisnik> matchingKorisnikList = query.list();
		
		return matchingKorisnikList.get(0);
	}

	public Preduzece getPreduzeceByName(String name) {
		System.out.println("Preduzece name: " + name);
		
		Query query = session.createQuery("select p from Preduzece p where p.naziv=?");
                query = query.setParameter(0,name);
		List<Preduzece> matchingPreduzeceList = query.list();
		
		System.out.println("query result size: " + matchingPreduzeceList.size());
		
		return matchingPreduzeceList.get(0);
	}
}
