/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tim10.glavna_knjiga.dbutils;

import com.tim10.glavna_knjiga.mappings.Korisnik;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author mnuhodzic
 */
public class EditujKorisnikaFrameUtilsTest extends TestCase {
    
    public EditujKorisnikaFrameUtilsTest(String testName) {
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
     * Test of getInstace method, of class EditujKorisnikaFrameUtils.
     */
    public void testGetInstace() {
        System.out.println("getInstace");
        EditujKorisnikaFrameUtils expResult = null;
        EditujKorisnikaFrameUtils result = EditujKorisnikaFrameUtils.getInstace();
        assertNotSame(expResult, result);
    }

    /**
     * Test of getKorisnikPoJmbg method, of class EditujKorisnikaFrameUtils.
     */
    public void testGetKorisnikPoJmbg() {
        System.out.println("getKorisnikPoJmbg");
        int jmbg = 0;
        EditujKorisnikaFrameUtils instance = null;
        List<Korisnik> expResult = null;
        List<Korisnik> result = instance.getKorisnikPoJmbg(jmbg);
        assertNotSame(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getAllJmbg method, of class EditujKorisnikaFrameUtils.
     */
    public void testGetAllJmbg() {
        System.out.println("getAllJmbg");
        EditujKorisnikaFrameUtils instance = null;
        List<Integer> expResult = null;
        List<Integer> result = instance.getAllJmbg();
        assertNotSame(expResult, result);
    }

    /**
     * Test of SpasiPromjenu method, of class EditujKorisnikaFrameUtils.
     */
    public void testSpasiPromjenu() {
        System.out.println("SpasiPromjenu");
        Korisnik k =  new Korisnik();
        k.setIme("Muris");
        EditujKorisnikaFrameUtils instance = null;
        instance.SpasiPromjenu(k);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllTipKorisnika method, of class EditujKorisnikaFrameUtils.
     */
    public void testGetAllTipKorisnika() {
        System.out.println("getAllTipKorisnika");
        EditujKorisnikaFrameUtils instance = null;
        List<String> expResult = null;
        List<String> result = instance.getAllTipKorisnika();
        assertNotSame(expResult, result);
    }
    
}
