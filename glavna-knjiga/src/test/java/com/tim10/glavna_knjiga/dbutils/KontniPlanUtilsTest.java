/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tim10.glavna_knjiga.dbutils;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        assertNotSame(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getKontoListByName method, of class KontniPlanUtils.
     */
    public void testGetKontoListByName() {
        System.out.println("getKontoListByName");
        String naziv = "ocb";
        KontniPlanUtils instance = KontniPlanUtils.getInstace();
        Object[][] expResult = null;
        Object[][] result = instance.getKontoListByName(naziv);
        
        assertEquals(2, result.length);
    }

    /**
     * Test of getKontoListByParameters method, of class KontniPlanUtils.
     */
    public void testGetKontoListByParameters() {
        System.out.println("getKontoListByParameters");
        String naziv = "ocb";
        String sifraKonta = "1";
        String nazivKonta = "Moj kontni planic";
        KontniPlanUtils instance = KontniPlanUtils.getInstace();
        Object[][] expResult = null;
        Object[][] result = null;
        try {
            try {
                result = instance.getKontoListByParameters(naziv, sifraKonta, nazivKonta);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(KontniPlanUtilsTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KontniPlanUtilsTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(2, result.length);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
