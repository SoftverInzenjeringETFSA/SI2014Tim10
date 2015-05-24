/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tim10.glavna_knjiga.hibernate;

import junit.framework.TestCase;
import org.hibernate.SessionFactory;

/**
 *
 * @author Hare
 */
public class HibernateSessionManagerTest extends TestCase {
    
    public HibernateSessionManagerTest(String testName) {
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
     * Test of getSessionFactory method, of class HibernateSessionManager.
     */
    public void testGetSessionFactory() {
        System.out.println("getSessionFactory");
        SessionFactory expResult = null;
        SessionFactory result = HibernateSessionManager.getSessionFactory();
        assertNotSame(expResult, result);
        
    }

    /**
     * Test of shutdown method, of class HibernateSessionManager.
     */
    public void testShutdown() {
        System.out.println("shutdown");
        HibernateSessionManager.shutdown();
        
    }
    
}
