/**
 * 
 */
package com.tim10.glavna_knjga.dbutils;

import java.util.List;

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
		List<String> listAllKorisnikTipovi = query.list();
		
		return listAllKorisnikTipovi;
	}
	
	public Boolean isValidUsernamePasswordCombination(String username, String password) {
		Query query = session.createQuery("select k.lozinka from Korisnik k where k.korisnickoIme='" + username + "'");	
		List<String> real_password_list = query.list();
		
		if(real_password_list.size() == 0) {
			return false;
		}
		
		return password.equals(real_password_list.get(0));
	}
}
