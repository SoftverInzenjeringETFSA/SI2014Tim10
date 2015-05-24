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
public class KontniPlanIzmjenaUtilsTest extends TestCase {
    
    public KontniPlanIzmjenaUtilsTest(String testName) {
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
     * Test of getInstace method, of class KontniPlanIzmjenaUtils.
     */
    public void testGetInstace() {
        System.out.println("getInstace");
        KontniPlanIzmjenaUtils expResult = null;
        KontniPlanIzmjenaUtils result = KontniPlanIzmjenaUtils.getInstace();
        assertNotSame(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getKontaBooleanList method, of class KontniPlanIzmjenaUtils.
     */
    public void testGetKontaBooleanList() {
        System.out.println("getKontaBooleanList");
        String nazivPreduzeca = "ocb";
        Object[][] expResult = null;
        Object[][] result = KontniPlanIzmjenaUtils.getKontaBooleanList(nazivPreduzeca);
        //Kontnih planova ima 823 
        assertEquals(result.length, 823);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
