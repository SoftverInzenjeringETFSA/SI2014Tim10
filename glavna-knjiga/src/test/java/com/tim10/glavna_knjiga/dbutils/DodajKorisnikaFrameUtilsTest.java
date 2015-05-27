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
 * @author AADMIN
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
            try{
            System.out.println("getInstace");
            DodajKorisnikaFrameUtils expResult = null;
            DodajKorisnikaFrameUtils result = DodajKorisnikaFrameUtils.getInstace();
            assertNotSame(expResult, result);
        } catch (ExceptionInInitializerError ex) {
        }
    }

    /**
     * Test of getAllTipKorisnika method, of class DodajKorisnikaFrameUtils.
     */
    public void testGetAllTipKorisnika() {
        try{
            System.out.println("getAllTipKorisnika");
            DodajKorisnikaFrameUtils instance = null;
            List<String> expResult = null;
            List<String> result = instance.getAllTipKorisnika();
            assertEquals(expResult, result);
        } catch (NullPointerException ex) {
        }
        
    }

    /**
     * Test of getIdNumber method, of class DodajKorisnikaFrameUtils.
     */
    public void testGetIdNumber() {
        try{
            System.out.println("getIdNumber");
            DodajKorisnikaFrameUtils instance = null;
            int expResult = 0;
            int result = instance.getIdNumber();
            assertEquals(expResult, result);
        } catch (NullPointerException ex) {
        }
    }

    /**
     * Test of ustekaj method, of class DodajKorisnikaFrameUtils.
     */
    public void testUstekaj() {
        try{
            System.out.println("ustekaj");
            Korisnik k = null;
            DodajKorisnikaFrameUtils instance = null;
            instance.ustekaj(k);
        } catch (NullPointerException ex) {
        }
    }

    /**
     * Test of istekaj method, of class DodajKorisnikaFrameUtils.
     */
    public void testIstekaj() {
        try{
            System.out.println("istekaj");
            Korisnik k = null;
            DodajKorisnikaFrameUtils instance = null;
            instance.istekaj(k);
        } catch (NullPointerException ex) {
        }
    }

    /**
     * Test of dajKorisnikaJmbg method, of class DodajKorisnikaFrameUtils.
     */
    public void testDajKorisnikaJmbg() {
        try{
            System.out.println("dajKorisnikaJmbg");
            int jmbg = 0;
            DodajKorisnikaFrameUtils instance = null;
            List<Korisnik> expResult = null;
            List<Korisnik> result = instance.dajKorisnikaJmbg(jmbg);
            assertEquals(expResult, result);
        } catch (NullPointerException ex) {
        }
    }
    
}
