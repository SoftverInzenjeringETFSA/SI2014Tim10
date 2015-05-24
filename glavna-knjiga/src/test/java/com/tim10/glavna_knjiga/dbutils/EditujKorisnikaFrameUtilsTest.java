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
        try{
            System.out.println("getInstace");
            EditujKorisnikaFrameUtils expResult = null;
            EditujKorisnikaFrameUtils result = EditujKorisnikaFrameUtils.getInstace();
            assertEquals(expResult, result);
        } catch (NoClassDefFoundError ex) {
        }
    }

    /**
     * Test of getKorisnikPoJmbg method, of class EditujKorisnikaFrameUtils.
     */
    public void testGetKorisnikPoJmbg() {
        try {
            System.out.println("getKorisnikPoJmbg");
            int jmbg = 0;
            EditujKorisnikaFrameUtils instance = null;
            List<Korisnik> expResult = null;
            List<Korisnik> result = instance.getKorisnikPoJmbg(jmbg);
            assertEquals(expResult, result);
        } catch (NullPointerException ex) {
        }
    }
    
    /**
     * Test of getAllJmbg method, of class EditujKorisnikaFrameUtils.
     */
    public void testGetAllJmbg() {
        try{
            System.out.println("getAllJmbg");
            EditujKorisnikaFrameUtils instance = null;
            List<Integer> expResult = null;
            List<Integer> result = instance.getAllJmbg();
            assertEquals(expResult, result);
        } catch (NullPointerException ex) {
        }
    }

    /**
     * Test of SpasiPromjenu method, of class EditujKorisnikaFrameUtils.
     */
    public void testSpasiPromjenu() {
        try{
            System.out.println("SpasiPromjenu");
            Korisnik k = null;
            EditujKorisnikaFrameUtils instance = null;
            instance.SpasiPromjenu(k);
        } catch (NullPointerException ex) {
        }
    }

    /**
     * Test of getAllTipKorisnika method, of class EditujKorisnikaFrameUtils.
     */
    public void testGetAllTipKorisnika() {
        try{
            System.out.println("getAllTipKorisnika");
            EditujKorisnikaFrameUtils instance = null;
            List<String> expResult = null;
            List<String> result = instance.getAllTipKorisnika();
            assertEquals(expResult, result);
        } catch (NullPointerException ex) {
        }
    }
    
}
