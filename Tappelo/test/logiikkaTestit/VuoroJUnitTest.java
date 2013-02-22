/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logiikkaTestit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import logiikka.*;
import olioLuokat.*;

/**
 *
 * @author Hyppönen
 */
public class VuoroJUnitTest {
    
    Rotu testiRotu1;
    Ase testiAse1;
    Haarniska testiHaarniska1;
    Hahmo testiHahmo1;
    
    Rotu testiRotu2;
    Ase testiAse2;
    Haarniska testiHaarniska2;
    Hahmo testiHahmo2;
    
    Vuoro testiVuoro;
    
    public VuoroJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        testiRotu1 = new Rotu("testiRodunNimi", 2, 2);
        testiAse1 = new Ase("testiMiekka", "miekka");
        testiHaarniska1 = new Haarniska("testiRaskasHaarniskan", -1, 2);
        testiHahmo1 = new Hahmo("testiHahmonNimi", testiRotu1, testiHaarniska1, testiAse1);

        testiRotu2 = new Rotu("testiRodunNimi", 2, 2);
        testiAse2 = new Ase("testiKirves", "kirves");
        testiHaarniska2 = new Haarniska("testiRaskasHaarniskan", -1, 2);
        testiHahmo2 = new Hahmo("testiHahmonNimi", testiRotu2, testiHaarniska2, testiAse2);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testataanEnsimmaistaVuoroaJaVuoronVaihtoa() {
    
        testiVuoro = new Vuoro(testiHahmo1, testiHahmo2);
        
        assertEquals(testiHahmo1, testiVuoro.getVuorossaOlevaHahmo());
        
        Vuoro.seuraavaVuoro();
        
        assertEquals(testiHahmo1, testiVuoro.getVuoroaOdottavaHahmo());
    }
}
