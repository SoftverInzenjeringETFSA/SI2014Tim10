/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tim10.glavna_knjiga.session;

import com.tim10.glavna_knjiga.mappings.Korisnik;
import com.tim10.glavna_knjiga.mappings.Preduzece;
import junit.framework.TestCase;

/**
 *
 * @author faruk
 */
public class UserDataTest extends TestCase {
    
    public UserDataTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getInstace method, of class UserData.
     */
    public void testGetInstace() {
        System.out.println("getInstace");
        UserData expResult = null;
        Korisnik k = new Korisnik();
        UserData.setKorisnik(k);
        UserData result = UserData.getInstace();
        assertNotSame(expResult, result);
        
    }

    /**
     * Test of getKorisnik method, of class UserData.
     */
    public void testGetKorisnik() {
        System.out.println("getKorisnik");
        Korisnik expResult = new Korisnik();
        
        Korisnik k = new Korisnik();
        expResult = k;
        k.setIme("Haris");
        UserData.setKorisnik(k);
        
        Korisnik result = UserData.getKorisnik();
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setKorisnik method, of class UserData.
     */
    public void testSetKorisnik() {
        System.out.println("setKorisnik");
        Korisnik korisnik = new Korisnik();
        korisnik.setIme("Haris");
        
        UserData.setKorisnik(korisnik);
        assertEquals("Haris",UserData.getKorisnik().getIme());
    }

    /**
     * Test of getPreduzece method, of class UserData.
     */
    public void testGetPreduzece() {
        System.out.println("getPreduzece");
        Preduzece expResult = null;
        Preduzece p = new Preduzece();
        p.setNaziv("Preduzece1");
        UserData.setPreduzece(p);
        Preduzece result = UserData.getPreduzece();
        assertEquals(p, result);
        
    }

    /**
     * Test of setPreduzece method, of class UserData.
     */
    public void testSetPreduzece() {
        System.out.println("setPreduzece");
        Preduzece preduzece = new Preduzece();
        preduzece.setNaziv("Preduzece2");
        UserData.setPreduzece(preduzece);
        assertNotSame(null,UserData.getPreduzece());
    }
    
}
