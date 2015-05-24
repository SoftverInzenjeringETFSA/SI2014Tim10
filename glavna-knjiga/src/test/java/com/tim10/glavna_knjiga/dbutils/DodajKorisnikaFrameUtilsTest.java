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
public class DodajKorisnikaFrameUtilsTest extends TestCase {
    
    public DodajKorisnikaFrameUtilsTest(String testName) {
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
     * Test of getInstace method, of class DodajKorisnikaFrameUtils.
     */
    public void testGetInstace() {
        System.out.println("getInstace");
        DodajKorisnikaFrameUtils expResult = null;
        DodajKorisnikaFrameUtils result = DodajKorisnikaFrameUtils.getInstace();
        assertNotSame(expResult, result);
    }

    /**
     * Test of getAllTipKorisnika method, of class DodajKorisnikaFrameUtils.
     */
    public void testGetAllTipKorisnika() {
        System.out.println("getAllTipKorisnika");
        DodajKorisnikaFrameUtils instance = null;
        List<String> expResult = null;
        List<String> result = instance.getAllTipKorisnika();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdNumber method, of class DodajKorisnikaFrameUtils.
     */
    public void testGetIdNumber() {
        System.out.println("getIdNumber");
        DodajKorisnikaFrameUtils instance = null;
        int expResult = 0;
        int result = instance.getIdNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ustekaj method, of class DodajKorisnikaFrameUtils.
     */
    public void testUstekaj() {
        System.out.println("ustekaj");
        Korisnik k = null;
        DodajKorisnikaFrameUtils instance = null;
        instance.ustekaj(k);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of istekaj method, of class DodajKorisnikaFrameUtils.
     */
    public void testIstekaj() {
        System.out.println("istekaj");
        Korisnik k = null;
        DodajKorisnikaFrameUtils instance = null;
        instance.istekaj(k);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
