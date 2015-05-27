/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tim10.glavna_knjiga.dbutils;

import com.tim10.glavna_knjiga.mappings.Korisnik;
import com.tim10.glavna_knjiga.mappings.Preduzece;
import java.util.ArrayList;
import java.util.Arrays;
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
        assertNotSame(expResult, result);
        
    }

    /**
     * Test of getAllKorisnikTipoviNazivi method, of class LoginPanelUtils.
     */
    public void testGetAllKorisnikTipoviNazivi() {
        System.out.println("getAllKorisnikTipoviNazivi");
        LoginPanelUtils instance = LoginPanelUtils.getInstace();
        List<String> expResult = new ArrayList();
        expResult.add("Administrator");
        expResult.add("Racunovodja");
        List<String> result = instance.getAllKorisnikTipoviNazivi();
        //assertEquals(expResult, result);
        Arrays.asList(result).containsAll(expResult);
    }

    /**
     * Test of isValidUsernamePasswordCombination method, of class LoginPanelUtils.
     */
    public void testIsValidUsernamePasswordCombination() {
        System.out.println("isValidUsernamePasswordCombination");
        String username = "tms1337";
        String password = "44253432";
        String userType = "Administrator";
        LoginPanelUtils instance = LoginPanelUtils.getInstace();
        Boolean expResult = true;
        Boolean result = instance.isValidUsernamePasswordCombination(username, password, userType);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getAllPreduzeca method, of class LoginPanelUtils.
     */
    public void testGetAllPreduzeca() {
        System.out.println("getAllPreduzeca");
        LoginPanelUtils instance = LoginPanelUtils.getInstace();
        List<String> expResult = new ArrayList();
        expResult.add("ocb");
        expResult.add("super-preduzece");
        List<String> result = instance.getAllPreduzeca();
        Arrays.asList(result).containsAll(expResult);
        
    }

    /**
     * Test of getKorisnikByUsername method, of class LoginPanelUtils.
     */
    public void testGetKorisnikByUsername() {
        System.out.println("getKorisnikByUsername");
        String username = "tms1337";
        LoginPanelUtils instance = LoginPanelUtils.getInstace();
        Korisnik expResult = new Korisnik();
        expResult.setIme("Faruk");
        
        Korisnik result = instance.getKorisnikByUsername(username);
        assertEquals(expResult.getIme(), result.getIme());
        
    }

    /**
     * Test of getPreduzeceByName method, of class LoginPanelUtils.
     */
    public void testGetPreduzeceByName() {
        System.out.println("getPreduzeceByName");
        String name = "ocb";
        LoginPanelUtils instance = LoginPanelUtils.getInstace();
        Preduzece expResult = new Preduzece();
        expResult.setOpis("lajk");
        Preduzece result = instance.getPreduzeceByName(name);
        assertEquals(expResult.getOpis(), result.getOpis());
        
    }
    
}
