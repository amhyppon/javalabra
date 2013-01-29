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
public class vuoroJUnitTest {
    
    rotu testiRotu1;
    ase testiAse1;
    haarniska testiHaarniska1;
    hahmo testiHahmo1;
    
    rotu testiRotu2;
    ase testiAse2;
    haarniska testiHaarniska2;
    hahmo testiHahmo2;
    
    public vuoroJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        testiRotu1 = new rotu("testiRodunNimi", 2, 2);
        testiAse1 = new ase("testiMiekka", "miekka");
        testiHaarniska1 = new haarniska("testiRaskasHaarniskan", -1, 2);
        testiHahmo1 = new hahmo("testiHahmonNimi", testiRotu1, testiHaarniska1, testiAse1);

        testiRotu2 = new rotu("testiRodunNimi", 2, 2);
        testiAse2 = new ase("testiKirves", "kirves");
        testiHaarniska2 = new haarniska("testiRaskasHaarniskan", -1, 2);
        testiHahmo2 = new hahmo("testiHahmonNimi", testiRotu2, testiHaarniska2, testiAse2);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testataanEnsimmaistaVuoroaJaVuoronVaihtoa() {
    
        vuoro.ensimmainenVuoro(testiHahmo1, testiHahmo2);
        
        vuoro.seuraavaVuoro();
        
        assertEquals(testiHahmo2, vuoro.kenenVuoro());
    }
}
