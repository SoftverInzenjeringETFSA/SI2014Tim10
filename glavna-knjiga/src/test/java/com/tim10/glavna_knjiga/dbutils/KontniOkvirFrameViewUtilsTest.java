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
        assertNotSame(expResult, result);       
    }
    /**
     * Test of getAllKontniOkvir method, of class KontniOkvirFrameViewUtils.
     */
    public void testGetAllKontniOkvir() {
        System.out.println("getAllKontniOkvir");
        KontniOkvirFrameViewUtils instance = KontniOkvirFrameViewUtils.getInstace();
        Object[][] expResult = null;
        Object[][] result = instance.getAllKontniOkvir();
        assertEquals(823, result.length);
        
    }

    /**
     * Test of getAllKontniOkvirByParameters method, of class KontniOkvirFrameViewUtils.
     */
    public void testGetAllKontniOkvirByParameters() {
        System.out.println("getAllKontniOkvirByParameters");
        String sifra = "0";
        String naziv = "unijeti..."; //neko je bio kreativan pa je sva konta nazvao ovako :D
        KontniOkvirFrameViewUtils instance = KontniOkvirFrameViewUtils.getInstace();
        Object[][] expResult = null;
        Object[][] result = instance.getAllKontniOkvirByParameters(sifra, naziv);
        assertEquals(4, result.length); 
        //imaju 4 ova konta, vjerovatno je neko greskom dodao
        //jedan je napocetku, i preostala tri su na kraju spiska
        //moze se pogledati u bazi u tabeli kontniokvir
        
    }
    
}
