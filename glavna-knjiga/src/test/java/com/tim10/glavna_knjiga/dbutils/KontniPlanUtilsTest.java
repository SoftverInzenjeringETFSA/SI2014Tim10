/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tim10.glavna_knjiga.dbutils;

import junit.framework.TestCase;

/**
 *
 * @author Hare
 */
public class KontniPlanUtilsTest extends TestCase {
    
    public KontniPlanUtilsTest(String testName) {
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
     * Test of getInstace method, of class KontniPlanUtils.
     */
    public void testGetInstace() {
        System.out.println("getInstace");
        KontniPlanUtils expResult = null;
        KontniPlanUtils result = KontniPlanUtils.getInstace();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKontoListByName method, of class KontniPlanUtils.
     */
    public void testGetKontoListByName() {
        System.out.println("getKontoListByName");
        String naziv = "";
        KontniPlanUtils instance = null;
        Object[][] expResult = null;
        Object[][] result = instance.getKontoListByName(naziv);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKontoListByParameters method, of class KontniPlanUtils.
     */
    public void testGetKontoListByParameters() {
        System.out.println("getKontoListByParameters");
        String naziv = "";
        String sifraKonta = "";
        String nazivKonta = "";
        KontniPlanUtils instance = null;
        Object[][] expResult = null;
        Object[][] result = instance.getKontoListByParameters(naziv, sifraKonta, nazivKonta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
