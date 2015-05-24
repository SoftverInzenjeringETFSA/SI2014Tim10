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
public class HomeFrameRacunovodjaUtilsTest extends TestCase {
    
    public HomeFrameRacunovodjaUtilsTest(String testName) {
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
     * Test of getInstace method, of class HomeFrameRacunovodjaUtils.
     */
    public void testGetInstace() {
        System.out.println("getInstace");
        HomeFrameRacunovodjaUtils expResult = null;
        HomeFrameRacunovodjaUtils result = HomeFrameRacunovodjaUtils.getInstace();
        assertNotSame(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
