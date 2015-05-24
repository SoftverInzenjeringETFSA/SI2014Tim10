/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tim10.glavna_knjiga.dbutils;

import junit.framework.TestCase;

/**
 *
 * @author faruk
 */
public class KontniOkvirFrameViewUtilsTest extends TestCase {
    
    public KontniOkvirFrameViewUtilsTest(String testName) {
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
     * Test of getInstace method, of class KontniOkvirFrameViewUtils.
     */
    public void testGetInstace() {
        System.out.println("getInstace");
        KontniOkvirFrameViewUtils expResult = null;
        KontniOkvirFrameViewUtils result = KontniOkvirFrameViewUtils.getInstace();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllKontniOkvir method, of class KontniOkvirFrameViewUtils.
     */
    public void testGetAllKontniOkvir() {
        System.out.println("getAllKontniOkvir");
        KontniOkvirFrameViewUtils instance = null;
        Object[][] expResult = null;
        Object[][] result = instance.getAllKontniOkvir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllKontniOkvirByParameters method, of class KontniOkvirFrameViewUtils.
     */
    public void testGetAllKontniOkvirByParameters() {
        System.out.println("getAllKontniOkvirByParameters");
        String sifra = "";
        String naziv = "";
        KontniOkvirFrameViewUtils instance = null;
        Object[][] expResult = null;
        Object[][] result = instance.getAllKontniOkvirByParameters(sifra, naziv);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
