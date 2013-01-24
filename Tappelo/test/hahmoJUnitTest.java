/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tappelo.olioLuokat.*;

/**
 *
 * @author Hyppönen
 */
public class hahmoJUnitTest {
    
    public hahmoJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testataanHahmonKonstruktoria() {
        
        rotu testiRotu = new rotu("testiRodunNimi", 2, 2);
        ase testiAse = new ase("testiAseenNimi");
        haarniska testiHaarniska = new haarniska("testiHaarniskanNimi", -1, 2);
        hahmo testiHahmo = new hahmo("testiHahmonNimi", testiRotu, testiHaarniska, testiAse);
    
        assertEquals("testiHahmonNimi", testiHahmo.getHahmonNimi());
        assertEquals("testiRodunNimi", testiHahmo.getHahmonRotu());
        assertEquals("testiAseenNimi", testiHahmo.getHahmonAse());
        assertEquals("testiHaarniskanNimi", testiHahmo.getHahmonHaarniska());
        assertEquals(1, testiHahmo.getHahmonKetteryys());
        assertEquals(4, testiHahmo.getHahmonKestavyys());
    }
}
