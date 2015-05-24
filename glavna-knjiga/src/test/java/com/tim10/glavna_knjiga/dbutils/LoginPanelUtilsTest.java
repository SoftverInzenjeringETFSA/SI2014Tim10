/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tim10.glavna_knjiga.dbutils;

import com.tim10.glavna_knjiga.mappings.Korisnik;
import com.tim10.glavna_knjiga.mappings.Preduzece;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author faruk
 */
public class LoginPanelUtilsTest extends TestCase {
    
    public LoginPanelUtilsTest(String testName) {
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
     * Test of getInstace method, of class LoginPanelUtils.
     */
    public void testGetInstace() {
        System.out.println("getInstace");
        LoginPanelUtils expResult = null;
        LoginPanelUtils result = LoginPanelUtils.getInstace();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllKorisnikTipoviNazivi method, of class LoginPanelUtils.
     */
    public void testGetAllKorisnikTipoviNazivi() {
        System.out.println("getAllKorisnikTipoviNazivi");
        LoginPanelUtils instance = null;
        List<String> expResult = null;
        List<String> result = instance.getAllKorisnikTipoviNazivi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidUsernamePasswordCombination method, of class LoginPanelUtils.
     */
    public void testIsValidUsernamePasswordCombination() {
        System.out.println("isValidUsernamePasswordCombination");
        String username = "";
        String password = "";
        String userType = "";
        LoginPanelUtils instance = null;
        Boolean expResult = null;
        Boolean result = instance.isValidUsernamePasswordCombination(username, password, userType);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllPreduzeca method, of class LoginPanelUtils.
     */
    public void testGetAllPreduzeca() {
        System.out.println("getAllPreduzeca");
        LoginPanelUtils instance = null;
        List<String> expResult = null;
        List<String> result = instance.getAllPreduzeca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKorisnikByUsername method, of class LoginPanelUtils.
     */
    public void testGetKorisnikByUsername() {
        System.out.println("getKorisnikByUsername");
        String username = "";
        LoginPanelUtils instance = null;
        Korisnik expResult = null;
        Korisnik result = instance.getKorisnikByUsername(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPreduzeceByName method, of class LoginPanelUtils.
     */
    public void testGetPreduzeceByName() {
        System.out.println("getPreduzeceByName");
        String name = "";
        LoginPanelUtils instance = null;
        Preduzece expResult = null;
        Preduzece result = instance.getPreduzeceByName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
