package olioLuokkaTestit;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import olioLuokat.ase;
import olioLuokat.hahmo;
import olioLuokat.haarniska;
import olioLuokat.rotu;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hyppönen
 */
public class hahmoJUnitTest {
    
    rotu testiRotu;
    ase testiAse;
    haarniska testiHaarniska;
    hahmo testiHahmo;
    
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
        
        testiRotu = new rotu("testiRodunNimi", 2, 2);
        testiAse = new ase("testiAseenNimi", "testiAseenLuokka");
        testiHaarniska = new haarniska("testiHaarniskanNimi", -1, 2);
        testiHahmo = new hahmo("testiHahmonNimi", testiRotu, testiHaarniska, testiAse);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testataanHahmonKonstruktoria() {
        
        assertEquals("testiHahmonNimi", testiHahmo.getHahmonNimi());
        assertEquals("testiRodunNimi", testiHahmo.getHahmonRodunNimi());
        assertEquals("testiAseenNimi", testiHahmo.getHahmonAse());
        assertEquals("testiHaarniskanNimi", testiHahmo.getHahmonHaarniska());
        assertEquals(1, testiHahmo.getHahmonKetteryys());
        assertEquals(4, testiHahmo.getHahmonKestavyys());
    }
    
    @Test
    public void testataanOsumaMetodia() {
        
        testiHahmo.osuma(1);
        
        assertEquals(3, testiHahmo.getHahmonKestavyys());
    }
    
    @Test
    public void testataanHaarniskanVaihtoa() {
        
        haarniska testiHaarniska2 = new haarniska("testiHaarniskanNimi2", 0, 1);
        
        testiHahmo.setHahmonHaarniska(testiHaarniska2);
        
        assertEquals("testiHaarniskanNimi2", testiHahmo.getHahmonHaarniska());
        assertEquals(2, testiHahmo.getHahmonKetteryys());
        assertEquals(3, testiHahmo.getHahmonKestavyys());
    }
    
    @Test
    public void testataanAseenVaihtoa() {
        
        ase testiAse2 = new ase("testiAseenNimi2", "testiAseenLuokka2");
        
        testiHahmo.setHahmonAse(testiAse2);
        
        assertEquals("testiAseenNimi2", testiHahmo.getHahmonAse());
        
    }
    
    @Test
    public void testataanToStringia() {
        System.out.println(testiHahmo.toString());
    }
}
