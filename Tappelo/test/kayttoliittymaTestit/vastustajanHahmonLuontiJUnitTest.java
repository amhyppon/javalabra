/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kayttoliittymaTestit;

import kayttoliittyma.*;
import olioLuokat.*;
import logiikka.*;
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
public class vastustajanHahmonLuontiJUnitTest {

    public vastustajanHahmonLuontiJUnitTest() {
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
    public void testataanVastustajanHahmonLuontia() {

        hahmo testiVastustajanHahmo = vastustajanHahmonLuonti.vastustajanHahmonLuonti();

        System.out.println(testiVastustajanHahmo.getHahmonNimi());
        System.out.println(testiVastustajanHahmo.getHahmonRodunNimi());
        System.out.println(testiVastustajanHahmo.getHahmonHaarniska());
        System.out.println(testiVastustajanHahmo.getHahmonAse());
    }
}
