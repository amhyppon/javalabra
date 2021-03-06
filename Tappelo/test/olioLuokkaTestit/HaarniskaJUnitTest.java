package olioLuokkaTestit;

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
import olioLuokat.Haarniska;

/**
 *
 * @author Hyppönen
 */
public class HaarniskaJUnitTest {

    public HaarniskaJUnitTest() {
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
        String testiHaarniskanAnnettuNimi = "Haarniskan testinimi";
        int testiHaarniskanAnnettuKetteryys = -1;
        int testiHaarniskanAnnettuKestavyys = 2;
        Haarniska testiHaarniska = new Haarniska(testiHaarniskanAnnettuNimi, testiHaarniskanAnnettuKetteryys, testiHaarniskanAnnettuKestavyys);

        assertEquals(testiHaarniskanAnnettuNimi, testiHaarniska.getHaarniskanNimi());
        assertEquals(testiHaarniskanAnnettuKetteryys, testiHaarniska.getHaarniskanKetteryys());
        assertEquals(testiHaarniskanAnnettuKestavyys, testiHaarniska.getHaarniskanKestavyys());
    }
}
