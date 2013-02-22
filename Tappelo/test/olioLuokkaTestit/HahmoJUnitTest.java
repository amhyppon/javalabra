package olioLuokkaTestit;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import olioLuokat.Ase;
import olioLuokat.Hahmo;
import olioLuokat.Haarniska;
import olioLuokat.Rotu;
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
public class HahmoJUnitTest {
    
    Rotu testiRotu;
    Ase testiAse;
    Haarniska testiHaarniska;
    Hahmo testiHahmo;
    
    public HahmoJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        testiRotu = new Rotu("testiRodunNimi", 2, 2);
        testiAse = new Ase("testiAseenNimi", "testiAseenLuokka");
        testiHaarniska = new Haarniska("testiHaarniskanNimi", -1, 2);
        testiHahmo = new Hahmo("testiHahmonNimi", testiRotu, testiHaarniska, testiAse);
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
        
        Haarniska testiHaarniska2 = new Haarniska("testiHaarniskanNimi2", 0, 1);
        
        testiHahmo.setHahmonHaarniska(testiHaarniska2);
        
        assertEquals("testiHaarniskanNimi2", testiHahmo.getHahmonHaarniska());
        assertEquals(2, testiHahmo.getHahmonKetteryys());
        assertEquals(3, testiHahmo.getHahmonKestavyys());
    }
    
    @Test
    public void testataanAseenVaihtoa() {
        
        Ase testiAse2 = new Ase("testiAseenNimi2", "testiAseenLuokka2");
        
        testiHahmo.setHahmonAse(testiAse2);
        
        assertEquals("testiAseenNimi2", testiHahmo.getHahmonAse());
        
    }
    
    @Test
    public void testataanToStringia() {
        System.out.println(testiHahmo.toString());
    }
}
