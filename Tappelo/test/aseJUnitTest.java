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
import tappelo.olioLuokat.ase;

/**
 *
 * @author Hyppönen
 */
public class aseJUnitTest {
    
    public aseJUnitTest() {
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
    public void toimikoKonstruktoriOikein() {
        String testiAseenAnnettuNimi = "Aseen testinimi";
        ase testiAse = new ase(testiAseenAnnettuNimi);
        
        assertEquals(testiAseenAnnettuNimi, testiAse.getAseenNimi());
    }
}
