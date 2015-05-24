/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tim10.glavna_knjiga.dbutils;

import javax.swing.table.DefaultTableModel;
import junit.framework.TestCase;

/**
 *
 * @author AADMIN
 */
public class HomeFrameAdminUtilsTest extends TestCase {
    
    public HomeFrameAdminUtilsTest(String testName) {
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
     * Test of getInstace method, of class HomeFrameAdminUtils.
     */
    public void testGetInstace() {
        System.out.println("getInstace");
        HomeFrameAdminUtils expResult = null;
        HomeFrameAdminUtils result = HomeFrameAdminUtils.getInstace();
        assertNotSame(expResult, result);
    }

    /**
     * Test of getAllKorisnici method, of class HomeFrameAdminUtils.
     */
    public void testGetAllKorisnici() {
        System.out.println("getAllKorisnici");
        HomeFrameAdminUtils instance = null;
        Object[][] expResult = null;
        Object[][] result = instance.getAllKorisnici();
        assertNotSame(expResult, result);
    }

    
    
}
