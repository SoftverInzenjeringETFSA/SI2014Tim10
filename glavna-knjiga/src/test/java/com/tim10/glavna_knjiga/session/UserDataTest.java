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
        UserData result = UserData.getInstace();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKorisnik method, of class UserData.
     */
    public void testGetKorisnik() {
        System.out.println("getKorisnik");
        Korisnik expResult = null;
        Korisnik result = UserData.getKorisnik();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKorisnik method, of class UserData.
     */
    public void testSetKorisnik() {
        System.out.println("setKorisnik");
        Korisnik korisnik = null;
        UserData.setKorisnik(korisnik);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPreduzece method, of class UserData.
     */
    public void testGetPreduzece() {
        System.out.println("getPreduzece");
        Preduzece expResult = null;
        Preduzece result = UserData.getPreduzece();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPreduzece method, of class UserData.
     */
    public void testSetPreduzece() {
        System.out.println("setPreduzece");
        Preduzece preduzece = null;
        UserData.setPreduzece(preduzece);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
