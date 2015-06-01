package com.tim10.glavna_knjiga.dbutils;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.tim10.glavna_knjiga.hibernate.HibernateSessionManager;
import com.tim10.glavna_knjiga.mappings.KontniOkvir;

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
	
	public Object[][] getAllKontniOkvir() {
            Query query = session.createQuery("select ko from KontniOkvir ko");
            List<KontniOkvir> allKontniOkvir = query.list();

            System.out.println(allKontniOkvir.size());

            Object[][] rowData = new Object[allKontniOkvir.size()][];

            for(int i = 0; i < allKontniOkvir.size(); i++) {
                    rowData[i] =
                        new Object[] { allKontniOkvir.get(i).getBrojKonta(), allKontniOkvir.get(i).getNaziv() };
            }

            return rowData;
	}

	public Object[][] getAllKontniOkvirByParameters(String sifra, String naziv) {
            Query query = session.createQuery(
                            "select ko from KontniOkvir ko where lower(ko.brojKonta) like '" + 
                            sifra.toLowerCase() + "%' and lower(ko.naziv) like '%" + 
                            naziv.toLowerCase() + "%'"
            );
            System.out.println(query.getQueryString());
            List<KontniOkvir> allKontniOkvir = query.list();

            System.out.println(allKontniOkvir.size());

            Object[][] rowData = new Object[allKontniOkvir.size()][];

            for(int i = 0; i < allKontniOkvir.size(); i++) {
                    rowData[i] =
                                    new Object[] { allKontniOkvir.get(i).getBrojKonta(), allKontniOkvir.get(i).getNaziv() };
            }

            return rowData;
	}
}
