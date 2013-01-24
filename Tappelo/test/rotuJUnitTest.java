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
import olioLuokat.rotu;

/**
 *
 * @author Hyppönen
 */
public class rotuJUnitTest {

    public rotuJUnitTest() {
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
        String testiRodunAnnettuNimi = "Rodun testinimi";
        int testiRodunAnnettuKetteryys = 2;
        int testiRodunAnnettuKestavyys = 2;
        rotu testiHaarniska = new rotu(testiRodunAnnettuNimi, testiRodunAnnettuKetteryys, testiRodunAnnettuKestavyys);

        assertEquals(testiRodunAnnettuNimi, testiHaarniska.getRodunNimi());
        assertEquals(testiRodunAnnettuKetteryys, testiHaarniska.getRodunKetteryys());
        assertEquals(testiRodunAnnettuKestavyys, testiHaarniska.getRodunKestavyys());
    }
}
